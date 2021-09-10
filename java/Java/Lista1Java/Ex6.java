import java.util.Scanner;

public class Ex6 {
	
	public static void main(String[] args){
		float num;


		System.out.println("Digite o numeros para verificar se ele eh primo : ");
		Scanner sc = new Scanner(System.in);

		num = sc.nextFloat();

		if(ehPrimo(num))
		{
			System.out.println(num + " eh primo");
		}
		else
		{
			System.out.println(num + " nao eh primo");
		}

	}

	private static boolean ehPrimo(float num)
	{
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
}