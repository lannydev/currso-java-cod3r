package orientacaoAObjetos.classeEObjetos;

public class Produto {

    String nome;
    double preco;
    double desconto;

    // preco * (1 - desconto);
    public double precoFinal(){
        double precoNovo = preco * (1 - desconto);
        return precoNovo;

    }

}
