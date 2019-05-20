package exercício18;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		double le  = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado esquerdo"));
		double ld  = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado direito"));
		double li  = Double.parseDouble(JOptionPane.showInputDialog("Informe o lado inferior"));
		
		 
		    
		if((li <= le+ld) && ( le <= ld+li) && (ld <= li+le)) {
			
			if ((le  != ld) && (le  != li)) {
				JOptionPane.showMessageDialog(null," escaleno.");
			}else
				if ((li==le)&&(ld==le)&&(ld==li)) {
					JOptionPane.showMessageDialog(null," Equilátero.");	
			}else
				if ((le  == ld) && (ld  != li)||(ld==le)&&(ld!=li)||(li==le)&&(li!=ld)) {
					JOptionPane.showMessageDialog(null," Isóceles.");
				/*else 
				if ((ld < le )&&(ld < li)) {
					JOptionPane.showMessageDialog(null, " é o menor valor informado.");
				}else 
					if ((ld < le )&&(ld < li)) {
						JOptionPane.showMessageDialog(null, " é o menor valor informado.");
					}else 
						JOptionPane.showMessageDialog(null," são iguais.");*/
		}else {
			JOptionPane.showMessageDialog(null,"Não é um triângulo");
		}
				
		}
	}

}
