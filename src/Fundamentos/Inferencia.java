package Fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5;
        System.out.println(a);

        // o java vai inferir o tipo de variável
        // não é permitido mudaro tipo de variável
        var b = 4.5;
        System.out.println(b);

        var c = "texto";
        System.out.println(c);
    }
}
