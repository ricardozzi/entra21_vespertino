package formulario01;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import acao01.Acao;
import beans01.Jogo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form01 extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtValor;
	private JTable table;
	
	int contador = 0;
	int podecadastrar = 0;


	public Form01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Instanciar objeto da classe Acao
		Acao a = new Acao();
		
		JLabel lblNomeDoJogo = new JLabel("Nome do Jogo");
		lblNomeDoJogo.setBounds(25, 31, 85, 14);
		contentPane.add(lblNomeDoJogo);
		
		txtNome = new JTextField();
		txtNome.setBounds(165, 28, 276, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JComboBox cbGenero = new JComboBox();
		cbGenero.setBounds(165, 59, 176, 22);
		cbGenero.addItem("Ficção");
		cbGenero.addItem("Terror");
		cbGenero.addItem("Sobrevivência");
		cbGenero.addItem("Tiro");
		contentPane.add(cbGenero);
		
		JLabel lblGnero = new JLabel("G\u00EAnero");
		lblGnero.setBounds(25, 63, 81, 14);
		contentPane.add(lblGnero);
		
		JLabel lblPlataforma = new JLabel("Plataforma");
		lblPlataforma.setBounds(25, 104, 96, 14);
		contentPane.add(lblPlataforma);
		
		JComboBox cbPlataforma = new JComboBox();
		cbPlataforma.setBounds(164, 100, 177, 22);
		cbPlataforma.addItem("PC");
		cbPlataforma.addItem("Xbox One");
		cbPlataforma.addItem("Playstation 4");
		contentPane.add(cbPlataforma);
		
		JLabel lblClassificaoIndicativa = new JLabel("Classifica\u00E7\u00E3o indicativa");
		lblClassificaoIndicativa.setBounds(25, 144, 170, 14);
		contentPane.add(lblClassificaoIndicativa);
		
		JComboBox cbClassificacao = new JComboBox();
		cbClassificacao.setBounds(165, 140, 176, 22);
		cbClassificacao.addItem("5 anos");
		cbClassificacao.addItem("10 anos");
		cbClassificacao.addItem("12 anos");
		cbClassificacao.addItem("15 anos");
		cbClassificacao.addItem("18 anos");
		contentPane.add(cbClassificacao);
		
		JLabel lblValorR = new JLabel("Valor R$");
		lblValorR.setBounds(25, 179, 81, 14);
		contentPane.add(lblValorR);
		
		txtValor = new JTextField();
		txtValor.setBounds(165, 176, 176, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		JLabel lblIndice = new JLabel("");
		lblIndice.setBounds(484, 11, 48, 14);
		lblIndice.setVisible(false);
		contentPane.add(lblIndice);
		
		
		
		
		
		JButton btnExcluir = new JButton("excluir");
		btnExcluir.setEnabled(false);
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter o indice
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Chamar o métodode exclusão
				a.excluir(indice);
				
				//Atualizar a tabela
				table.setModel(a.selecionar());
				
				//Limpar campos
				txtNome.setText("");
				txtValor.setText("");
				cbGenero.setSelectedIndex(0);
				cbPlataforma.setSelectedIndex(0);
				cbClassificacao.setSelectedIndex(0);
				
				//Cursor no campo jogo
				txtNome.requestFocus();
				
				//Message
				JOptionPane.showMessageDialog(null, "Jogo excluído com sucesso");
				
			}
		});
		btnExcluir.setBounds(154, 227, 96, 23);
		contentPane.add(btnExcluir);
		
		JButton btnEstatsticas = new JButton("estat\u00EDsticas");
		btnEstatsticas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Form02 f = new Form02();
				f.setVisible(true);
				dispose();
				}
		});
		btnEstatsticas.setEnabled(false);
		btnEstatsticas.setBounds(299, 227, 103, 23);
		contentPane.add(btnEstatsticas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 258, 522, 279);
		contentPane.add(scrollPane);
		
		
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEstatsticas.setEnabled(true);
				
				

				
				//Objeto da classe jogo
				try {

					Jogo j = new Jogo();
				j.setNomeJogo(txtNome.getText());
				j.setValor(Double.parseDouble(txtValor.getText()));
				j.setGenero(cbGenero.getSelectedItem().toString());
				j.setPlataforma(cbPlataforma.getSelectedItem().toString());
				j.setClassificcao(cbClassificacao.getSelectedItem().toString());
				
				
				//Objeto da classe Acao Realizaar cadastro
				boolean valida = a.cadastrar(j);
				
				//Atualizar a tabela
				table.setModel(a.selecionar());
				
				
				//mensagem
				if(valida == false) {
					JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso");
				}else {
					JOptionPane.showMessageDialog(null, "Jogo já cadastrado, tente novamente");
				}
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Falha ao cadastrar, tente novamente!");
				}
				
				
				//Limpar campos
				txtNome.setText("");
				txtValor.setText("");
				cbGenero.setSelectedIndex(0);
				cbPlataforma.setSelectedIndex(0);
				cbClassificacao.setSelectedIndex(0);
				
				//Cursor no campo jogo
				txtNome.requestFocus();
				
				//Contador 
				contador++;

