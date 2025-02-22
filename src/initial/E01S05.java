package initial;

import java.util.Scanner;

public class E01S05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota A: ");
        double A = scanner.nextDouble();

        System.out.print("Digite a nota B: ");
        double B = scanner.nextDouble();

        double media = (A * 3.5 + B * 7.5) / 11;

        System.out.printf("MEDIA = %.2f%n", media);
    }
}

