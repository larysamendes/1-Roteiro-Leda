package produto;

public class RepositorioProdutoPerecivelArray extends RepositorioProdutoArrayList {

	public RepositorioProdutoPerecivelArray() {
		super();
	}

	@Override
	public void inserir(Produto produto) {
		if (produto instanceof ProdutoPerecivel) {
			super.inserir(produto);
		}
	}

	@Override
	public void atualizar(Produto produto) {
		if (produto instanceof ProdutoPerecivel) {
			super.atualizar(produto);
		}
	}
}
