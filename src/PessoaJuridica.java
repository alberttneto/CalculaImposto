
public class PessoaJuridica extends Pessoa {
	
	//Atributos
	private double fa;
	private double ci;
	
	//Metodo construtor
	public PessoaJuridica(String nome2, String cadunico2, double fa, double ci) {
		super(nome2, cadunico2);
		
		this.fa = fa;
		this.ci = ci;
	}

	//Metodos get e set
	public double getFa() {
		return fa;
	}

	public void setFa(double fa) {
		this.fa = fa;
	}

	public double getCi() {
		return ci;
	}

	public void setCi(double ci) {
		this.ci = ci;
	}

	//Metodo que calcula imposto pessoa juridica
	public double calcularImposto() {
		
		return (0.2*(fa-ci));
	}

	//Metofo que imprime imposto
	public String imprime() {
		String retorna ="Nome: " + this.nome + "\n" + 
				 		"CPF: " + this.Cadunico + "\n" +
				 		"Valor do importo: " + this.calcularImposto();
		
		return retorna;
	}
}
