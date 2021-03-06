package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Carrinho;
import dados.Dados;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import formularios.Formulario02;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class Formulario01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private  int contador1, contador2,contador3,contador4,contador5,contador6,contador7,contador8;
	private JTable table;


	public Formulario01() {
		Carrinho c = new Carrinho();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 644, 704);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArroz = new JLabel("        Arroz");
		lblArroz.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lblArroz.setBounds(10, 25, 109, 95);
		contentPane.add(lblArroz);
		
		JLabel lbPao = new JLabel("        P\u00E3o");
		lbPao.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lbPao.setBounds(180, 25, 109, 95);
		contentPane.add(lbPao);
		
		JLabel lbCarne = new JLabel("        Carne");
		lbCarne.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lbCarne.setBounds(353, 25, 109, 95);
		contentPane.add(lbCarne);
		
		JLabel lbSabao = new JLabel("        Sab\u00E3o");
		lbSabao.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lbSabao.setBounds(509, 25, 109, 95);
		contentPane.add(lbSabao);
		
		JLabel lbAmido = new JLabel("        Amido");
		lbAmido.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lbAmido.setBounds(10, 207, 109, 95);
		contentPane.add(lbAmido);
		
		JLabel lbVinho = new JLabel("        Vinho");
		lbVinho.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lbVinho.setBounds(180, 207, 109, 95);
		contentPane.add(lbVinho);
		
		JLabel lbEsponja = new JLabel("        Esponja");
		lbEsponja.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lbEsponja.setBounds(353, 207, 109, 95);
		contentPane.add(lbEsponja);
		
		JLabel lbPente = new JLabel("        Pente");
		lbPente.setFont(new Font("Berlin Sans FB Demi", Font.PLAIN, 17));
		lbPente.setBounds(509, 207, 109, 95);
		contentPane.add(lbPente);
		
		JButton btnArrozMais = new JButton("+");
		btnArrozMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Acao a = new Acao();
				contador1++;
				a.arroz(c);
				c.setContador1(contador1);
				
				
				
				//Atualizar a tabela
				table.setModel(a.Atualiza());
				
			}
		});
		btnArrozMais.setBounds(20, 131, 41, 23);
		contentPane.add(btnArrozMais);
		
		JButton btnArrozMenos = new JButton("-");
		btnArrozMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador1--;
				Acao a = new Acao();
				a.arroz(c);
				c.setContador1(contador1);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnArrozMenos.setBounds(78, 131, 41, 23);
		contentPane.add(btnArrozMenos);
		
		JButton btnPaoMais = new JButton("+");
		btnPaoMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador2++;
				Acao a = new Acao();
				a.pao(c);
				c.setContador2(contador2);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnPaoMais.setBounds(190, 131, 41, 23);
		contentPane.add(btnPaoMais);
		
		JButton btnPaoMenos = new JButton("-");
		btnPaoMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador2--;
				Acao a = new Acao();
				a.pao(c);
				c.setContador2(contador2);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnPaoMenos.setBounds(248, 131, 41, 23);
		contentPane.add(btnPaoMenos);
		
		JButton btnCarneMais = new JButton("+");
		btnCarneMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador3++;
				Acao a = new Acao();
				a.carne(c);
				c.setContador3(contador3);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnCarneMais.setBounds(363, 131, 41, 23);
		contentPane.add(btnCarneMais);
		
		JButton btnCarneMenos = new JButton("-");
		btnCarneMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador3--;
				Acao a = new Acao();
				a.carne(c);
				c.setContador3(contador3);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnCarneMenos.setBounds(421, 131, 41, 23);
		contentPane.add(btnCarneMenos);
		
		JButton btnSab�oMais = new JButton("+");
		btnSab�oMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador4++;
				Acao a = new Acao();
				a.sabao(c);
				c.setContador4(contador4);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnSab�oMais.setBounds(519, 131, 41, 23);
		contentPane.add(btnSab�oMais);
		
		JButton btnSab�oMenos = new JButton("-");
		btnSab�oMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador4--;
				Acao a = new Acao();
				a.sabao(c);
				c.setContador4(contador4);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnSab�oMenos.setBounds(577, 131, 41, 23);
		contentPane.add(btnSab�oMenos);
		
		JButton btnAmidoMais = new JButton("+");
		btnAmidoMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador5++;
				Acao a = new Acao();
				a.amido(c);
				c.setContador5(contador5);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnAmidoMais.setBounds(20, 313, 41, 23);
		contentPane.add(btnAmidoMais);
		
		JButton btnAmidoMenos = new JButton("-");
		btnAmidoMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador5--;
				Acao a = new Acao();
				a.amido(c);
				c.setContador5(contador5);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnAmidoMenos.setBounds(78, 313, 41, 23);
		contentPane.add(btnAmidoMenos);
		
		JButton btnVinhoMais = new JButton("+");
		btnVinhoMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador6++;
				Acao a = new Acao();
				a.vinho(c);
				c.setContador6(contador6);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnVinhoMais.setBounds(190, 313, 41, 23);
		contentPane.add(btnVinhoMais);
		
		JButton btnVinhoMenos = new JButton("-");
		btnVinhoMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador6--;
				Acao a = new Acao();
				a.vinho(c);
				c.setContador6(contador6);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnVinhoMenos.setBounds(248, 313, 41, 23);
		contentPane.add(btnVinhoMenos);
		
		JButton btnEsponjaMais = new JButton("+");
		btnEsponjaMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador7++;
				Acao a = new Acao();
				a.esponja(c);
				c.setContador7(contador7);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnEsponjaMais.setBounds(363, 313, 41, 23);
		contentPane.add(btnEsponjaMais);
		
		JButton btnEsponjaMenos = new JButton("-");
		btnEsponjaMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador7--;
				Acao a = new Acao();
				a.esponja(c);
				c.setContador7(contador7);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnEsponjaMenos.setBounds(421, 313, 41, 23);
		contentPane.add(btnEsponjaMenos);
		
		JButton btnPenteMais = new JButton("+");
		btnPenteMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador8++;
				Acao a = new Acao();
				a.pente(c);
				c.setContador8(contador8);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnPenteMais.setBounds(519, 313, 41, 23);
		contentPane.add(btnPenteMais);
		
		JButton btnPenteMenos = new JButton("-");
		btnPenteMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contador8--;
				Acao a = new Acao();
				a.pente(c);
				c.setContador8(contador8);
				//Atualizar a tabela
				table.setModel(a.Atualiza());
			}
		});
		btnPenteMenos.setBounds(577, 313, 41, 23);
		contentPane.add(btnPenteMenos);
		
		JLabel lblNewLabel = new JLabel(" Quantidade");
		lblNewLabel.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblNewLabel.setBounds(44, 370, 109, 35);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(150, 379, 30, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnVerLista = new JButton("Ver Lista");
		btnVerLista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Formulario02 f = new Formulario02();
				f.setVisible(true);
			}
		});
		btnVerLista.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 18));
		btnVerLista.setBounds(200, 378, 182, 23);
		contentPane.add(btnVerLista);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(44, 430, 522, 224);
		contentPane.add(scrollPane);
		
		Dados d = new Dados ();
		Acao a = new Acao();
		table = new JTable(a.Atualiza());
		scrollPane.setViewportView(table);
	}
}
