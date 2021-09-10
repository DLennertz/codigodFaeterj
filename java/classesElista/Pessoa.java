import java.time.LocalDate;
import java.time.Period;

public class Pessoa{

	private String nome;
	private LocalDate dataAniversario;
	private String email;


	public Pessoa(String nome, LocalDate dataAniversario, String email) {
		System.out.println("Construindo Pessoa " + nome);
		this.nome = nome;
		this.dataAniversario = dataAniversario;
		this.email = email;
	}

	public String toString(){ return "Usuario: " + nome + " Email: " + email;}

	public void setNome(String nome) { this.nome = nome; }

	public String getNome() { return nome; }

	public LocalDate getDataAniversario() {return dataAniversario;}

	public void setDataAniversario(LocalDate dataAniversario) { this.dataAniversario = dataAniversario; }

	public String getEmail() { return email; }

	public void setEmail(String email) { this.email = email; }

	public int getIdade(){return Period.between( dataAniversario, LocalDate.now()).getYears();}
	
}