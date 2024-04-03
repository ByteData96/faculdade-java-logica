public class ExemploFor{
    public static void main(String[] args) throws Exception {
        for (int carneirinho = 1; carneirinho <= 20; carneirinho ++){
            String enquanto = (carneirinho == 1) ? " Carneirinho..." : " Carneirinhos...";
            System.out.println(carneirinho + enquanto);
        }
        System.out.println("Pedrinho, dormiu!");
    }
}
