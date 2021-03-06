package formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.jdi.Value;

import acao.Acao;
import beans.Colaborador;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Formulario01 extends JFrame {

	private JPanel contentPane;
	private JTextField textColab;
	private JTextField textSBruto;
	private JTextField textVale;
	private JTextField textImposto;
	private JTextField textSLiquido;
	private JTable table;

	
	public Formulario01() {
		Acao a = new Acao();
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 678, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbCargo = new JComboBox();
		cbCargo.setBounds(409, 30, 247, 22);
		contentPane.add(cbCargo);
		
		JCheckBox chbVale = new JCheckBox("");
		chbVale.setBounds(138, 87, 28, 23);
		contentPane.add(chbVale);
		
		JLabel lblColaborador = new JLabel("Colaborador");
		lblColaborador.setBounds(34, 33, 100, 14);
		contentPane.add(lblColaborador);
		
		textColab = new JTextField();
		textColab.setBounds(129, 31, 193, 20);
		contentPane.add(textColab);
		textColab.setColumns(10);
		
		JLabel lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(351, 34, 51, 14);
		contentPane.add(lblCargo);
		
		
		
		//Colaborador c = new Colaborador();
		//c.setCargo(cbCargo.getSelectedItem().toString());
		//Acao.vetorColaborador.add(c);
		
		
		JLabel lblSalrioBruto = new JLabel("Sal\u00E1rio Bruto");
		lblSalrioBruto.setBounds(34, 59, 89, 14);
		contentPane.add(lblSalrioBruto);
		
		textSBruto = new JTextField();
		textSBruto.setEditable(false);
		textSBruto.setBounds(129, 59, 193, 20);
		contentPane.add(textSBruto);
		textSBruto.setColumns(10);
		
		JCheckBox chbClube = new JCheckBox("Clube Fidelidade");
		chbClube.setBounds(351, 56, 112, 23);
		contentPane.add(chbClube);
		chbClube.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Clube
				//faltas
				int indiceCombo = cbCargo.getSelectedIndex();
				double salarioBruto = a.vSalarioB(indiceCombo);
				boolean checkBox = chbVale.isSelected();
				double salarioLiquido = a.salarioLiquido(indiceCombo, checkBox, salarioBruto);
				boolean clube = chbClube.isSelected();
				double clubeF = a.clube(clube);
				textSLiquido.setText(String.valueOf(salarioLiquido-clubeF));
				
			}
		});
		
		JCheckBox chbSaude = new JCheckBox("Plano de Sa\u00FAde");
		chbSaude.setBounds(479, 56, 137, 23);
		contentPane.add(chbSaude);
		
		JLabel lblValeTransporte = new JLabel("Vale Transporte");
		lblValeTransporte.setBounds(34, 92, 103, 14);
		contentPane.add(lblValeTransporte);
		
		
		
		textVale = new JTextField();
		textVale.setEditable(false);
		textVale.setBounds(173, 90, 149, 20);
		contentPane.add(textVale);
		textVale.setColumns(10);
		
		JLabel lblImpostoDeRenda = new JLabel("Imposto de Renda");
		lblImpostoDeRenda.setBounds(351, 92, 112, 14);
		contentPane.add(lblImpostoDeRenda);
		
		textImposto = new JTextField();
		textImposto.setEditable(false);
		textImposto.setBounds(460, 89, 196, 20);
		contentPane.add(textImposto);
		textImposto.setColumns(10);
		
		JLabel lblSalrioLquido = new JLabel("Sal\u00E1rio L\u00EDquido");
		lblSalrioLquido.setBounds(351, 126, 89, 14);
		contentPane.add(lblSalrioLquido);
		
		textSLiquido = new JTextField();
		textSLiquido.setEditable(false);
		textSLiquido.setBounds(460, 123, 196, 20);
		contentPane.add(textSLiquido);
		textSLiquido.setColumns(10);
		
		JLabel lblFaltasNoMs = new JLabel("Faltas no m\u00EAs");
		lblFaltasNoMs.setBounds(34, 126, 89, 14);
		contentPane.add(lblFaltasNoMs);
		
		JSpinner spnFaltas = new JSpinner();
		spnFaltas.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				//faltas
				int indiceCombo = cbCargo.getSelectedIndex();
				double salarioBruto = a.vSalarioB(indiceCombo);
				boolean checkBox = chbVale.isSelected();
				double salarioLiquido = a.salarioLiquido(indiceCombo, checkBox, salarioBruto);
				int faltasTrabalho = Integer.parseInt(spnFaltas.getValue().toString());
				double faltas = a.faltas(faltasTrabalho);
				textSLiquido.setText(String.valueOf(faltas+salarioLiquido));
			}
		});
		spnFaltas.setBounds(129, 123, 51, 20);
		contentPane.add(spnFaltas);
		
		
		chbVale.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				try {
					boolean checkBox = chbVale.isSelected();
					double salarioBruto = Double.parseDouble(textSBruto.getText());
					
					//Obter o valor desconto do VT
					double valetransporte = a.ValeTrans(checkBox, salarioBruto);
					
					//Exibir o VT
					textVale.setText(String.valueOf(valetransporte));
					
					//parte do sal�rio l�quio
					int indiceCombo = cbCargo.getSelectedIndex();
					double salarioLiquido = a.salarioLiquido(indiceCombo, checkBox, salarioBruto);
					textSLiquido.setText(String.valueOf(salarioLiquido));
					
				} catch (Exception erro) {
					JOptionPane.showMessageDialog(null, "Cargo n�o selecionado!");
				}
				
				
			}
		});
		
		
		
		cbCargo.addItem("Cargo");
		cbCargo.addItem("Estagi�rio");
		cbCargo.addItem("Desenvolvedor Jr");
		cbCargo.addItem("Desenvolvedor Pleno");
		cbCargo.addItem("Desenvolvedor S�nior");
		cbCargo.addItem("Analista de Sistema Jr");
		cbCargo.addItem("Analista de Sistema Pleno");
		cbCargo.addItem("Analista de Sistema S�nior");
		cbCargo.addItem("Arquiteto de Software");
		cbCargo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int indiceCombo = cbCargo.getSelectedIndex();
				double salarioBruto = a.vSalarioB(indiceCombo);
				textSBruto.setText(String.valueOf(salarioBruto));
				
				//parte do valetransporte
				//Obter o valor desconto do VT
				boolean checkBox = chbVale.isSelected();
				double valetransporte = a.ValeTrans(checkBox, salarioBruto);
				
				//Exibir o VT
				textVale.setText(String.valueOf(valetransporte));
				
				//Parte do Imposto de renda
				double salrioBruto2 = a.impostoDeRenda(indiceCombo);
				textImposto.setText(String.valueOf(salrioBruto2));
				
				//parte do sal�rio l�quio
				double salarioLiquido = a.salarioLiquido(indiceCombo, checkBox, salarioBruto);
				textSLiquido.setText(String.valueOf(salarioLiquido));
				
				//faltas
				int faltasTrabalho = Integer.parseInt(spnFaltas.getValue().toString());
				double faltas = a.faltas(faltasTrabalho);
				textSLiquido.setText(String.valueOf(faltas+salarioLiquido));
				
				//Clube
				boolean clube = chbClube.isSelected();
				double clubeF = a.clube(clube);
				textSLiquido.setText(String.valueOf(salarioLiquido-clubeF));
				
				//Plano de sa�de
				boolean Plano = chbClube.isSelected();
				double PlanoS = a.plano(Plano);
				textSLiquido.setText(String.valueOf(salarioLiquido-clubeF));
				
			}
		});
		
		JButton btnCadastrar = new JButton("Cadastrar Colaborador");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Colaborador c = new Colaborador();
				c.setColaborador(textColab.getText());
				c.setsLiquido(Double.parseDouble(textSLiquido.getText()));
				
				
				//Atualiza a Tabela
				table.setModel(a.Atualiza(c));
				
			}
		});
		btnCadastrar.setBounds(34, 181, 144, 39);
		contentPane.add(btnCadastrar);
		
		JButton btnEstatistica = new JButton("Estat\u00EDsticas");
		btnEstatistica.setBounds(216, 181, 144, 39);
		contentPane.add(btnEstatistica);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 233, 646, 238);
		contentPane.add(scrollPane);
		
		Colaborador c = new Colaborador();
		table = new JTable(a.Atualiza(c));
		scrollPane.setViewportView(table);
		
		
	}
}
