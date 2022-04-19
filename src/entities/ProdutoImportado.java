package entities;

public class ProdutoImportado extends Produto {

	private Double custoAlfandega;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, Double preco, Double custoAlfandega) {
		super(nome, preco);
		this.custoAlfandega = custoAlfandega;
	}

	public Double getCustoAlfandega() {
		return custoAlfandega;
	}

	public void setCustoAlfandega(Double custoAlfandega) {
		this.custoAlfandega = custoAlfandega;
	}

	public double valorTotal() {
		 return preco + custoAlfandega;
	}
}
