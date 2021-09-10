import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		turma t1 = new turma("Java");
		int opcao= 1;
		String nome;
		Scanner sc = new Scanner(System.in);

		while(opcao==1){
			System.out.println("Insira o nome do aluno da turma de "+t1.getNome());
			nome = sc.next();
			t1.cadastrarAlunos(nome);

			System.out.println("Você deseja cadastrar um novo aluno? 1-Sim 0-Não");
			opcao = sc.nextInt();
		}

		t1.listarAlunos();
	}

}
