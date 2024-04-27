import java.util.Scanner;

/**
 * @author Helinton Alves Coelho
 * @version 1.0.0
 * @since 27/04/2024
 * */

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro (um número inteiro): " );
        int parametroUm = terminal.nextInt();

        System.out.println("Ditite o segundo parâmetro (número inteiro): ");
        int parametroDois = terminal.nextInt();

        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException mensagem){
            System.out.println(mensagem);
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroDois < parametroUm){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;
        for(int contador = 0; contador < contagem; contador++){
            System.out.println("Número: " + (contador + 1));
        }

    }

}
