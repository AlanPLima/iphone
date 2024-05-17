// Classe iPhone que implementa as interfaces
public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação para tocar música
    
    public void tocar() {
        System.out.println("Música tocando.");
    }

    // Implementação para pausar música
    
    public void pausar() {
        System.out.println("Música pausada.");
    }

    // Implementação para selecionar uma música
    
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    // Implementação para realizar uma ligação
    
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    // Implementação para atender uma ligação
    
    public void atender() {
        System.out.println("Atendendo a ligação.");
    }

    // Implementação para iniciar o correio de voz
    
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado.");
    }

    // Implementação para exibir uma página na Internet
    
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    // Implementação para adicionar uma nova aba no navegador
    
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    // Implementação para atualizar a página no navegador
    
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    // Método principal para testar a implementação
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando o Reprodutor Musical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Imagine - John Lennon");

        // Testando o Aparelho Telefônico
        meuIphone.ligar("123-456-7890");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando o Navegador na Internet
        meuIphone.exibirPagina("www.example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
