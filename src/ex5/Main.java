package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        FilaString fila = new FilaString();

        int opcao;
        int confirmacao;
        String paciente;
        String temp;

        do {
            System.out.println("\n1. Inserir um paciente à fila");
            System.out.println("2. Retirar um paciente da fila");
            System.out.println("3. Checar pacientes na fila");
            System.out.println("4. Encerrar programa");
            System.out.print("\nInforme uma opção: ");
            opcao = kb.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("\nInforme o nome do paciente: ");
                    paciente = kb.next();
                    fila.enqueue(paciente);
                    break;
                case 2:
                    paciente = fila.dequeue();
                    System.out.println("Paciente '" + paciente + "' foi retirado da fila!");
                    break;
                case 3:
                    System.out.println(fila.print());
                    break;
                case 4:
                    if (fila.isEmpty()) {
                        System.out.println("Operação finalizada!");
                    }
                    else {
                        System.out.println("Ainda há pacientes na fila! Deseja retirá-los forçadamente?");
                        System.out.println("1. Sim\n2. Não");
                        confirmacao = kb.nextInt();
                        if (confirmacao == 1) {
                            while (!fila.isEmpty()) {
                                fila.dequeue();
                            }
                            System.out.println("Operação finalizada!");
                        } else {
                            opcao = 0;
                        }
                    }
                    break;
                default:
                    System.err.println("Opção invalida!");
                    break;
            }
        } while (opcao != 4);

    }
}
