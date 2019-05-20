package exemplo07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		// Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setTitle("Meu sexto Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Radio button
		JRadioButton rbt01 = new JRadioButton("Opção 01");
		rbt01.setBounds(10, 10, 100, 20);
		rbt01.setActionCommand("Opção 01 ativada");
		
		JRadioButton rbt02 = new JRadioButton("Opção 02");
		rbt02.setBounds(10, 40, 100, 20);
		rbt02.setActionCommand("Opção 02 ativada");
		
		JRadioButton rbt03 = new JRadioButton("Opção 03");
		rbt03.setBounds(10, 70, 100, 20);
		rbt03.setActionCommand("Opção 03 ativada");
		
		//Agrupar Jradio button
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbt01);
		bg.add(rbt02);
		bg.add(rbt03);
		
		//botão
		
		JButton botao = new JButton ("Verificar");
		botao.setBounds(10, 110, 150, 20);
		
		//ação do botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//obter o comand
				String valor = bg.getSelection().getActionCommand();
				
				//Exibir o valor
				JOptionPane.showMessageDialog(null, valor);
				
			}
		});
		
		// Adicionar componentes
		formulario.add(rbt01);
		formulario.add(rbt02);
		formulario.add(rbt03);
		formulario.add(botao);
		

		// exibir o formulari e seus componetes internos
		formulario.setVisible(true);

	}

}
