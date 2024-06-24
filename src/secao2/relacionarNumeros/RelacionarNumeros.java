package secao2.relacionarNumeros;

import java.util.Scanner;

public class RelacionarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();

        if(num1 > num2)
            System.out.printf("%d é maior que %d", num1, num2);
        else if(num1 < num2)
            System.out.printf("%d é menor que %d", num1, num2);
        else
            System.out.printf("%d é igual a %d", num1, num2);
    }
}
