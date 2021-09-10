public class Programa {

	public static void main(String[] args) {
		Livro l1 = new Livro("O físico");
		Livro l2 = new Livro("Guia do mochileiro das galáxias");
		Usuario u1 = new Usuario("maria");
		
		l1.imprimirSituacao();
		l2.imprimirSituacao();
		
		LivroCativo l3 = new LivroCativo();
		
		Emprestavel[] coisas = new Emprestavel[] {l1, l2, l3};
		for (Emprestavel e: coisas) {
			e.emprestar(u1);
		}
		
		l1.imprimirSituacao();
	}

}
