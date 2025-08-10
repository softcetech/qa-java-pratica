import java.util.Scanner;

public class Calculadora {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Escolha a operação (+, -, *, /): ");
        char op = sc.next().charAt(0);

        double resultado = 0;
        switch (op) {
            case '+' -> resultado = n1 + n2;
            case '-' -> resultado = n1 - n2;
            case '*' -> resultado = n1 * n2;
            case '/' -> resultado = (n2 != 0) ? n1 / n2 : Double.NaN;
            default -> System.out.println("Operação inválida!");
        }

        System.out.println("Resultado: " + resultado);
    }
}
