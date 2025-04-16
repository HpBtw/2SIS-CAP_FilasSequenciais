package ex3;

import domain.FilaInt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        FilaInt fila = new FilaInt();

        fila.init();

        int opcao;

        do {
            System.out.println("\n1. Inserir um aluno na fila");
            System.out.println("2. Retirar um aluno da fila");
            System.out.println("3. Encerra o atendimento");
            System.out.print("Informe a opção: ");

            opcao = kb.nextInt();

            switch(opcao) {
                case 1:
                    System.out.print("Informe o RM do aluno: ");
                    int rm = kb.nextInt();
                    fila.enqueue(rm);
                    break;
                case 2:
                    if (fila.isEmpty())
                        System.err.println("Fila vazia!");
                    else
                        System.out.println("RM retirado: " + fila.dequeue());
                    break;
                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("\nOperação finalizada!");
                    }
                    else {
                        System.err.println("A fila ainda não está vazia");
                        opcao = 0;
                    }
                    break;
            }

        } while (opcao != 3);
    }
}
