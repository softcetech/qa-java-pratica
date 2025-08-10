import java.util.Scanner;

public class CaixaEletronico {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        int valor = sc.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2};
        for (int nota : notas) {
            int qtd = valor / nota;
            valor %= nota;
            if (qtd > 0) {
                System.out.println(qtd + " nota(s) de R$" + nota);
            }
        }
    }
}