//			}
			}
		});
		btnCadastrar.setBounds(436, 227, 96, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnAlterar = new JButton("Alterar");
		btnAlterar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Obter o indice a ser alterado
				int indice = Integer.parseInt(lblIndice.getText());
				
				//Instanciar um objeto da classe Jogo
				try {
					Jogo j = new Jogo();
					j.setNomeJogo(txtNome.getText());
					j.setValor(Double.parseDouble(txtValor.getText()));
					j.setGenero(cbGenero.getSelectedItem().toString());
					j.setPlataforma(cbPlataforma.getSelectedItem().toString());
					j.setClassificcao(cbClassificacao.getSelectedItem().toString());
					
					//realizar alteração
					a.alterar(indice, j);
					
					//Atualizar a tabela
					table.setModel(a.selecionar());
					
					
					//mensagem
					JOptionPane.showMessageDialog(null, "Alteração realizada com sucesso");
					} catch (Exception erro) {
						JOptionPane.showMessageDialog(null, "Falha ao alterar, tente novamente!");
					}
					
					
					//Limpar campos
					txtNome.setText("");
					txtValor.setText("");
					cbGenero.setSelectedIndex(0);
					cbPlataforma.setSelectedIndex(0);
					cbClassificacao.setSelectedIndex(0);
					
					//Ativar botão cadastrar e desabilitar os outros
					btnAlterar.setEnabled(false);
					btnCadastrar.setEnabled(true);
					btnExcluir.setEnabled(false);
					
					
					//Cursor no campo jogo
					txtNome.requestFocus();
			}
		});
		btnAlterar.setEnabled(false);
		btnAlterar.setBounds(10, 227, 103, 23);
		contentPane.add(btnAlterar);
		
		
		
		table = new JTable(a.selecionar());
		scrollPane.setViewportView(table);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseReleased(MouseEvent e) {
				
				//Obter o indice selecionado
				int indice = table.getSelectedRow();
				
				//obtendo os dados de cada coluna
				String nome          = table.getValueAt(indice, 0).toString();
				String genero        = table.getValueAt(indice, 1).toString();
				String plataforma    = table.getValueAt(indice, 2).toString();
				String classificacao = table.getValueAt(indice, 3).toString();
				double valor         = Double.parseDouble(table.getValueAt(indice, 4).toString());
				
				//enviando dados ao formulário
				lblIndice.setText(String.valueOf(indice));
				txtNome.setText(nome);
				txtValor.setText(String.valueOf(valor));
				
				switch (genero) {
					case "Ficção":
						cbGenero.setSelectedIndex(0);
					break;
					case "Terror":
						cbGenero.setSelectedIndex(1);
					break;
					case "Sobrevivência":
						cbGenero.setSelectedIndex(2);
					break;
					case "Tiro":
						cbGenero.setSelectedIndex(3);
					break;

				default:
					break;
				}
				
				switch (plataforma) {
				case "PC":
					cbPlataforma.setSelectedIndex(0);
				break;
				case "Xbox One":
					cbPlataforma.setSelectedIndex(1);
				break;
				case "Playstation 4":
					cbPlataforma.setSelectedIndex(2);
				break;
			default:
				break;
			}
				switch (classificacao) {
				case "5 anos":
					cbClassificacao.setSelectedIndex(0);
				break;
				case "10 anos":
					cbClassificacao.setSelectedIndex(1);
				break;
				case "12 anos":
					cbClassificacao.setSelectedIndex(2);
				break;
				case "15 anos":
					cbClassificacao.setSelectedIndex(3);
				break;
				case "18 anos":
					cbClassificacao.setSelectedIndex(4);
				break;

			default:
				break;
			}
				
				//Ativar botões de alterar e excluir, e desativar o botão cadastrar
				btnCadastrar.setEnabled(false);
				btnAlterar.setEnabled(true);
				btnExcluir.setEnabled(true);
			}
		});
		
		
	}
}
