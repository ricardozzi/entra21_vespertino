package exerc�cio01;

import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		
		//Vari�veis
		String pede = "sim";
		
		while (pede.equals("sim")||pede.equals("SIM")) {
			
			
		
		//pede
		int opera = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o n�mero da opera��o desejada: \n1 - Soma \n2 - subtra��o \n3 -multiplica��o \n4 - Divis�o \n5 - Seno \n6 - Cosseno \n7 - Tangente \n8 - Log \n9 - Raiz Quadrada \n10 - Riz C�bica"));
		double result = 0;
		if (opera <= 4) {
			double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o primeiro valor para sua conta: "));
			double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o segundo valor para sua conta: "));
			
			if (opera == 1) {
				result = n1 + n2;
			}else {
				if (opera == 2) {
					result = n1 - n2;
				}else {
					if (opera == 3) {
						result = n1 * n2;
					}else {
						if (opera == 4) {
							result = n1 / n2;
						}
					}
				}
			}
		}else {
			double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor para seu c�lculo: "));
		
		
						if (opera == 5) {
							result = Math.sin(n3);
						}else {
							if (opera == 6) {
								result = Math.cos(n3);
							}else {
								if (opera == 7) {
									result = Math.tan(n3);
								}else {
									if (opera == 8) {
										result = Math.log(n3);
									}else {
										if (opera == 9) {
											result = Math.sqrt(n3);
										}else {
											if (opera == 10) {
												result = Math.cbrt(n3);
											}else {}
										}
									}
								}
							}
						}
		}
		JOptionPane.showMessageDialog(null, result);
		pede = JOptionPane.showInputDialog("Se deseja continuar usar a calculadora digite 'sim', se n�o digite 'n�o': ");
		}
	}
}


