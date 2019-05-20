package exemplo04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame();
		formulario.setSize(500, 90);
		formulario.setTitle("Meu primeiro Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Criar uma caixa de cobin��o
		JComboBox<String> opcoes = new JComboBox<String>();
		opcoes.setBounds(10, 10, 300, 30);
		opcoes.addItem("Op��o 1");
		opcoes.addItem("Op��o 2");
		opcoes.addItem("Op��o 3");
		
		//bot�o
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(330, 10, 140, 30);
		
		//A��o do bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter a op�ao selecionada
				String opcao = opcoes.getSelectedItem().toString();
				
				//Exibir op��o selecionada
				JOptionPane.showMessageDialog(null, opcao);
				
			}
		});
		
		//adicionar elemeyo ao formul�rio
		formulario.add(opcoes);
		formulario.add(botao);
		
		//exibir o formulari e seus componetes internos
		formulario.setVisible(true);

	}

}
