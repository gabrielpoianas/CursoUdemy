package secao2.tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver sua secao2.tabuada: ");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n",num, i , num * i);
        }
    }
}