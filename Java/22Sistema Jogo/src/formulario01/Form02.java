package formulario01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao01.Acao;
import beans01.Jogo;

import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ref.Cleaner;
import java.awt.event.ActionEvent;

public class Form02 extends JFrame {

	private JPanel contentPane;


	public Form02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Acao a = new Acao();
		Jogo j = new Jogo();
		a.estatistica(j);
		
		JLabel lblEstatscas = new JLabel("Estat\u00EDscas");
		lblEstatscas.setBounds(222, 50, 74, 14);
		contentPane.add(lblEstatscas);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 75, 500, 253);
		contentPane.add(textArea);
		textArea.setText(Acao.estatisticas);
		
		
		JButton btnVoltar = new JButton("voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form01 f = new Form01();
				f.setVisible(true);
				dispose();
				textArea.setText("");
				
				
				
			}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
		
	}
}
