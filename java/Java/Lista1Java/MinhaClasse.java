import java.util.Scanner;

public class MinhaClasse {
	
	public static void main(String[] args){

		System.out.println("Metodo main da classe MinhaClasse");

		System.out.println("Digite dois numeros");
		Scanner sc = new Scanner(System.in);

		float a = sc.nextFloat();
		float b = sc.nextFloat();

		float media = (a + b) / 2;
		System.out.println("Media: " + media);
	}
}