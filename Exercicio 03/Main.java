import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char op ;
        int n1,n2;
        float res;

        System.out.println("Digite um número: ");
        n1 = in.nextInt();
        System.out.println("Digite outro número: ");
        n2 = in.nextInt();
         System.out.println("Escolha um operador: (+ ou - ou * ou /) ");
        op = in.next().charAt(0);
         

        
        switch(op){
            case '+':
                System.out.println(res =n1+n2);
                break;
            case '-':
                System.out.println(res = n1-n2);
                break;
             case '*':
                System.out.println(res = n1*n2);
                break;
             case '/':
                 if (n2==0){
         System.out.println("Divisão por zero é invalida");   
        }else{ 
                System.out.println(res =(float)n1/n2);
        }
                break;
            default:
                System.out.println("Resposta inválida");
                
        }
        
            
    }
}