import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int anoInicio,anoFim,bissexto=0,i;
        
        System.out.println("Digite um ano inicial");
        anoInicio = in.nextInt();
         System.out.println("Digite um ano final");
        anoFim = in.nextInt();
        
        for(i=1;i<=8;i++){
            if ((anoInicio % 4 == 0 && anoInicio % 100 != 0) || (anoInicio % 400 == 0)) {
            bissexto=anoInicio;
            break;
        }
         anoInicio++;
        }
        for(i=bissexto;i<=anoFim;i+=4){
            System.out.println("O ano "+i+" é Bissexto");
        }
        
        
}
}