package exerc�cio11;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		Object[] continuar = {"continuar","encerrar cadastros"};
		Object[] socios = {"sim ","n�o"};
		Object[] sexos = {"Femenino","Masculino"};
		String nome = "", cargo = "", mostra = "", nomemaior = "";
		int horasnormais = 0, horasextras = 0,  horasextrascem = 0, faltas = 0, filhos = 0, codCargo = 0, sexo = 0, femenino = 0, masculino = 0, idade = 0
		  , socio = 0, sim = 0, nao = 0, continuando = 0, continuar2 = 0, encerrar = 0, funcionarios = 0, contador1 = 0, contador2 = 0
		  , contador3 = 0, contador4 = 0, dJunior = 0, dPleno = 0, dSenior = 0, adminbd = 0, anaJunior = 0, anaSenior = 0, anaPleno = 0
		  , arqSoft = 0, gerente = 0;
		double salarioliq = 0, salariomaior = 0, valorhora = 0, salariobruto = 0, valetransporte = 0, inss = 0, total = 0, premiofalta = 0, clube = 0, aumentofilho = 0; 
		
		
		
		do {
			if (salarioliq > salariomaior) {
				salariomaior = salarioliq;
				nomemaior = nome;
			}
			
			nome = JOptionPane.showInputDialog("Informe seu nome");
			//pedindo o cargo que poderia serfeito com um Object[] cargos = {"tal","tal"};
			cargo+= "\n informe o n�mero de seu cargo:";
			cargo+= "\n 1 - Desenvolvedor Java J�nior";
			cargo+= "\n 2 - Desenvolvedor Java Pleno";
			cargo+= "\n 3 - Desenvolvedor Java S�nior";
			cargo+= "\n 4 - Administrador de Bancos de Dados";
			cargo+= "\n 5 - Analista J�nior";
			cargo+= "\n 6 - Analista Pleno";
			cargo+= "\n 7 - Analista S�nior";
			cargo+= "\n 8 - Arquiteto de Software";
			cargo+= "\n 9 - Gerente de Projetos";
			codCargo = Integer.parseInt(JOptionPane.showInputDialog(cargo));
			
			switch(codCargo) {
				case 1:
					dJunior++;
				break;
				case 2:
					dPleno++;
				break;
				case 3:
					dSenior++;
				break;
				case 4:
					dPleno++;
				break;
				case 5:
					anaJunior++;
				break;
				case 6:
					anaPleno++;
				break;
				case 7:
					anaSenior++;
				break;
				case 8:
					arqSoft++;
				break;
				case 9:
					gerente++;
				break;}
				
			
			horasnormais   = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de horas trabalhadas normalmente: "));
			horasextras    = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de horas extras trabalhadas: "));
			horasextrascem = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de horas extras de final de semana: "));
			
			sexo = JOptionPane.showOptionDialog(null,"Informe o sexo:","Sexo",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,sexos,0);
			
			//Contabilizar os sexos
			switch(sexo) {
			case 0:
				femenino++;
			break;
			case 1:
				masculino++;
			break;}
			
			do {
				idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));
				if ((idade<=0)||(idade>100)) {
					continuando = 0;
				}else
					continuar2 = 1;
				if (idade<26) {
					contador1++;	
				}else
					if (idade<40) {
						contador2++;
					}else
						if (idade<50) {
							contador3++;
						}else
							contador4++;
		
			} while (continuar2 ==0);
			
			faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de faltas: "));
			filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe o n�mero de filhos: "));
			
			socio = JOptionPane.showOptionDialog(null,"Voc� � S�cio?","Sociedade",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,socios,0);
			
			//Contabilizar os socios
			switch(socio) {
			case 0:
				sim++;
			break;
			case 1:
				nao++;
			break;}
			
			valorhora   = Double.parseDouble(JOptionPane.showInputDialog("Informe o ganho por hora:"));
			continuando = JOptionPane.showOptionDialog(null,"","Finalisar",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,continuar,0);
			funcionarios++;
			
			//Calculo
			
			total = (valorhora * horasnormais)+(((valorhora * horasextras)*1.5)+((valorhora * horasextrascem)*2));
			
			//desconto INSS
			if (total<=2000) {
				inss = total * 0.05;
			}else
				if (total<=3500) {
					inss = total * 0.07;
				}else
					if (total<=5600) {
					inss = total * 0.08;
					}else {
						inss = total * 0.10;}
			
			if (faltas == 0) {
				premiofalta = 200;}
					
			if (socio == 0) {
				clube = 110;}
			
			if (filhos != 0) {
				aumentofilho = filhos * 50;}
			
			valetransporte = total * 0.06;
			salarioliq = (total + premiofalta + aumentofilho)- (inss+ valetransporte + clube); 
				
			mostra+= "\n O sal�rio l�quido de "+nome +" � R$"+ salarioliq;
			
			
			JOptionPane.showMessageDialog(null, mostra);
		} while (continuando == 0 );
			
		mostra+= "\n N�meros d funcion�rios = "+ funcionarios;
		mostra+= "\n Mulheres: "+femenino+" -- "+(femenino*100)/funcionarios + " %" ;
		mostra+= "\n Homens: "+masculino+" -- "+(masculino*100)/funcionarios + " %" ;
		mostra+= "\n funcion�rios com idade entre 18 a 26: "+ contador1 ;
		mostra+= "\n funcion�rios com idade entre 27 a 40: "+contador2 ;
		mostra+= "\n funcion�rios com idade entre 41 a 50: "+contador3 ;
		mostra+= "\n funcion�rios com idade maior que  50: "+contador4 ;
		mostra+= "\n Desenvolvedor Java J�nior - "+dJunior+" funcion�rios no cargo - "+(dJunior*100)/funcionarios + " %" ;
		mostra+= "\n Desenvolvedor Java Pleno"+dPleno+" funcion�rios no cargo - "+(dPleno*100)/funcionarios + " %" ;
		mostra+= "\n Desenvolvedor Java S�nior"+dSenior+" funcion�rios no cargo - "+(dSenior*100)/funcionarios + " %" ;
		mostra+= "\n Administrador de Bancos de Dados"+adminbd+" funcion�rios no cargo - "+(adminbd*100)/funcionarios + " %" ;
		mostra+= "\n Analista J�nior"+anaJunior+" funcion�rios no cargo - "+(anaJunior*100)/funcionarios + " %" ;
		mostra+= "\n Analista Pleno"+anaPleno+" funcion�rios no cargo - "+(anaPleno*100)/funcionarios + " %" ;
		mostra+= "\n Analista S�nior"+anaSenior+" funcion�rios no cargo - "+(anaSenior*100)/funcionarios + " %" ;
		mostra+= "\n Arquiteto de Software"+arqSoft+" funcion�rios no cargo - "+(arqSoft*100)/funcionarios + " %" ;
		mostra+= "\n Gerente de Projetos"+gerente+" funcion�rios no cargo - "+(gerente*100)/funcionarios + " %" ;
		mostra+= "\n N�meros d funcion�rios do socios do clube = "+ sim;
		mostra+= "\n pessoa com maiorr sal�rio � "+ nome+" com sal�rio "+ salariomaior;
		
		JOptionPane.showMessageDialog(null, mostra);
	
	}
	

}
