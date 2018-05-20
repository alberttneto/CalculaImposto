
public abstract class Pessoa implements InterfaceImposto {
	
	//Atributos
	protected String nome;
	protected String Cadunico;
	
	//Metodo construtor
	public Pessoa(String nome2, String cadunico2) {
		this.nome = nome2;
		this.Cadunico = cadunico2;
	}
	
	//Metodo abstrato de imprimir
	public abstract String imprime();
	
	

	
	

}
