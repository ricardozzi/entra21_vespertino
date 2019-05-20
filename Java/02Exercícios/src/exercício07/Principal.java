package exercício07;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int numTab  = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da tabuada que deseja"));
		
//		System.out.println("Número informado: " + numTab);
//		System.out.println(numTab +" X 0 = " + numTab*0);
//		System.out.println(numTab +" X 1 = " + numTab*1);
//		System.out.println(numTab +" X 2 = " + numTab*2);
//		System.out.println(numTab +" X 3 = " + numTab*3);
//		System.out.println(numTab +" X 4 = " + numTab*4);
//		System.out.println(numTab +" X 5 = " + numTab*5);
//		System.out.println(numTab +" X 6 = " + numTab*6);
//		System.out.println(numTab +" X 7 = " + numTab*7);
//		System.out.println(numTab +" X 8 = " + numTab*8);
//		System.out.println(numTab +" X 9 = " + numTab*9);
//		System.out.println(numTab +" X 10 = " + numTab*10);
		
		
		
		String tabuada = ("Número informado: " + numTab);
		 	   tabuada += ("\n"+numTab +" X 0 = " + numTab*0);
		 	   tabuada += ("\n"+numTab +" X 1 = " + numTab*1);
		 	   tabuada += ("\n"+numTab +" X 2 = " + numTab*2);
		 	   tabuada += ("\n"+numTab +" X 3 = " + numTab*3);
		 	   tabuada += ("\n"+numTab +" X 4 = " + numTab*4);
		 	   tabuada += ("\n"+numTab +" X 5 = " + numTab*5);
		 	   tabuada += ("\n"+numTab +" X 6 = " + numTab*6);
		 	   tabuada += ("\n"+numTab +" X 7 = " + numTab*7);
		 	   tabuada += ("\n"+numTab +" X 8 = " + numTab*8);
		 	   tabuada += ("\n"+numTab +" X 9 = " + numTab*9);
		 	   tabuada += ("\n"+numTab +" X 10 = " + numTab*10);
		 	   
		JOptionPane.showMessageDialog(null, tabuada);
	}

}
