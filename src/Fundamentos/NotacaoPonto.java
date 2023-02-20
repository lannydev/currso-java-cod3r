package Fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora"); // Substitui o X por Senhora
        s = s.toUpperCase(); // transforma em letras maiúsculas
        s = s.concat("!!!");  // concatena

        System.out.println(s);

        String x = "Elaine".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "Gui")
                .toLowerCase() // converte todas as letras em minusculas
                        .concat("!!!");
        System.out.println(y + "\n\n" +
                "");  // outra forma de notação ponto.

        //OBS: TIPOS PRIMITIVOS NÃO TEM O OPERADOR "."


        var nome = "Pedro";
        var sobrenome = "Cruz";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n"); // n pula linha

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        // %s substitui string
        //%d substitui numeros inteiros
        // %f substitui decimais
        // %.2f Substitui com duas casas decimais.

    }

}
