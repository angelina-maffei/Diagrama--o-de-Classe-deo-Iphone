package Smartphone;

public class iphone implements ReprodutorMusica, aparelhoEletronico, navegador{

    @Override
    public void pausar() {
        
        System.out.println("musica pausada");
    }

    @Override
    public void selecionarMusica() {
        
        System.out.println("selecionando musica...");
    }

    @Override
    public void tocar() {
        
        System.out.println("musica tocando");
    }

    @Override
    public void atender() {
        
        System.out.println("atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
       
        System.out.println("correio de voz iniciado");
    }

    @Override
    public void ligar() {
        
        System.out.println("ligando...");
    }

    @Override
    public void adicionarNovaAba() {
        
        System.out.println("navegador abrindo outra aba");
    }

    @Override
    public void atualizarPagina() {
       
        System.out.println("navegador atualizando pagina");
    }

    @Override
    public void exibirPagina() {
        
        System.out.println("pagina exibida" );
    }
    
    
}