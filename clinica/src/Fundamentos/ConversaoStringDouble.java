package Fundamentos;

import javax.swing.*;

public class ConversaoStringDouble {

    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog("Informe o primeiro numero");
        String valor2 = JOptionPane.showInputDialog("Informe o segundo numero");
        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("A soma dos numeros é: " + soma);
        System.out.println("A média dos valores informados é " + soma / 2);
    }
}
