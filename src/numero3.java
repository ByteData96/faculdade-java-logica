public class numero3 {
    public static void main(String[] agrs) {
        int valor = 1;
        int[] sequencia = new int[10];

        sequencia[0] = valor;

        for (int i = 1; i < 10; i++) {
            sequencia[i] = sequencia[i - 1 ] * 2;
        }

        System.out.print("[");
        for (int i = 0;  i < 10; i++) {
            if (i != 9){
                System.out.print(sequencia[i] + ", ");
            } else {
                System.out.print(sequencia[i]);
            }
     
        }
        System.out.print("]");

    }
}
