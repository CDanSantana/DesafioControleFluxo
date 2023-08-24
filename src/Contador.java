import java.util.Scanner;
import java.util.InputMismatchException;

public class Contador {

    private static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
        if (parametro2 <= parametro1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro", parametro2, parametro1);
        }
        int contagem = parametro2 - parametro1;
        for (int tmp = 1; tmp <= contagem; tmp++) {
            System.out.println("Imprimindo o número " + tmp);
        }
    }

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametro1, parametro2;
        while(true) {
            try {
                System.out.println("Digite o primeiro parâmetro (c para cancelar):");
                parametro1 = terminal.nextInt();
                System.out.println("Digite o segundo parâmetro (c para cancelar):");
                parametro2 = terminal.nextInt();
                try {
                    contar(parametro1, parametro2);
                    break;
                } catch (ParametrosInvalidosException exception) {
                    System.out.println(exception.getMessage());
                }
            } catch(InputMismatchException exception) {
                String entrada = terminal.next();
                if(entrada.equals("c")) {
                    System.out.println("Cancelando...");
                    break;
                }else{
                    System.out.println(entrada + " não é um número inteiro válido.");
                }
            }
        }
    }

}
