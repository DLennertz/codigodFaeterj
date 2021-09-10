public class Variaveis {

	//variável de instancia
	private int idade = 80;

	//variável de classe
	private static int criterio = 60;
	
	//metodo de classe
	public static void main(/*variável como para metro*/String[] args){
		//variáveis locais
		Variaveis v1 = new Variaveis();
		Variaveis v2 = new Variaveis();

		v1.idade=90;

		if(v1.idade > Variaveis.criterio ){
			System.out.println(v1.idade);
		}
		if(v2.idade > Variaveis.criterio ){
			System.out.println("ok");
		}
	}
}