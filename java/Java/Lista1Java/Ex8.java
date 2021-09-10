import java.util.Scanner;
import java.lang.Math.*;

public class Ex8 {
	
	public static void main(String[] args){
		int x1, x2, x3, y1, y2, y3;
		Scanner sc = new Scanner(System.in);


		
			
		System.out.println("Digite o valor x do ponto1");
		x1 = sc.nextInt();

		System.out.println("Digite o valor y do ponto1");
		y1 = sc.nextInt();
		
		System.out.println("Digite o valor x do ponto2");
		x2 = sc.nextInt();

		System.out.println("Digite o valor y do ponto2");
		y2 = sc.nextInt();

		System.out.println("Digite o valor x do ponto3");
		x3 = sc.nextInt();

		System.out.println("Digite o valor y do ponto3");
		y3 = sc.nextInt();
	
		
		double lado1=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		double lado2=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double lado3=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
		
		if(lado1>lado2+lado3 || lado2>lado1+lado3 || lado3>lado2+lado1)
		{
			System.out.println("Impossivel fazer triangulo");
		}
		else
		{
			if(lado1==lado2 && lado1==lado3)
			{
				System.out.println("Area = "+ (Math.sqrt(3)/4)*lado1*lado1);
			}
			else if(lado1!=lado2 && lado1!=lado3 && lado2!=lado3)
			{
				double sp=(lado1+lado2+lado3)/2;
				System.out.println("Area = "+ Math.sqrt(sp*(sp-lado1)*(sp-lado2)*(sp-lado3)));
			}
			else
			{
				System.out.println("Area = "+ Math.sqrt((lado1*lado1)-((lado2*lado2)/4)));
			}
			
		}

	}

}