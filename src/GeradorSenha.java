import java.security.SecureRandom;

public class GeradorSenha {
    public static void executar() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";
        SecureRandom random = new SecureRandom();
        StringBuilder senha = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = random.nextInt(chars.length());
            senha.append(chars.charAt(index));
        }

        System.out.println("Senha gerada: " + senha);
    }
}
