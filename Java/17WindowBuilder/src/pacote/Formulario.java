package pacote;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, -28, 464, 149);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setFont(new Font("Colonna MT", Font.BOLD, 15));
		btnEnviar.setBackground(Color.CYAN);
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, txtNome.getText());
			}
		});
		btnEnviar.setBounds(176, 57, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(Color.BLUE);
		lblNome.setBackground(Color.WHITE);
		lblNome.setBounds(79, 29, 48, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setForeground(Color.RED);
		txtNome.setBackground(Color.ORANGE);
		txtNome.setBounds(147, 26, 162, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
	}
}
