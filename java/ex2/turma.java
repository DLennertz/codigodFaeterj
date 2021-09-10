import java.util.Arrays;

public class turma{
	private String nome;
	private int quantidadeAlunos;
	private int limiteAlunos;
	private aluno[] listaAlunos = new aluno[40];

	public turma(String nome){
		this.nome = nome;
		this.quantidadeAlunos = 0;
		this.limiteAlunos = 40;
	}

	public String getNome() { return nome; }
	public void setNome(String nome) { this.nome = nome; }

	public int getQuantidadeAlunos() { return quantidadeAlunos; }
	public void setQuantidadeAlunos(int quantidadeAlunos) { this.quantidadeAlunos = quantidadeAlunos; }

	public int getLimiteAlunos() { return limiteAlunos; }
	public void setLimiteAlunos(int limiteAlunos) { this.limiteAlunos = limiteAlunos; }

	public void cadastrarAlunos(String nome){
			if(quantidadeAlunos>=limiteAlunos)
			{
				System.out.println("Número máximo de alunos excedido");
			}
			else
			{
				listaAlunos[quantidadeAlunos].setNome(nome);
				quantidadeAlunos++;
			}
	}

	public void listarAlunos(){
		for(int i=0;i<quantidadeAlunos;i++){
			System.out.println(listaAlunos[i]);
		}
	}
}