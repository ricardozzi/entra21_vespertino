package exemplo03;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		//Exibindo mensagem
		/*JOptionPane.showMessageDialog(null, "Hoje é terça-feira");
		JOptionPane.showMessageDialog  (null, "Erro"       ,"Título",JOptionPane.ERROR_MESSAGE      );
		JOptionPane.showMessageDialog  (null, "Perigo"     ,"Título",JOptionPane.WARNING_MESSAGE    );
		JOptionPane.showMessageDialog  (null, "Tudo Bem?"  ,"Título",JOptionPane.QUESTION_MESSAGE   );
		JOptionPane.showMessageDialog  (null, "Isso é Java","Título",JOptionPane.INFORMATION_MESSAGE);*/
		
		//Obter Dados
		/*String nome   = JOptionPane.showInputDialog("Informe seu nome:");
		int    idade  = Integer.parseInt  (JOptionPane.showInputDialog ("Informe seu idade:" ));
		double altura = Double.parseDouble( JOptionPane.showInputDialog("Informe seu altura:"));
		
		String mensagem  = "Nome: "     + nome;
		       mensagem += "\nIdade: "  + idade;
		       mensagem += "\nAltura: " + altura;
		       
		JOptionPane.showMessageDialog(null,mensagem);
		*/
		
		//Caixa de comfirmação
		/*int resposta = JOptionPane.showConfirmDialog(null, "Gostando de Java?");
		//JOptionPane.showMessageDialog(null, resposta);
		
		switch(resposta) {
		case 0:
			JOptionPane.showMessageDialog(null, "Que bom!");
		break;
		case 1:
			JOptionPane.showMessageDialog(null, "Que Pena!");
		break;
		case 2:
			JOptionPane.showMessageDialog(null, "Você cancelou");
		break;
		
		default:
			JOptionPane.showMessageDialog(null, "Você finalizou!");
		}*/
		       
	}

}
