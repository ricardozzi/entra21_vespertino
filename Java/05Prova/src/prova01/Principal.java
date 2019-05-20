package prova01;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		
		Object[] subdepartamentos1 = {"TVs","Aparelho de som","voltar"};
		Object[] subdepartamentos2 = {"Hardware","Software","voltar"};
		Object[] subdepartamentos3 = {"Masculino","Femenino","voltar"};
		Object[] departamentos = {"Áudio/Vídeo","Informática","Vestuário"};
		Object[] sexos = {"Femenino","Masculino"};
		Object[] opicoes = {"sim","não"};
		Object[] cadastrados = {"sim","não"};
		Object[] pagamentos = {"a vista","a prazo"};
		String nome = "", mostra1 = "", mostra2 = "", mostra3 = "", mostra4 = "", mostra5 = "", mostra6 ="", mostra = "";
		int idade = 0, continuando = 0, continuar2 = 0, contador1 = 0 , contador2 = 0, contador3 = 0, contador4 = 0, sexo = 0, femenino = 0, masculino = 0
		, departamento = 0, audio = 0, informatica = 0, vestuario = 0, subdepartemento1 = 0, subdepartemento2 = 0, subdepartemento3 = 0, tvs = 0
		, som = 0, voltar = 0, quantau = 0,quantinfo = 0,quantvest = 0, opicao = 0, pagamento = 0, funcionarios = 0, cadastrado = 0;
		
		//Primeiro laço pedido do sistema
		do {
			Object[] continuar = {"Usar","não usar"};
			continuando = JOptionPane.showOptionDialog(null,"Deseja usar o sistema?","Finalisar",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,continuar,0);
		} while (continuando == 1);
		
		//Segundo laço para cadastro
		do {
			nome = JOptionPane.showInputDialog("Informe seu nome");
			
			sexo = JOptionPane.showOptionDialog(null,"Informe o sexo:","Sexo",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,sexos,0);
			
			//Contabilizar os sexos
			switch(sexo) {
			case 0:
				femenino++;
			break;
			case 1:
				masculino++;
			break;}
			
			//Pedindo idade e contabilizando ela com as devidas condiçoes
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
			do {
			departamento = JOptionPane.showOptionDialog(null,"Escolha o departamento:","Departamentos",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,departamentos,0);

			//Contabilizar os sexos
			switch(departamento) {
			case 0:
				//audio/video
				audio++;
				
				subdepartemento1 = JOptionPane.showOptionDialog(null,"Escolha o departamento:","Departamentos",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,subdepartamentos1,0);
				//do {
				switch(subdepartemento1) {
				case 0:
					mostra1+= "\n 1 - Smart TV Led 49 Samsung - R$ 4.999,99";
					mostra1+= "\n 2 - Smart TV 4k LG 60 - R$7.499,00";
					mostra1+= "\n 3 - Smart TV Full HD 32 Samsung - R$ 1.710,00 ";
					mostra1+= "\n 4 - voltar";
					tvs = Integer.parseInt(JOptionPane.showInputDialog( mostra1));
					quantau = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
				break;
				case 1:
					mostra2+= "\n 1 - Semp Toshiba Áudio Bright - R$ 599,99 ";
					mostra2+= "\n 2 - Mini System LG - R$ 512,00 ";
					mostra2+= "\n 3 - Mini System Philco - R$ 499,99  ";
					mostra2+= "\n 4 - voltar";
					som = Integer.parseInt(JOptionPane.showInputDialog( mostra2));
					quantau = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
				break;
				case 2:
					subdepartemento1 = 2;
				break;}
			
				//}while ((tvs != 4)||(som != 4));
			break;
			case 1:
				//Informática
				informatica++;
				subdepartemento2 = JOptionPane.showOptionDialog(null,"Escolha o departamento:","Departamentos",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,subdepartamentos2,0);
				switch(subdepartemento1) {
				case 0:
					mostra3+= "\n 1 - Placa Mãe Asus - R$ 2.000,00 ";
					mostra3+= "\n 2 - Memória Ram Corsair 4GB - R$500,00 ";
					mostra3+= "\n 3 - Mouse Multilaser - R$59,90 ";
					mostra3+= "\n 4 - voltar";
					tvs = Integer.parseInt(JOptionPane.showInputDialog( mostra4));
					quantinfo = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
				break;
				case 1:
					mostra4+= "\n 1 - Windows 10  - R$500,00  ";
					mostra4+= "\n 2 - Office 2019   - R$399,99 ";
					mostra4+= "\n 3 - AutoCard 3D - R$899,50 ";
					mostra4+= "\n 4 - voltar";
					som = Integer.parseInt(JOptionPane.showInputDialog( mostra4));
					quantinfo = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
				break;
				case 2:
					subdepartemento2 = 2;
				break;}
			break;
			case 2:
				//Vestuário
				vestuario++;
				subdepartemento3 = JOptionPane.showOptionDialog(null,"Escolha o departamento:","Departamentos",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,subdepartamentos3,0);
				switch(subdepartemento1) {
				case 0:
					mostra5+= "\n 1 - Camisa Social Lacoste - R$ 200,00 ";
					mostra5+= "\n 2 - Calça Jeans Calvin Klein R$ 230,00 ";
					mostra5+= "\n 3 - Camisa Social Dudalina - R$ 130,00 ";
					mostra5+= "\n 4 - voltar";
					tvs = Integer.parseInt(JOptionPane.showInputDialog( mostra1));
					quantvest = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
				break;
				case 1:
					mostra6+= "\n 1 - Camisa Social Dudalina - R$170,00 ";
					mostra6+= "\n 2 - Calça Jeans Miss Masi - R$ 99,90 ";
					mostra6+= "\n 3 - Bermuda Dijean - R$ 74,40 ";
					mostra6+= "\n 4 - voltar";
					som = Integer.parseInt(JOptionPane.showInputDialog( mostra1));
					quantvest = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
				break;
				case 2:
					subdepartemento3 = 2;
				break;}
			break;}
			
			opicao = JOptionPane.showOptionDialog(null,"Deseja comprar mais alguma coisa:","Departamentos",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,opicoes,0);
			switch(opicao) {
			case 0:
				subdepartemento1 = 1;
			break;
			case 1:
				subdepartemento1 = 2;
			break;
			}
			
			} while ((subdepartemento1 != 2)||(subdepartemento2 != 2)||(subdepartemento3 != 2));
			
			pagamento = JOptionPane.showOptionDialog(null,"Deseja comprar mais alguma coisa:","Departamentos",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,pagamentos,0);
			switch(pagamento) {
			case 0:
				if (departamento == 0) { 
					
				};
			break;
			case 1:
				subdepartemento1 = 2;
			break;}
			 
			cadastrado = JOptionPane.showOptionDialog(null,"Deseja comprar mais alguma coisa:","Departamentos",JOptionPane.PLAIN_MESSAGE,JOptionPane.PLAIN_MESSAGE,null,cadastrados,0);
			if (cadastrado ==0) {
				continuando =0;
			}else {
				continuando = 1;
			}
			
			funcionarios++;
			
		} while (continuando ==0);
		
		mostra+= "\n Números d funcionários = "+ funcionarios;
		mostra+= "\n Mulheres: "+femenino+" -- "+(femenino*100)/funcionarios + " %" ;
		mostra+= "\n Homens: "+masculino+" -- "+(masculino*100)/funcionarios + " %" ;
		mostra+= "\n funcionários com idade entre 18 a 26: "+ contador1 ;
		mostra+= "\n funcionários com idade entre 27 a 40: "+contador2 ;
		mostra+= "\n funcionários com idade entre 41 a 50: "+contador3 ;
		mostra+= "\n funcionários com idade maior que  50: "+contador4 ;
		

	}

}
