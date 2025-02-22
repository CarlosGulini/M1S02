package initial;

import java.util.Scanner;

public class E01S03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio da circunferência: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.printf("A = %.1f%n", area);
    }
}

