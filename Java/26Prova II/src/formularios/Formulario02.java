package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import dados.Dados;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario02 extends JFrame {

	private JPanel contentPane;
	JTable table;

	public Formulario02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblListaDosProdutos = new JLabel("Lista dos Produtos");
		lblListaDosProdutos.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
		lblListaDosProdutos.setBounds(191, 39, 279, 32);
		contentPane.add(lblListaDosProdutos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 111, 522, 224);
		contentPane.add(scrollPane);
		
		Dados d = new Dados ();
		Acao a = new Acao();
		table = new JTable(a.Atualiza());
		scrollPane.setViewportView(table);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Formulario01 f = new Formulario01();
				f.setVisible(true);
				}
		});
		btnVoltar.setBounds(10, 11, 89, 23);
		contentPane.add(btnVoltar);
	}
}
