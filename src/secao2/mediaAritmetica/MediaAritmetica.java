package secao2.mediaAritmetica;

import java.util.Locale;
import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite as 3 notas do aluno: ");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média do aluno foi %.2f", media);
    }
}
