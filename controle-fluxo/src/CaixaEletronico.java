import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double saldo = 30.0;
        double valorSolicitado;
            
        System.out.println("Saldo atual: R$" + saldo);
        System.out.println("Qual valor deseja sacar?");
        valorSolicitado = ler.nextDouble();

        if (valorSolicitado <= saldo) {
            saldo -= valorSolicitado; // Equivalente a saldo = saldo - valorSolicitado;

            System.out.println("Saque de R$" + valorSolicitado + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque de R$" + valorSolicitado);
        }

        ler.close(); // Fechar o Scanner
    }
}
