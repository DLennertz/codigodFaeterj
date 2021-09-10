public class Produto{
	
	private String codigoDeBarra;
	private String nomeProduto;
	private float precoProduto;

	public Produto(String codigoDeBarra, String nomeProduto, float precoproduto){
		this.codigoDeBarra=codigoDeBarra;
		this.nomeProduto=nomeProduto;
		this.precoproduto = precoproduto;
	}

	public Strig getCodigoDeBarra(){return codigoDeBarra;}

	public Strig setCodigoDeBarra(String codigoDeBarra){this.codigoDeBarra = codigoDeBarra}

	public String getNomeProduto(){return nomeProduto;}

	public String setNomeProduto(String nomeProduto){this.nomeProduto = nomeProduto;}

	public float getPrecoProduto(){return precoproduto;}

	public float setPrecoProduto(float precoProduto){this.precoProduto = precoProduto;}
}