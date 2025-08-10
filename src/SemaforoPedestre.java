import java.util.Scanner;

public class SemaforoPedestre {

    public static void executar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a distância até a faixa de pedestre (em metros): ");
        double distancia = sc.nextDouble();

        if (distancia > 50) {
            System.out.println("Sinal VERDE - Pode prosseguir.");
        } else if (distancia > 20) {
            System.out.println("Sinal AMARELO - Reduza a velocidade.");
        } else {
            System.out.println("Sinal VERMELHO - Pare! Pedestre pode atravessar.");
        }
    }
}
