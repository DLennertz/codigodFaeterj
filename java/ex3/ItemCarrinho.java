public class ItemCarrinho{
	
	private Produto ProdutoNoCarrinho = new Produto;
	private int quantidade;


	public ItemCarrinho(Produto p, int quantidade){
		this.quantidade = quantidade;
		Produto.setCodigoDeBarra(p.getCodigoDeBarra());
		Produto.setNomeProduto(p.getNomeProduto());
		Produto.setPrecoProduto(p.getPrecoProduto());
	}
}