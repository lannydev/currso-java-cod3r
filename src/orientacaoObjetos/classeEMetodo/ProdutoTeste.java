package orientacaoObjetos.classeEMetodo;

public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.nome = "Notebook";
        produto1.preco = 4356.89;
        produto1.desconto = 0.25;

        Produto p2 = new Produto();
        p2.nome = "Smartphone";
        p2.preco = 2999.99;
        p2.desconto = 0.5;


        System.out.println(produto1.nome + ", valor inicial de R$" + produto1.preco + ". Teve " + produto1.desconto + "% de desconto.");
        System.out.println(p2.nome + ", valor inicial de R$" + p2.preco + ". Teve " + p2.desconto + "% de desconto.");
        System.out.println(produto1.precoFinal());
        System.out.println(p2.precoFinal());



    }
}
