import java.util.Scanner;

public class numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para encontrar o número correspondente na sequência de Fibonacci: ");
        int n = scanner.nextInt();

        // Calcula o número de Fibonacci usando recursão
        long fib = fibonacci(n);

        System.out.println("O número de Fibonacci correspondente a " + n + " é " + fib);

        scanner.close();
    }

    // Função recursiva para calcular o número de Fibonacci
    public static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}