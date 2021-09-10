public class Programa{
	
	public static void main(String[] args){
		ListaProdutos lp = new ListaProdutos();
		lp.add(new Produto("123456789", "Sabão", 2.78));

		CarrinhoCompras cc = new CarrinhoCompras();

		Produto p= lp.buscarPeloCodigoBarras("123456789");
		cc.add(new ItemCarrinho(p,3));

		Pedido pedido = cc.fecharPedido();
		pedido.imprimir();
	}
}