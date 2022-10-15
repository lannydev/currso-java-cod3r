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
        System.out.println(y);  // outra forma de notação ponto.

        //OBS: TIPOS PRIMITIVOS NÃO TEM O OPERADOR "."
    }

}
