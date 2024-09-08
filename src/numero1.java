import java.util.Scanner;

public class numero1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];
        
        System.out.println("Escreva 10 números");

        for(int i= 0; i < 10; i++) {
            System.out.println("Escreva o " + (i + 1) + " numero");
            numero[i] = scanner.nextInt();
        }

        System.out.println("\nValores pares:");
        for (int i = 0; i < 10; i++) {
            if(numero[i] % 2 == 0 ) {
                System.out.println(numero[i]);
            }
        }

        System.out.println("\nValores ímpares:");
        for (int i = 0; i < 10; i++) {
            if (numero[i] % 2 != 0) {
                System.out.println(numero[i]);
            }
        }

        scanner.close();
    }
}
