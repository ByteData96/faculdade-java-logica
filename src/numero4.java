public class numero4 {
    public static void main(String[] args){
        int valor= 100;
        float[] sequencia = new float[100];

        sequencia[0] = valor;

        for (int i = 1; i < 100; i++){
            sequencia[i] = sequencia[i - 1] / 2;
        }

        System.out.print("[");
        for (int i = 0; i < 100; i++){
            if(i != 99){
                System.out.print(sequencia[i] + ", ");
            } else {
                System.out.print(sequencia[i]);
            }
        }
        System.out.print("]");

    }
    
}
