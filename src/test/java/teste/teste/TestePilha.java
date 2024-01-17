package teste.teste;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestePilha {

    private Pilha p;

    @BeforeEach
    public void inicializaPilha() {
        p = new Pilha(10);
    }

    @Test
    public void pilhaVazia() {
        assertTrue(p.estaVazia());
        assertEquals(0, p.tamanho());
    }

    @Test
    public void EmpilhaUmElemento() {
        p.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
    }

    @Test
    public void empilhaDesempilha() {
        p.empilha("primeiro");
        p.empilha("segundo");
        assertEquals(2, p.tamanho());
        assertEquals("segundo", p.topo());
        Object desempilhado = p.desmepilha();
        assertEquals(1, p.tamanho());
        assertEquals("primeiro", p.topo());
        assertEquals("segundo", desempilhado);
    }

    @Test
    public void removeDaPilhaVazia() {
        try {
            p.desmepilha();
        } catch (Exception e) {

        }
    }

    @Test
    public void adicionaNaPilhaCheia() {
        for (int i = 0; i < 10; i++) {
            p.empilha("elemento" + i);
        }
        try {
            p.empilha("cheio");
            fail();
        } catch (PilhaCheiaException e) {

        }
    }
}

