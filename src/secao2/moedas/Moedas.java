package secao2.moedas;

import java.util.Locale;
import java.util.Scanner;

public class Moedas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em dólares que deseja converter para real: ");
        double dolares = scanner.nextDouble();
        System.out.println("Digite a cotação atual: ");
        double cotacao = scanner.nextDouble();

        double reais = dolares * cotacao;

        System.out.printf("US$%.2f convertidos para real é equivalente a R$%.2f", dolares, reais);
    }
}
