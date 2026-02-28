import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;
        for(ano=1926;ano<=2026;ano++){
        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("O ano "+ano+" é Bissexto");
        }
    }
}
}