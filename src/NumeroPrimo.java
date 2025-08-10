import java.util.Scanner;

public class NumeroPrimo {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        boolean primo = true;
        if (num <= 1) primo = false;
        else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        System.out.println(num + (primo ? " é primo." : " não é primo."));
    }
}
