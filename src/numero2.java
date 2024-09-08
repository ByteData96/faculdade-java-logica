import java.util.Scanner;

public class numero2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numero = new int[10];

        System.out.println("Digite 10 valores inteiros");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º numero: ");
            numero[i] = scanner.nextInt();
        }
        
        double somaPonderada = 0;
        double somaPesos = 0;

        for (int i = 0; i < 10; i++) {
            somaPonderada += numero[i] * i;
            somaPesos += i;
        }
        
        double mediaponderada = somaPonderada/ somaPesos;

        System.out.printf("A média ponderada é: %.2f%n", mediaponderada);

        scanner.close();

    }
}
