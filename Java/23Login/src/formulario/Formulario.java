package formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import acao.Acao;
import beans.Login;
import principal.Principal;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JPasswordField pasSenha;

	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 288, 165);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(10, 14, 48, 14);
		contentPane.add(lblUsurio);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(66, 11, 181, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(10, 54, 48, 14);
		contentPane.add(lblSenha);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				Login l = new Login();
				l.setUsu(textUsuario.getText());
				l.setSenha(String.valueOf(pasSenha.getPassword()));
				String usuario;
				String tipo;
			
				Acao a = new Acao();
				boolean valida = a.validarLogin2(l);
				
				if (valida == true) {
					Formulario02 f = new Formulario02();
					f.setVisible(true);
					dispose();
				}else
					JOptionPane.showMessageDialog(null, "Usuário inválido");
			}
		});
		btnEntrar.setBounds(93, 94, 89, 23);
		contentPane.add(btnEntrar);
		
		pasSenha = new JPasswordField();
		pasSenha.setEchoChar('*');
		pasSenha.setBounds(66, 51, 181, 20);
		contentPane.add(pasSenha);
	}
}
