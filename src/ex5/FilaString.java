package ex5;

public class FilaString {
    final int N = 3;
    String[] dados = new String[N];
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

    public void enqueue(String elem) {
        if(isFull()) {
            System.err.println("Full queue!");
        } else {
            dados[fim] = elem;
            cont++;
            fim = (fim + 1) % N;
            System.out.println("Adicionado!");
        }
    }

    public String dequeue() {
        String elem = dados[inicio];
        cont--;
        inicio = (inicio + 1) % N;
        return elem;
    }

    public String first() {
        return dados[inicio];
    }

    public String print() {
        String aux = "\nPacientes na fila: ";
        for (int i = 0; i < fim; i++) {
            aux += dados[i] + ", ";
        }

        return aux;
    }
}
