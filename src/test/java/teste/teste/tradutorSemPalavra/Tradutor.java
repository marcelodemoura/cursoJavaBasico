package teste.teste.tradutorSemPalavra;

public class Tradutor {

    private String traducao;

    public boolean estaVazio() {
        return (traducao == null);
    }

    public void adicionaPalavra(String palavra, String traducao) {
        this.traducao = traducao;
    }

    public Object traduzir(String palavra) {
        return traducao;
    }
}
