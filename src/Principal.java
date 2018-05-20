import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando classe calcula imposto
		CalculaImposto cimp = new CalculaImposto();
		String menu =  " ";
		
		//Criando menu de interação com usuario
		do {
				menu = cimp.menu();
			switch (menu) {
			
			case "1": cimp.addPessoaF();
				
				break;
			case "2": cimp.addPessoaJ();
			
				break;
			case "3": JOptionPane.showMessageDialog(null, cimp.imprimeCalc());

			case "4": JOptionPane.showMessageDialog(null, "Saindo!");
			System.exit(0);
			
			default:
				JOptionPane.showMessageDialog(null, "Você digitou opção inexistente!!");
				break;
			}
			
		} while (menu != "4");	
	}
}
