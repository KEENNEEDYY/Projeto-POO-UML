public class Smartphone implements MediaPlayer, Phone, Browser{

    private CorreioDeVoz correioDeVoz;

    public Smartphone() {
        correioDeVoz = new CorreioDeVoz();
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }

    @Override
    public void ligar() {
        System.out.println("Realizando Chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        correioDeVoz.iniciarGravacao();
    }

    @Override
    public void adicionarNovaAba(Aba aba) {
        System.out.println("Nova aba adicionada com URL: " + aba.getUrl());
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    
}
