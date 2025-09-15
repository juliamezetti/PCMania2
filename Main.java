package PCmania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Cliente cliente = new Cliente("Julia Mezetti Dias", "Engenharia de Produção", "118"); // Meus dados
        Computador[] compras = new Computador[10];
        int qtdCompras = 0;


        Computador promo1 = new Computador("Apple", 123456,
                new HardwareBasico("Pentium Core i3", 2200, 0),
                new HardwareBasico("Memória RAM", 0, 8),
                new HardwareBasico("HD", 500, 0),
                new SistemaOperacional("macOS Sequoia", 64),
                new MemoriaUSB("Pen-drive", 16));

        Computador promo2 = new Computador("Samsung", 123456 + 1234,
                new HardwareBasico("Pentium Core i5", 3370, 0),
                new HardwareBasico("Memória RAM", 0, 16),
                new HardwareBasico("HD", 1000, 0),
                new SistemaOperacional("Windows 8", 64),
                new MemoriaUSB("Pen-drive", 32));

        Computador promo3 = new Computador("Dell", 123456 + 5678,
                new HardwareBasico("Pentium Core i7", 4500, 0),
                new HardwareBasico("Memória RAM", 0, 32),
                new HardwareBasico("HD", 2000, 0),
                new SistemaOperacional("Windows 10", 64),
                new MemoriaUSB("HD Externo", 1000));

        int opcao;
        do {
            System.out.println("\n=== MENU DE COMPRAS ===");
            System.out.println("1 - Promoção Apple");
            System.out.println("2 - Promoção Samsung");
            System.out.println("3 - Promoção Dell");
            System.out.println("0 - Finalizar compras");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            if (opcao == 1) compras[qtdCompras++] = promo1;
            else if (opcao == 2) compras[qtdCompras++] = promo2;
            else if (opcao == 3) compras[qtdCompras++] = promo3;

            if (opcao != 0) {
                System.out.println("\n--- Produtos já escolhidos ---");
                for (int i = 0; i < qtdCompras; i++) {
                    System.out.println((i + 1) + " - " + compras[i].getMarca() + " (R$ " + compras[i].getPreco() + ")");
                }
            }

        } while (opcao != 0);

        System.out.println("\n=== RESUMO DA COMPRA ===");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Curso: " + cliente.getCurso());
        System.out.println("Matrícula: " + cliente.getMatricula());

        double total = 0;
        for (int i = 0; i < qtdCompras; i++) {
            compras[i].mostraPCConfigs();
            total += compras[i].getPreco();
        }

        System.out.println("\nTotal da compra: R$ " + total);

        ProcessarPedido.enviarPedido(compras, qtdCompras);

        sc.close();
    }
}
