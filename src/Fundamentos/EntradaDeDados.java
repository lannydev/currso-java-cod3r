package Fundamentos;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("informe um numero");
        int numero = sc.nextInt();
        System.out.println("O numero digitado é " + numero);


        sc.close();
    }
}
