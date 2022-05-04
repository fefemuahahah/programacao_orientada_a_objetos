package programacao_orientada_a_objetos;


public class Exercicio001 {
    public static void main(String[] args) {
        Produto01 produtoEmAnalise = new Produto01();
        produtoEmAnalise.nome = "fone buds 02";
        produtoEmAnalise.quantidadeEstoque = 8;
        System.out.println("É necessário que o estoque do produto " + produtoEmAnalise.nome + "seja reposto? "
                + precisaReporEstoque(produtoEmAnalise));
    }
    static boolean precisaReporEstoque (Produto01 produtoEmAnalise){
        if (produtoEmAnalise.quantidadeEstoque < Produto01.QUANTIDADE_MINIMA){
            return true;
        }else {
            return false;
        }
    }
}
