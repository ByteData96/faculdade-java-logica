public class SistemaMedida {
    public static void main(String[] args) throws Exception {
         char sigla = 'M';

        if(sigla == 'P')
            System.out.print("PEQUENO");
        else if(sigla == 'M')
            System.out.print("MEDIO");
        else if(sigla == 'G')
            System.out.print("GRANDE");
        else
            System.out.print("INDEFINIDO");
            
    }
}
