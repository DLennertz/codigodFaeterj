import java.time.LocalDate;

public class Livro implements Emprestavel {

	private String nome;
	private LocalDate dataPrevistaDevolucao;
	private Usuario usuarioEmprestimo;
	private LocalDate dataDevolucao;

	public Livro() {
		
	}

	public Livro(String nome) {
		System.out.println("Livro " + nome + " construido");	
		this.nome = nome;
	}
	
	public void emprestar(Usuario u) {
		System.out.println("Realizando emprestimo");
		this.usuarioEmprestimo = u;
		LocalDate hoje = LocalDate.now();
		this.dataPrevistaDevolucao = hoje.plusDays(15);
	}
	
	
	public void imprimirSituacao() {
		System.out.println("\nLivro: " + nome);
		System.out.println("usuarioEmprestimo: " + usuarioEmprestimo);
		System.out.println("dataPrevistaDevolucao: " + dataPrevistaDevolucao);
		System.out.println("dataDevolucao: " + dataDevolucao + "\n");
	}
	
}
