package Entities;

public class Aviao {

    private String modelo;
    private Integer numeroMaxPessoas;
    private Float pesoMaxBagagem;
    private Float pesoMaxPorBagagemPessoa;
    private Float pesoMaxPorPessoa;
    private Float pesoMaxTotalPessoa;
    // Adicionar posteriormente informações sobre Manutenção etc..


    @Override
    public String toString() {
        return "Aviao{" +
                "modelo='" + modelo + '\'' +
                ", numeroMaxPessoas=" + numeroMaxPessoas +
                ", pesoMaxBagagem=" + pesoMaxBagagem +
                ", pesoMaxPorBagagemPessoa=" + pesoMaxPorBagagemPessoa +
                ", pesoMaxPorPessoa=" + pesoMaxPorPessoa +
                ", pesoMaxTotalPessoa=" + pesoMaxTotalPessoa +
                '}';
    }

    public Aviao(String modelo, Integer numeroMaxPessoas, Float pesoMaxBagagem, Float pesoMaxPorBagagemPessoa, Float pesoMaxPorPessoa) {
        this.modelo = modelo;
        this.numeroMaxPessoas = numeroMaxPessoas;
        this.pesoMaxBagagem = pesoMaxBagagem;
        this.pesoMaxPorBagagemPessoa = pesoMaxPorBagagemPessoa;
        this.pesoMaxPorPessoa = pesoMaxPorPessoa;
        this.pesoMaxTotalPessoa = this.numeroMaxPessoas * this.pesoMaxPorPessoa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getNumeroMaxPessoas() {
        return numeroMaxPessoas;
    }

    public void setNumeroMaxPessoas(Integer numeroMaxPessoas) {
        this.numeroMaxPessoas = numeroMaxPessoas;
    }

    public Float getPesoMaxBagagem() {
        return pesoMaxBagagem;
    }

    public void setPesoMaxBagagem(Float pesoMaxBagagem) {
        this.pesoMaxBagagem = pesoMaxBagagem;
    }

    public Float getPesoMaxPorBagagemPessoa() {
        return pesoMaxPorBagagemPessoa;
    }

    public void setPesoMaxPorBagagemPessoa(Float pesoMaxPorBagagemPessoa) {
        this.pesoMaxPorBagagemPessoa = pesoMaxPorBagagemPessoa;
    }

    public Float getPesoMaxPorPessoa() {
        return pesoMaxPorPessoa;
    }

    public void setPesoMaxPorPessoa(Float pesoMaxPorPessoa) {
        this.pesoMaxPorPessoa = pesoMaxPorPessoa;
    }

    public Float getPesoMaxTotalPessoa() {
        return pesoMaxTotalPessoa;
    }

    public void setPesoMaxTotalPessoa(Float pesoMaxTotalPessoa) {
        this.pesoMaxTotalPessoa = pesoMaxTotalPessoa;
    }
}
