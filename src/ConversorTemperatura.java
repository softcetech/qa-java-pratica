import java.util.Scanner;

public class ConversorTemperatura {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celsius: ");
        double c = sc.nextDouble();

        double f = (c * 9 / 5) + 32;
        System.out.println("Em Fahrenheit: " + f);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f2 = sc.nextDouble();

        double c2 = (f2 - 32) * 5 / 9;
        System.out.println("Em Celsius: " + c2);
    }
}
