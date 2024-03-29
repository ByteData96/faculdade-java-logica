public class SistemaMedida {
    public static void main(String[] args) throws Exception {
         char sigla = 'M';

        switch (sigla) {
            case 'P':{
            System.out.print("PEQUENO");
                break;
            }
            case 'M':{
            System.out.print("MEDIO");
                break;
            }
            case 'G':{
            System.out.println("GRANDE");
                break;
            }
        
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
