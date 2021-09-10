import java.util.Scanner;

public class Ex5 {
	
	public static void main(String[] args){
		float maior;

		System.out.println("Programa para calcular equacao de segundo grau (ax^2 + bx + c = 0)");
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor a : ");
		int a = sc.nextInt();
		System.out.println("Digite o valor b : ");
		int b = sc.nextInt();
		System.out.println("Digite o valor c : ");
		int c = sc.nextInt();

		System.out.println(a+"x^2 +" + b+"x +"+c);

		System.out.println("Agora escolha o valor de x :");
		int x = sc.nextInt();

		System.out.println("Resultado = " + ((a+x*x)+(b*x)+c));

	}
}