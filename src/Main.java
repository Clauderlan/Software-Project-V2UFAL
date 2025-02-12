
import Entities.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        List<Voo> voos = new ArrayList<>();

        Aviao aviao1 = new Aviao("Boeing 737", 180, 2000.0f, 23.0f, 80.0f);
        Aviao aviao2 = new Aviao("Airbus A320", 160, 1800.0f, 25.0f, 85.0f);
        Aviao aviao3 = new Aviao("Embraer E195", 120, 1500.0f, 20.0f, 75.0f);

        voos.add(new Voo(aviao1, 101, 300.0f, 50.0f, "Brasília", "Rio de Janeiro", "11:23AM", "12:24AM"));
        voos.add(new Voo(aviao2, 202, 350.0f, 55.0f, "Brasília", "Salvador", "10:24AM", "12:30AM"));
        voos.add(new Voo(aviao3, 303, 280.0f, 45.0f, "Brasília", "Porto Alegre", "08:12AM", "09:23AM"));


        System.out.println("Sistema de Avião\n");
        System.out.println("1 - Pesquisa de Voo\n" +
                "2 - Atualizações do Status de Voo\n" +
                "3 - Informações Sobre Bagagem");
        Scanner scan = new Scanner(System.in);

        int menu = scan.nextInt();

        if(menu == 1){
            voos.forEach(Voo::toString); // Mudar retorno para Void posteriormente.
        }else if(menu == 2){
            System.out.println("Digite o código do Voo: ");
            int codVoo = scan.nextInt();
            AtomicInteger validador = new AtomicInteger();
            voos.forEach(voo -> {
                int codVooCompare = voo.getNumeroVoo();
                if(codVooCompare == codVoo) {
                    System.out.println(voo.toString());
                    validador.set(1); // Parar ao achar, posteriormente.
                }
            });
            if(validador.get() == 0) System.out.println("Voo não encontrado.");
        }
        else if(menu == 3){
            System.out.println("Digite o código do Voo para obter mais informações: ");
            int codVoo = scan.nextInt();
            AtomicInteger validador = new AtomicInteger();
            voos.forEach(voo -> {
                int codVooCompare = voo.getNumeroVoo();
                if(codVooCompare == codVoo) {
                    voo.infoBagagem();
                    validador.set(1); // Parar ao achar, posteriormente.
                }
            });
            if(validador.get() == 0) System.out.println("Voo não encontrado.");
        }

    }
}