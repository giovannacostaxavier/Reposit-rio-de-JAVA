import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ;

        System.out.println("Escreva seu nome");
        nome = in.nextLine();
        System.out.println("casado digite (C), não casado digite (N)");
      sit = in.nextLine().charAt(0);
        if(sit == 'c' || sit == 'C'){
            System.out.println("O utilizador "+nome+" é CASADO");
        }else if (sit == 'n' || sit == 'N'){
          System.out.println("O utilizador "+nome+" não é CASADO");
        }else{
            System.out.println("Situação invalida");
        };
        
    }
}
