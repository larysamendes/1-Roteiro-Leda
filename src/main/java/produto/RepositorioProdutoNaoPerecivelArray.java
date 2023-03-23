package produto;

public class RepositorioProdutoNaoPerecivelArray extends RepositorioProdutoArrayList {

	public RepositorioProdutoNaoPerecivelArray() {
		super();
	}

	@Override
	public void inserir(Produto produto) {
		if (produto instanceof ProdutoNaoPerecivel) {
			super.inserir(produto);
		}
	}

	@Override
	public void atualizar(Produto produto) {
		if (produto instanceof ProdutoNaoPerecivel) {
			super.atualizar(produto);
		}
	}
}
