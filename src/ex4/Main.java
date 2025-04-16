package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        FilaInt fila = new FilaInt();

        int opcao = 0;
        int pid = 0;
        int temp = 0;
        int confirmacao = 0;

        do {
            System.out.println("\n1. Submeter processo");
            System.out.println("2. Processar (retirada)");
            System.out.println("3. Checar PID dos processos na fila");
            System.out.println("4. Encerrar programa");
            System.out.print("\nInforme uma opção: ");
            opcao = kb.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o PID do processo à ser submetido: ");
                    pid = kb.nextInt();
                    fila.enqueue(pid);
                    break;
                case 2:
                    temp = fila.dequeue();
                    System.out.println("Retirada no processo de valor '" + temp + "'...");
                    System.out.println("Esse processo foi finalizado?\n1. Sim\n2. Não");
                    System.out.print("Informe a opção: ");
                    confirmacao = kb.nextInt();
                    if (confirmacao == 1) {
                        System.out.println("Processo retirado da fila!");
                    } else if (confirmacao == 2) {
                        System.out.println("Processo reencaminhado para o começo da fila");
                        fila.enqueue(temp);
                    } else {
                        System.err.println("Opcão inválida, reiniciando menu...");
                    }
                    break;
                case 3:
                    System.out.println(fila.print());
                    break;
                case 4:
                    if (fila.isEmpty()) {
                        System.out.println("Operação finalizada!");
                    }
                    else {
                        System.err.println("Ainda há processos na fila!");
                        opcao = 0;
                    }
                break;
                default:
                    System.err.println("Opção invalida!");
                    break;
            }
        } while (opcao != 4);
    } //
}
