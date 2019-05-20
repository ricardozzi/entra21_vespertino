package exercício02;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String nome = " ", nome2 = " ", nome3 = " ", nome4 = " ";
		int idade   = 0, contador = 0, idade2 = 0;
		double peso = 0, peso2 = 0, altura = 0, altura2 = 0, somaAltura = 0;
		
		do {
		nome = JOptionPane.showInputDialog("Informe o nome: ");
		
		if (!nome.equals("sair")) {
        contador++;
			idade= Integer.parseInt(JOptionPane.showInputDialog("informe a idade"));
			peso = Double.parseDouble(JOptionPane.showInputDialog("informe o peso: "));
			altura = Double.parseDouble(JOptionPane.showInputDialog("informe a altura: "));
                                                                   			
		if (idade> idade2) {
			idade2 = idade;
			nome2  = nome;}
		
		if (altura> altura2) {
			altura2 = altura;
			nome3  = nome;}
		
		if (peso> peso2) {
			peso2 = peso;
			nome4  = nome;}
		
		somaAltura+= altura;
		}	
		} while (!nome.equals("sair"));
		
		//Exibir o resultado
		
		String resultado ="Informações dos cadastrados:";
		       resultado+="\nJogadores cadastrados: "+contador;
			   resultado+="\nJogador mais alto: "+nome3+" com altura de "+ altura2+".";
			   resultado+="\nJogador mais velho: "+nome2+" com "+ idade2+" anos de idade.";
			   resultado+="\nJogador mais pesado: "+nome4+" com "+peso2+" Kg";
			   resultado+="\nOs Jogadores tem em média: "+somaAltura/contador+" metros";

			   JOptionPane.showMessageDialog(null, resultado);
			   
	}

}
