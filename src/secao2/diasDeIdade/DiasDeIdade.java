package secao2.diasDeIdade;

import java.util.Locale;
import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        int ageDays = age * 365;

        System.out.printf("Você tem %d dias de vida", ageDays);
    }
}
