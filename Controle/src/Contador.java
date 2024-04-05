import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        int parametroUm, parametroDois;

        System.out.println("Digite o primeiro parâmetro");
        parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        parametroDois = terminal.nextInt();
        
        try {
            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();        
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroDois <= parametroUm){
            throw new ParametrosInvalidosException();
        }       
        
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println(i);
        }
    }
}

class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException() {
        super("Os parâmetros são inválidos");
    }
}
