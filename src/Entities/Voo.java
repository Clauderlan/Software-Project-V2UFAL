package Entities;

public class Voo {
    private Aviao aviao;
    private Integer numeroVoo;
    private Float precoVoo;
    private Float taxaBagagemUltrapassada;
    private String origem;
    private String destino;
    private String horarioDePartida; // Mudar para Date posteriormente
    private String horarioDeChegada; // Mudar para Date posteriormente

    @Override
    public String toString() {
        System.out.println("Voo{" +
                "aviao=" + aviao.toString() +
                ", numeroVoo=" + numeroVoo +
                ", precoVoo=" + precoVoo +
                ", taxaBagagemUltrapassada=" + taxaBagagemUltrapassada +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", horarioDePartida='" + horarioDePartida + '\'' +
                ", horarioDeChegada='" + horarioDeChegada + '\'' +
                '}');
        return "";
    }

    public Voo(Aviao aviao, Integer numeroVoo, Float precoVoo, Float taxaBagagemUltrapassada, String origem, String destino, String horarioDePartida, String horarioDeChegada) {
        this.aviao = aviao;
        this.numeroVoo = numeroVoo;
        this.precoVoo = precoVoo;
        this.taxaBagagemUltrapassada = taxaBagagemUltrapassada;
        this.origem = origem;
        this.destino = destino;
        this.horarioDePartida = horarioDePartida;
        this.horarioDeChegada = horarioDeChegada;
    }
    public void infoBagagem(){
        System.out.println("Neste Voo é cobrado uma taxa de " +
                this.getTaxaBagagemUltrapassada() + "R$ por KG ultrapassado do valor permitido.\n" +
                "Sendo o valor permitido: " +
                this.aviao.getPesoMaxPorBagagemPessoa() + "KG"
        );
    }
    public String getAviao() {
        return aviao.toString();
    }

    public void setAviao(Aviao aviao) {
        this.aviao = aviao;
    }

    public Integer getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(Integer numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public Float getPrecoVoo() {
        return precoVoo;
    }

    public void setPrecoVoo(Float precoVoo) {
        this.precoVoo = precoVoo;
    }

    public Float getTaxaBagagemUltrapassada() {
        return taxaBagagemUltrapassada;
    }

    public void setTaxaBagagemUltrapassada(Float taxaBagagemUltrapassada) {
        this.taxaBagagemUltrapassada = taxaBagagemUltrapassada;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHorarioDePartida() {
        return horarioDePartida;
    }

    public void setHorarioDePartida(String horarioDePartida) {
        this.horarioDePartida = horarioDePartida;
    }

    public String getHorarioDeChegada() {
        return horarioDeChegada;
    }

    public void setHorarioDeChegada(String horarioDeChegada) {
        this.horarioDeChegada = horarioDeChegada;
    }
}
