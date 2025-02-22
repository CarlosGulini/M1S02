package initial;

import java.util.Scanner;

public class E01S02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int A = scanner.nextInt();

        System.out.print("Digite o valor de B: ");
        int B = scanner.nextInt();

        int soma = A + B;

        System.out.println("SOMA = " + soma);
    }
}



