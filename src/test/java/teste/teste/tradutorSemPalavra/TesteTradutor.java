package teste.teste.tradutorSemPalavra;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteTradutor {
    @Test
    public void tradutorSemPalavra() {
        Tradutor t = new Tradutor();
        assertTrue(t.estaVazio());
    }
    @Test
    public void umaTraducao() {
        Tradutor t = new Tradutor();
        t.adicionaTraducao("bom", "good");
        assertFalse(t.estaVazio());
        assertEquals("good", t.traduzir("bom"));
    }
}
