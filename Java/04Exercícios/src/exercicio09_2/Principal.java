package exercicio09_2;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero"));
		
		
		if(n1 < n2) {
			
			for(int i=n1; i <= n2; i++) {
				System.out.println(i);
			}
			
		}else {
			         
			for(int i=n1; i >= n2; i--) {
				System.out.println(i);
			}
			
		}
		
		
		
	}
	
}
