public class CarrinhoCompras{
	
	private int qtdItems;
	private ItemCarrinho[] itemsNoCarro = new ItemCarrinho[40];

	public CarrinhoCompras(){
		qtdItems = 0;
	}

	public void add(ItemCarrinho item){
		itemsNoCarro[qtdItems] = item;
		qtdItems++;
	}
	
}