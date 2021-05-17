public class Main {
    public static void main(String[] args) {
        Produto produto = new ProdutoBuilder()
            .createProduto();

        System.out.println(produto.toString());
    }
}
