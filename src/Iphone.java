public  class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {


    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " selecionada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Ligação recebida");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova guia");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }


    public static void main(String[] args) {

    Iphone iphone = new Iphone();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Yung Buda - Piloto");

        iphone.ligar("1234-5678");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();


    }

}
