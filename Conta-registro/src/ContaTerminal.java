
import java.util.Scanner;

public class ContaTerminal {
    static String nome;
    static int idade;
    static char sexo;

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        nome = ler.next();
        System.out.println("Qual é a sua idade?");
        idade = ler.nextInt();
        System.out.println("Qual é o seu sexo(M para masculino ou F para feminino)?");
        sexo = ler.next().charAt(0);

        
        System.out.println("Olá " + nome + ", você tem " + idade + " anos e é do sexo " + sexo + ".");    }
}
