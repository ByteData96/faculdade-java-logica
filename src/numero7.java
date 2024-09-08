import java.util.Scanner;

public class numero7 {
    public static void main(String[] args) {
        // 7. Escreva um programa que receba um número inteiro 2≤𝑁≤5, crie uma matriz
        // quadrada 𝑁×𝑁, preencha a matriz com valores de 1 até 𝑁2, calcule o
        // quadrado da matriz criada e exiba o resultado na tela.
        Scanner scanner = new Scanner(System.in);

        System.out.println("digite um número entre 2 e 5: ");
        int n = scanner.nextInt();

        if(n<2 || n>5){
            System.out.println("O valor de ene deve estar entre 1 e 6.");
        }

        int[][] matriz = new int[n][n]; 
        int valor = 1;
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                matriz[i][j] = valor++;
            }
        }

        int[][] matrizquadrada = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) {
                for(int k =0; k<n; k++){
                    matrizquadrada[i][j] += matriz[i][k] * matriz[k][j];
                }
            }
        }

        System.out.println("Matriz ao quadrado:");
        for(int i = 0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.printf("%33d |", matrizquadrada[i][j]);
            }
            System.out.printf("%n");
        }
        scanner.close();
    }
}