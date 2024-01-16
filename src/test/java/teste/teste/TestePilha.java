package teste.teste;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestePilha {

    @Test
    public void pilhaVazia(){
        Pilha p = new Pilha();
        assertTrue(p.estaVazia());
        assertEquals(0,p.tamanho());    }

    @Test
    public void EmpilhaUmElemento(){
        Pilha p = new Pilha();
        p.empilha("primeiro");
        assertFalse(p.estaVazia());
        assertEquals(1,p.tamanho());
        assertEquals("primeiro",p.topo());
    }
    @Test
    public void empilhaDesempilha(){
        Pilha p = new Pilha();
        p.empilha("primeiro");
        p.empilha("segundo");
        assertEquals(2,p.tamanho());
        assertEquals("segundo",p.topo());
        Object desempilhado = p.desmepilha();
        assertEquals(1,p.tamanho());
        assertEquals("primeiro",p.topo());
        assertEquals("segundo",desempilhado);
    }
}
