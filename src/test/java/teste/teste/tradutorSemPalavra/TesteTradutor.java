package teste.teste.tradutorSemPalavra;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteTradutor {
    private Tradutor t;

    @BeforeEach
    public void criarTradutor() {
        t = new Tradutor();
    }

    @Test
    public void tradutorSemPalavra() {
        assertTrue(t.estaVazio());
    }

    @Test
    public void umaTraducao() {
        t.adicionaTraducao("bom", "good");
        assertFalse(t.estaVazio());
        assertEquals("good", t.traduzir("bom"));
    }

    @Test
    public void duasTraducao() {
        t.adicionaTraducao("bom", "good");
        t.adicionaTraducao("mau", "bad");
        assertEquals("good", t.traduzir("bom"));
        assertEquals("bad", t.traduzir("mau"));
    }

    @Test
    public void duasTraducaoMesmaPalavra() {
        t.adicionaTraducao("bom", "good");
        t.adicionaTraducao("bom", "nice");
        assertEquals("good,nice", t.traduzir("bom"));
    }

    @Test
    public void traduzirFrase() {
        t.adicionaTraducao("guerra", "war");
        t.adicionaTraducao("é", "is");
        t.adicionaTraducao("ruim", "bad");
        assertEquals("war is bad", t.traduzirFraze("guerra é ruim"));
    }

}
