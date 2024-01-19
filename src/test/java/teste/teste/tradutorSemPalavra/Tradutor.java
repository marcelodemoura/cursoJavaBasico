package teste.teste.tradutorSemPalavra;

import java.util.HashMap;
import java.util.Map;

public class Tradutor {

    private final Map<String, String> traducoes = new HashMap<>();

    public boolean estaVazio() {
        return traducoes.isEmpty();
    }

    public void adicionaTraducao(String palavra, String traducao) {
        if(traducoes.containsKey(palavra)){
            traducao = traduzir(palavra) + "," +traducao;
        }
        traducoes.put(palavra, traducao);
    }

    public String traduzir(String palavra) {
        return traducoes.get(palavra);
    }
}
