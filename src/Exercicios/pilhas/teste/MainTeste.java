package Exercicios.pilhas.teste;

import Exercicios.pilhas.Pilha;

public class MainTeste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha();
        pilha.init();
        pilha.push(11);
        pilha.push(22);
        pilha.push(33);
        pilha.push(44);
        pilha.push(55);
        pilha.push(66);
        pilha.push(77);

        System.out.println("[ Valor no topo da pilha:  " + pilha.top()+" ]");
        for (int i = 0; i < 7; i++) {

            if (pilha.isEmpty()) {
                System.out.println("[!] STACK IS EMPTY [!]");
            } else {
                System.out.println("- Valor retirado  " + pilha.pop());
            }
            pilha.emptyStack();
        }
    }
}
