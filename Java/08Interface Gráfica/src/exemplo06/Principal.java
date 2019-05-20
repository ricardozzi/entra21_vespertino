package exemplo06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// Criar um formul�rio
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setTitle("Meu sexto Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JCHECbox
		JCheckBox ckb01 = new JCheckBox("op��o 01");
		ckb01.setBounds(10, 10, 100, 20);
		
		JCheckBox ckb02 = new JCheckBox("op��o 02");
		ckb02.setBounds(10, 40, 100, 20);
		
		JCheckBox ckb03 = new JCheckBox("op��o 03");
		ckb03.setBounds(10, 70, 100, 20);
		
		//bot�o
		
		JButton botao = new JButton("Verificar op��es ativas");
		botao.setBounds(10, 110, 200, 30);
		
		//a��o bot�o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if (ckb01.isSelected()) {
					JOptionPane.showMessageDialog(null, "Primeira op��o selecionada");
				}
				
				if (ckb02.isSelected()) {
					JOptionPane.showMessageDialog(null, "segunda op��o selecionada");
				}
				
				if (ckb03.isSelected()) {
					JOptionPane.showMessageDialog(null, "terceira op��o selecionada");
				}
				
			}
		});
		
		//adicionar componentes ao formul�rio
		formulario.add(ckb01);
		formulario.add(ckb02);
		formulario.add(ckb03);
		formulario.add(botao);
		
		//exibir o formulari e seus componetes internos
		formulario.setVisible(true);

	}

}
