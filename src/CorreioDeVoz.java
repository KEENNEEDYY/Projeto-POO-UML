import java.util.ArrayList;
import java.util.List;

public class CorreioDeVoz {
        private List<String> listaDeGravacoes;

    public CorreioDeVoz() {
        listaDeGravacoes = new ArrayList<>();
    }

    public void iniciarGravacao() {
        System.out.println("Iniciando gravação de mensagem de voz");
    }
}
