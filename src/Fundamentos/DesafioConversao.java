package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro salário");
        String valor1 = sc.next().replace(",", "");

        System.out.println("Informe o segundo salário");
        String valor2 = sc.next().replace(",", "");

        System.out.println("informe o terceiro salário");
        String valor3 = sc.next().replace(",", "");

        double salario1 = Double.parseDouble(valor1);
        double salario2 = Double.parseDouble(valor2);
        double salario3 = Double.parseDouble(valor3);


        double soma = salario1 + salario2 + salario3;
        double media = soma/3;
        System.out.println("A média dos salários é "  + media);

        sc.close();

    }
}
