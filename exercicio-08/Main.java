import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1,res,i;

        System.out.println("Digite um número: ");
        n1 = in.nextInt();
        
        for(i=1;i<=10;i++){
            res=n1*i;
            System.out.println(n1+"X"+i+"="+res);
            
        }
        
    }
}
