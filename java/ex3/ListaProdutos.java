public class ListaPrdutos{
	
	private Produto[] listaDosProdutos = new Produto[40];
	private int qtdProdutos;

	public Produto(){
		qtdProdutos=0;
	}

	public void add(Produto p){
		Produto[qtdProdutos].setCodigoDeBarra(p.getCodigoDeBarra());
		Produto[qtdProdutos].setNomeProduto(p.getNomeProduto());
		Produto[qtdProdutos].setPrecoProduto(p.getPrecoProduto());

		qtdProdutos++;

	}

	public Produto buscarPeloCodigoBarras(String codigoDeBarra){
		for(int i = 0 ; i<qtdProdutos;i++){
			if(Produto[qtdProdutos].getCodigoDeBarra()==codigoDeBarra){
				return Produto[qtdProdutos];
			}
		}
	}
}