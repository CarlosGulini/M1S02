package initial;

import java.util.Scanner;

public class E01S06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horas = scanner.nextInt();

        System.out.print("Digite o valor a ser recebido por hora: ");
        double valorHora = scanner.nextDouble();

        double salario = horas * valorHora;

        System.out.printf("O funcionário %s trabalhou %d horas, e portanto possui R$ %.2f a receber.%n", nome, horas, salario);
    }
}

