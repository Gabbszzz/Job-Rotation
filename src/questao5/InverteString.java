package questao5;

/**
 *
 * @author @Gabbszzz
 */
import java.util.Scanner;

public class InverteString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        StringBuilder saida = new StringBuilder();

        for (int i = entrada.length() - 1; i >= 0; i--) {
            saida.append(entrada.charAt(i));
        }

        System.out.println("String invertida: " + saida.toString());
    }
}

