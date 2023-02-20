package orientacaoAObjetos.classeEObjetos;

public class DataTeste {
    public static void main(String[] args) {

        Data dia1 = new Data();
        dia1.dia = 30;
        dia1.mes = 8;
        dia1.ano = 1986;

        System.out.printf("%d/%d/%d", dia1.dia, dia1.mes, dia1.ano);


    }
}
