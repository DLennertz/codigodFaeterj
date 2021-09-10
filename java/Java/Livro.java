public class Livro{
	public static int qtd = 0;
	private String nome;

	public Livro(){
		System.out.println("Livro feito");
	}

	public String getNome(){
		return nome;
	}

	public void setNome(String umNome){
		nome = umNome;
	}
}

