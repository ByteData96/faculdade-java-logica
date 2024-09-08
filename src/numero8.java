import java.util.Scanner;

public class numero8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de linhas da primeira matriz: ");
        int linhas1 = scanner.nextInt();
        System.out.println("Digite o número de colunas da primeira matriz: ");
        int colunas1 = scanner.nextInt();

        System.out.println("Digite o número de linhas da segunda matriz: ");
        int linhas2 = scanner.nextInt();
        System.out.println("Digite o número de colunas da segunda matriz: ");
        int colunas2 = scanner.nextInt();

        if (colunas1 != linhas2) {
            System.out.println("Multiplicação impossível. O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
        }

        int[][] matriz1 = new int[linhas1][colunas1];
        int[][] matriz2 = new int[linhas2][colunas2];
        int[][] resultado = new int[linhas1][colunas2]; 

        System.out.println("Digite os valores da primeira matriz:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas1; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Digite os valores da segunda matriz:");
        for (int i = 0; i < linhas2; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.printf("Elemento [%d][%d]: ", i + 1, j + 1);
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                for (int k = 0; k < colunas1; k++) { 
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
            }
        }

        System.out.println("Resultado da multiplicação:");
        for (int i = 0; i < linhas1; i++) {
            for (int j = 0; j < colunas2; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}