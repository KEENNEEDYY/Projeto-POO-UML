import java.util.ArrayList;
import java.util.List;

public interface Browser {

    void adicionarNovaAba(Aba aba);
    void exibirPagina(String url);
    void atualizarPagina();
}
