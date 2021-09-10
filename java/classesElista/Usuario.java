public class Usuario {

	private String nome;
	
	public Usuario(String nome) {
		System.out.println("Construindo Usuario " + nome);
		this.nome = nome;
	}
	
	public String toString() {
		return "Usuario nome=" + nome;
	}
	
	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

}
