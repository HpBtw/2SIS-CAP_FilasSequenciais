package test;

import domain.FilaInt;

public class Main {
    public static void main(String[] args) {
        FilaInt fila = new FilaInt();

        fila.init();
        fila.enqueue(23);
        fila.enqueue(66);
        fila.enqueue(17);
        fila.enqueue(99);

        if(!fila.isEmpty())
            System.out.println("Valor no inicio da fila: " + fila.first());
        else
            System.out.println("Empty queue!");
        if(!fila.isEmpty())
            System.out.println("Valor retirado da fila: " + fila.dequeue());
        else
            System.out.println("Empty queue!");
        if(!fila.isEmpty())
            System.out.println("Valor retirado da fila: " + fila.dequeue());
        else
            System.out.println("Empty queue!");
        if(!fila.isEmpty())
            System.out.println("Valor retirado da fila: " + fila.dequeue());
        else
            System.out.println("Empty queue!");
    }
}