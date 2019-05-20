package exercício31;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int idade1     = Integer.parseInt(JOptionPane.showInputDialog("idade da primeira pessoa:"));
		String nome1   = JOptionPane.showInputDialog("Nome primeira pessoa:");
		int idade2     = Integer.parseInt(JOptionPane.showInputDialog("idade da segunda pessoa: "));
		String nome2   = JOptionPane.showInputDialog("Nome segunda pessoa:");
		int idade3     = Integer.parseInt(JOptionPane.showInputDialog("idade da segunda pessoa: "));
		String nome3   = JOptionPane.showInputDialog("Nome terceira pessoa:");
		
		if ((idade1 > idade2) && (idade1 > idade3)) {
			JOptionPane.showMessageDialog(null,nome1+" com "+ idade1+" anos de idade é o mais velho.");
		}else 
			if ((idade2 > idade1)&&(idade2 > idade3)) {
				JOptionPane.showMessageDialog(null,nome2+" com " +idade2+" anos de idade é o mais velho.");
			}else 
				if ((idade3 > idade1)&&(idade3 > idade2)) {
					JOptionPane.showMessageDialog(null,nome3+" com " +idade3+" anos de idade é o mais velho.");
				}else 
					JOptionPane.showMessageDialog(null,"As três pessoas tem a mesma idae:"+"\n"+idade1+" anos,"+idade2+" anos,"+idade3+" anos.");
		

	}

}
