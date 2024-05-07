package model.exceptions;

// Classe de exce��o personalizada para o dom�nio do problema
public class DomainExceptions extends Exception {

    // Vers�o para controle de serializa��o
    private static final long serialVersionUID = 1L;

    // Construtor que recebe uma mensagem de erro
    public DomainExceptions(String msg) {
        // Chama o construtor da classe pai (Exception) passando a mensagem de erro
        super(msg);
    }

}
