package acao;

import javax.swing.table.DefaultTableModel;

import beans.Carrinho;
import dados.Dados;

public class Acao {
	
	
	public void arroz(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	public void carne(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	public void pente(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	public void sabao(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	public void esponja(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	public void vinho(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	public void amido(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	public void pao(Carrinho c) {
		Dados.vetorCarrinho.add(c);
		
	}
	
	
	//Atualiza a Tabela
			public DefaultTableModel Atualiza() {
				DefaultTableModel dadosTabela = new DefaultTableModel();
				dadosTabela.addColumn("Arroz");
				dadosTabela.addColumn("Carne");
				dadosTabela.addColumn("Esponja");
				dadosTabela.addColumn("Pente");
				dadosTabela.addColumn("Vinho");
				dadosTabela.addColumn("Sabão");
				dadosTabela.addColumn("Pão");
				dadosTabela.addColumn("Amido");
		

				for (int i = 0; i < Dados.vetorCarrinho.size(); i++) {
					dadosTabela.addRow(new Object[] { 
							Dados.vetorCarrinho.get(i).getContador1(),
							Dados.vetorCarrinho.get(i).getContador2(), 
							Dados.vetorCarrinho.get(i).getContador3(), 
							Dados.vetorCarrinho.get(i).getContador4(), 
							Dados.vetorCarrinho.get(i).getContador5(), 
							Dados.vetorCarrinho.get(i).getContador6(), 
							Dados.vetorCarrinho.get(i).getContador7(), 
							Dados.vetorCarrinho.get(i).getContador8(),
							});

				}
					
				return dadosTabela;
				}
	
}
