import java.util.Scanner;

public class Ex7 {
	
	public static void main(String[] args){
		double raio;
		


		System.out.println("Digite o valor do raio : ");
		Scanner sc = new Scanner(System.in);

		raio = sc.nextDouble();

		System.out.println("Area do circulo de raio ( " + raio + " ) eh igual a " + calcAreaCirculo(raio));

	}

	private static double calcAreaCirculo(double raio)
	{
		final double pi = 3.1415;

		return pi*raio*raio;
	}
}