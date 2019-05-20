package exemplo09;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Principal {

	public static void main(String[] args) {

		// Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(500, 300);
		formulario.setTitle("Meu nono Form!");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// DefaultTableModel (Engloabar os dados)
		DefaultTableModel dados = new DefaultTableModel();
		dados.addColumn("Nome");
		dados.addColumn("Idade");
		dados.addRow(new Object[] {"Yara", "26"});
		dados.addRow(new Object[] {"Tayler", "18"});
		dados.addRow(new Object[] {"vanessa", "22"});
		dados.addRow(new Object[] {"Roan", "14"});
		
		//JTABLE (Exibir Dados)
		JTable tabela = new JTable(dados);
		
		//JScronnPane (Barra de rolage,)
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 10, 465, 230);
		
		// Adicionar ao formulário
		formulario.add(barraRolagem);

		// exibir o formulario e seus componetes internos
		formulario.setVisible(true);

	}

}
