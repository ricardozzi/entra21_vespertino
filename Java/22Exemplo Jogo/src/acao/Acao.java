package acao;

import java.util.ArrayList;

import bean.Jogo;

public class Acao {

	//ArrayList
	public static ArrayList<Jogo> vetorJogos = new ArrayList<Jogo>();
	
	//Cadatro
	public void cadastrar(Jogo j) {
		vetorJogos.add(j);
	}
	
}
