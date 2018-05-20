import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CalculaImposto {
	
	//Atributos
	private ArrayList<Pessoa> pessoas;
	private PessoaJuridica pj;
	
	//Metodo construtor
	public CalculaImposto() {
		 this.pessoas = new ArrayList<Pessoa>();
	}
	
	//Metodo que criar e adiciona pessoa fisica a pessoas
	public void addPessoaF() {
		
		String nome = JOptionPane.showInputDialog("Informe nome: ");
		String cpf = JOptionPane.showInputDialog("Informe CPF:");
		double re = Integer.parseInt(JOptionPane.showInputDialog("Informe rendimento anual: "));
				
		PessoaFisica pj = new PessoaFisica(nome, cpf, re);
		
		this.pessoas.add(pj);
	}
	
	//Metodo que cria e adiciona pessoa juridica a pessoas
	public void addPessoaJ() {
		
		String nome = JOptionPane.showInputDialog("Informe nome: ");
		String cnpj = JOptionPane.showInputDialog("Informe CNPJ: ");
		double fa = Integer.parseInt(JOptionPane.showInputDialog("Informe valor do faturamento anual: "));
		double ci = Integer.parseInt(JOptionPane.showInputDialog("Informe valor das Contribuições isentas: "));
		
		PessoaJuridica pf = new PessoaJuridica(nome, cnpj, fa, ci);
		this.pessoas.add(pf);
	}
	
	//Metodo que imprime lista de contribuentes
	public String imprimeCalc() {
		String retorna = " ";
		for (int i = 0; i < this.pessoas.size(); i++) {
			retorna += this.pessoas.get(i).imprime() + "\n" + 
					  "===================================" + "\n";
			
		}
		return retorna;
	}
	
	//Metodo que cria menu
	public String menu() {
		String retorno = JOptionPane.showInputDialog("Calcula imposto: " + "\n" +
									  "1 - Incluir Pessoa Fisica " + "\n" +
									  "2 - Incluir Pessoa Juridica " + "\n" +
									  "3 - Imprimir Valor a contribuir " + "\n" +
									  "4 - Sair ");
		return retorno;
	}
}
