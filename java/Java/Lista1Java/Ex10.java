public class Ex10 {
	
	public static void main(String[] args){
		java.util.ArrayList<String> mesesFuturos = new java.util.ArrayList<String>();
		int mes = 8;

		switch(mes) {
			case 1: mesesFuturos.add("Janeiro");
			case 2: mesesFuturos.add("Fevereiro");
			case 3: mesesFuturos.add("Marco");
			case 4: mesesFuturos.add("Abril");
			case 5: mesesFuturos.add("Maio");
			case 6: mesesFuturos.add("Junho");
			case 7: mesesFuturos.add("Julho");
			case 8: mesesFuturos.add("Agosto");
			case 9: mesesFuturos.add("Setembro");
			case 10: mesesFuturos.add("Outubro");
			case 11: mesesFuturos.add("Novembro");
			case 12: mesesFuturos.add("Dezembro");
					break;
			default: break;
		}

		if (mesesFuturos.isEmpty()) {
			System.out.println("numero do mes invalido");
		}else{
			for (String mes1 : mesesFuturos) {
				System.out.println(mes1);
			}
		}

	}

}