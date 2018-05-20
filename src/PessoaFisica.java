
public class PessoaFisica extends Pessoa {
	
	//Atributo
	private double re;
	
	//Metodo construtor
	public PessoaFisica(String nome, String Cadunico, double re) {
		super(nome, Cadunico);
		this.re = re;
	}
	
	//Metodos get e set
	public double getRe() {
		return re;
	}

	public void setRe(double re) {
		this.re = re;
	}

	//Metodo que calcula imposto pessoa fisica
	public double calcularImposto() {
		return this.re * 0.15;
		
	}

	//Metodo que imprime o imposto a ser pago
	public String imprime() {
		String retorna = "Nome: " + this.nome + "\n" + 
						 "CPF: " + this.Cadunico + "\n" +
						 "Valor do importo: " + this.calcularImposto();
		
		
		return retorna;
	}
	
	
	

}
