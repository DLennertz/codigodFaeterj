import java.util.Scanner;

public class Ex4 {
	
	public static void main(String[] args){
		float maior;

		System.out.println("Digite 3 numeros");
		Scanner sc = new Scanner(System.in);

		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();

		maior = a;
		if(b>=c && b>a)
		{
			maior = b;
		}
		else if(c>a && c>b)
		{
			maior = c;
		}

		System.out.println("Maior numero: " + maior);
	}
}