import java.util.Scanner;

public class numero6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] numero = new int[3][3];

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                numero[i][j]= scanner.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%2d |", numero[i][j]);
            }
            System.out.printf("%n");
        }

        int determinante = 0;

        determinante = numero[0][0] * (numero[1][1] * numero[2][2] - numero[1][2] * numero[2][1])
                     - numero[0][1] * (numero[1][0] * numero[2][2] - numero[1][2] * numero[2][0])
                     + numero[0][2] * (numero[1][0] * numero[2][1] - numero[1][1] * numero[2][0]);
    
        System.out.println(determinante);

        scanner.close();
    }    
}
