package secao2.estoqueMedio;

import java.util.Scanner;

public class EstoqueMedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade mínima deste produto: ");
        int quantidadeMinima = scanner.nextInt();
        System.out.println("Digite a quantidade máxima deste produto: ");
        int quantidadeMaxima = scanner.nextInt();

        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
        System.out.printf("O estoque médio deste produto é de %d peças", estoqueMedio);
    }
}
