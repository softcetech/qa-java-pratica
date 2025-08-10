import java.util.ArrayList;
import java.util.Scanner;

public class AgendaSimples {
    public static void executar() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        System.out.print("Quantos contatos deseja adicionar? ");
        int qtd = sc.nextInt();
        sc.nextLine(); // limpar buffer

        for (int i = 0; i < qtd; i++) {
            System.out.print("Nome: ");
            nomes.add(sc.nextLine());
            System.out.print("Telefone: ");
            telefones.add(sc.nextLine());
        }

        System.out.println("\n=== CONTATOS ===");
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i) + " - " + telefones.get(i));
        }
    }
}
