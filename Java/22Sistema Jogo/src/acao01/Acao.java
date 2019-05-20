package acao01;


import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import beans01.Jogo;
import formulario01.Form01;
import formulario01.Form02;
import principal01.Principal;

public class Acao {
	//varáveis
	int pc, xbox, play, ficcao, sobrev, terror,tiro;
	
	
	
	//ArrayList
		public static ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();
		public static String estatisticas = "";
		public static boolean existe = true;
		
		//Validar jogo
		private boolean validarJogo(Jogo j) {
			
			boolean existe = false;
			
			for(int i=0; i<vetorJogos.size(); i++) {

				String nomeJogoSelecionado = vetorJogos.get(i).getNomeJogo();
				String plataformaJogoSelecionado = vetorJogos.get(i).getPlataforma();
				
				if((nomeJogoSelecionado.equals(j.getNomeJogo())) && (plataformaJogoSelecionado.equals(j.getPlataforma()))) {
					existe = true;
				}
				
			}
			
			return existe;
			
		}
		
		
		//Cadatro
		public boolean cadastrar(Jogo j) {
			
			boolean validarJogo = validarJogo(j);
			
			if(validarJogo == false) {
			vetorJogos.add(j);
			}
			
			return validarJogo;
			
		}
		
		
		
		//Selecionar
	public DefaultTableModel selecionar() {
		DefaultTableModel dadosTabela = new DefaultTableModel();
		dadosTabela.addColumn("Nome");
		dadosTabela.addColumn("Gênero");
		dadosTabela.addColumn("Plataforma");
		dadosTabela.addColumn("Classificação");
		dadosTabela.addColumn("valor");

		for (int i = 0; i < Acao.vetorJogos.size(); i++) {
			dadosTabela.addRow(new Object[] { 
					vetorJogos.get(i).getNomeJogo(), 
					vetorJogos.get(i).getGenero(),
					vetorJogos.get(i).getPlataforma(), 
					vetorJogos.get(i).getClassificcao(),
					vetorJogos.get(i).getValor() });

		}
			
		return dadosTabela;
		}

		// Excluir
		public void excluir(int indice) {
			vetorJogos.remove(indice);
			
	
		}
		
		//Estatística
		public void estatistica(Jogo j) {
			
			estatisticas = "";
			
			for (int i = 0; i < vetorJogos.size(); i++) {
				if (vetorJogos.get(i).getPlataforma().contains("PC")) {
					pc++;
				} else if (vetorJogos.get(i).getPlataforma().contains("Xbox One")) {
					xbox++;
				}else if (vetorJogos.get(i).getPlataforma().contains("Playstation 4")) {
					play++;
				}
				
			}
			for (int i = 0; i < vetorJogos.size(); i++) {
				if (vetorJogos.get(i).getGenero().contains("Ficção")) {
					ficcao++;
				} else if (vetorJogos.get(i).getGenero().contains("Sobrevivência")) {
					sobrev++;
				}else if (vetorJogos.get(i).getGenero().contains("Tiro")) {
					tiro++;
				}else if (vetorJogos.get(i).getGenero().contains("Terror")) {
					terror++;
				}
				
			}
			estatisticas+=("\n"+"Quantidade de jogos nas plataformas "+"\n   PC: "+(String.valueOf(pc))+"\n   Xbox One: "+(String.valueOf(xbox))+"\n   Playstation 4: "+(String.valueOf(play)));
			estatisticas+=("\n"+"Quantidade de jogos nos Gêneros "+"\n   Ficção: "+(String.valueOf(ficcao))+"\n   Sobrevivência: "+(String.valueOf(sobrev))+"\n   Terror: "+(String.valueOf(terror)+"\n   Tiro: "+(String.valueOf(tiro))));
		}
		
		//Alterar
		public void alterar(int indice, Jogo j) {
			vetorJogos.set(indice, j);
			
			
		}
		//Limpar
		public void limpar(Jogo j) {
			
			
		}

		// verificaçao de multiplos dados iguais
		/*public void duplicidade(Jogo j) {
			for (int i = 0; i < vetorJogos.size(); i++) {
		
						
					
				}
			}*/
			
	
		
}
