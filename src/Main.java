import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== PROJETO LÓGICA BÁSICA ===");
            System.out.println("1 - Controle de Semáforo com Pedestre");
            System.out.println("2 - Calculadora Simples");
            System.out.println("3 - Verificador de Números Primos");
            System.out.println("4 - Tabuada Automática");
            System.out.println("5 - Conversor de Temperaturas");
            System.out.println("6 - Simulador de Caixa Eletrônico");
            System.out.println("7 - Gerador de Senhas Aleatórias");
            System.out.println("8 - Agenda Simples");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> SemaforoPedestre.executar();
                case 2 -> Calculadora.executar();
                case 3 -> NumeroPrimo.executar();
                case 4 -> Tabuada.executar();
                case 5 -> ConversorTemperatura.executar();
                case 6 -> CaixaEletronico.executar();
                case 7 -> GeradorSenha.executar();
                case 8 -> AgendaSimples.executar();
                case 0 -> System.out.println("Encerrando o programa...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}
