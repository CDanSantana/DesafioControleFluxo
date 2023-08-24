public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem, int parametro2, int parametro1) {
        super(String.format(mensagem + "(%d | %d)", parametro2, parametro1));
    }
}