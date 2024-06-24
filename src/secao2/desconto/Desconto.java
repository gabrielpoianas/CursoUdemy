package secao2.desconto;

import java.util.Locale;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        System.out.println("Digite a porcentagem de secao2.desconto: ");
        double porcentagem = scanner.nextDouble();

        double desconto = valor * (porcentagem / 100);
        double valorFinal = valor - desconto;
        System.out.printf("O valor final com o secao2.desconto é R$%.2f, você economizou R$%.2f", valorFinal, desconto);
    }
}
