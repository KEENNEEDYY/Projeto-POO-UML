public class App {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();

        smartphone.tocar();
        smartphone.pausar();
        smartphone.selecionarMusica("Música 1");

        smartphone.ligar();
        smartphone.atender();
        smartphone.iniciarCorreioVoz();

        Aba aba1 = new Aba("www.example.com");
        smartphone.adicionarNovaAba(aba1);
        smartphone.exibirPagina(aba1.getUrl());
        smartphone.atualizarPagina();
    }
}
