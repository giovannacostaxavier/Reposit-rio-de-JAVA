import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        System.out.println("Digite um número: ");
        n1 = in.nextInt();
        if(n1==0){
             System.out.println("O número que você digitou foi 0");
        }
        else if(n1%2==0){
            System.out.println("O número "+n1+" é PAR");
         }else{
            System.out.println("O número "+n1+" é IMPAR");
        };
        
    }
}
