package initial;

import java.util.Scanner;

public class E01S04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();

        int produto = valor1 * valor2;

        System.out.println("PRODUTO = " + produto);
    }
}
