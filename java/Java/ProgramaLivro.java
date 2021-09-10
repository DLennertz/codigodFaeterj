public class ProgramaLivro{

	public static void main(String[] args){
		Livro l1 = new Livro();
		l1.setNome("O fisico");

		Livro l2 = new Livro();
		l2.setNome("Silva");

		System.out.println("l1 : " + l1.getNome());

		System.out.println("l2 : " + l2.getNome());
	}
}

