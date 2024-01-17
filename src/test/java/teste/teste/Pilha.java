package teste.teste;

import org.junit.jupiter.api.Test;

public class Pilha {

    private Object [] elementos;
    private int quantidade = 0;

    public Pilha(int maximo) {
        elementos = new Object[maximo];
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }
    public int tamanho() {
        return quantidade;
    }
    public void empilha(Object elemento) {
        this.elementos[quantidade] = elemento;
        quantidade++;
    }
    public Object topo() {
        return elementos[quantidade-1];
    }

    public Object desmepilha() {
        if(estaVazia())
            throw new PilhaVaziaException("Não e possivel desempilhar");
        Object topo = topo();
        quantidade --;
        return topo;
    }


}
