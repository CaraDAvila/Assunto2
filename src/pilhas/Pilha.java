package pilhas;

public class Pilha {
    final int N = 6;
    int dados[] = new int[N];
    int topo;

    public void init() {
        topo = 0;
    }

    public boolean isEmpty() {
        return (topo == 0);
    }

    public boolean isFull() {
        return (topo == N);
    }

    public void push(int elem) {
        if (isFull()) {
            System.out.println("[!] STACK OVERFLOW [!]");
        } else {
            dados[topo] = elem;
            topo++;
        }

    }

    public int pop() {


        topo--;
        return dados[topo];
    }
}
