package domain;

public class FilaInt {
    final int N = 3;
    int[] dados = new int[N];
    int inicio, fim, cont;

    public void init() {
        inicio = fim = cont = 0;
    }

    public boolean isEmpty() { // caso contador = 0, retorna true (valor inicial da variavel)
        return (cont == 0);
    }

    public boolean isFull() { // caso contador = N (limite de dados), retorna true (valor inicial da variavel)
        return (cont == N);
    }

    public void enqueue(int elem) {
        if(isFull()) {
            System.out.println("Full queue!");
        } else {
            dados[fim] = elem;
            cont++;
            fim = (fim + 1) % N;
        }
    }

    public int dequeue() {
        int elem = dados[inicio];
        cont--;
        inicio = (inicio + 1) % N;
        return elem;
    }

    public int first() {
        return dados[inicio];
    }
}
