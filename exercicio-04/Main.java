import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;

        System.out.println("Digite um ano: ");
        ano = in.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano Bissexto");
        } else {
            System.out.println("O ano não é Bissexto");
        }
    }
}