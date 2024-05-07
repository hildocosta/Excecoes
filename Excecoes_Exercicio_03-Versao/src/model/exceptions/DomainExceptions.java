package model.exceptions;

// Classe de exceção personalizada para o domínio do problema
public class DomainExceptions extends Exception {

    // Versão para controle de serialização
    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de erro
    public DomainExceptions(String msg) {
        // Chama o construtor da classe pai (Exception) passando a mensagem de erro
        super(msg);
    }

}
