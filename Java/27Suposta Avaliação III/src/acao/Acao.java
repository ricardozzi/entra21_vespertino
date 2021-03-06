package acao;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import beans.Colaborador;
import formularios.Formulario01;

public class Acao {
	
	//ArrayList
			public static ArrayList<Colaborador> vetorColaborador = new ArrayList<Colaborador>();
			public static String estatisticas = "";
			public static boolean existe = true;

	public void Cadastrar(Colaborador c) {
		
		vetorColaborador.add(c);

	}
	
	public double vSalarioB(int indice) {
		
		double salariobruto = 0;
		
		switch (indice) {
		case 0 :
			salariobruto = 0;
		break;
		case 1:
			salariobruto = 900;
		break;
		case 2:
			salariobruto = 1300;
		break;
		case 3:
			salariobruto = 1800;
		break;
		case 4:
			salariobruto = 2400;
		break;
		case 5:
			salariobruto = 2700;
		break;
		case 6:
			salariobruto = 3200;
		break;
		case 7:
			salariobruto = 3600;
		break;
		case 8:
			salariobruto = 4400;
		break;
		}
		return salariobruto;
		
	}
	
	public double ValeTrans(boolean checkBox, double salarioBruto) {
		
		double valeTransporte = checkBox == true? salarioBruto * 0.06 : 0;
		return valeTransporte;
		
	}
	
	public double impostoDeRenda(int indice) {
		
		double imposto = 0;

		switch (indice) {
		case 1:
			imposto =  0.0;
			break;
		case 2:
			imposto =  1300 * 0.04;
			break;
		case 3:
			imposto =  1800 * 0.055;
			break;
		case 4:
			imposto =  2400 * 0.06;
			break;
		case 5:
			imposto =  2700 * 0.065;
			break;
		case 6:
			imposto =  3200 * 0.07;
			break;
		case 7:
			imposto =  3600 * 0.075;
			break;
		case 8:
			imposto =  4400 * 0.08;
			break;
		}
		return imposto;
	}
	//Sl�rio L�quido
	public double salarioLiquido(int indice, boolean checkBox, double salarioBruto) {
		double imposto = impostoDeRenda(indice);
		double vale = ValeTrans(checkBox, salarioBruto);
		double salarioLiquido = 0;
		
		salarioLiquido = (salarioBruto - vale) - imposto;
		
		return salarioLiquido;
		
	}
	//clube fidelidade
	public double clube( boolean checkBox) {
		double Clube = checkBox == true?  100 : 0;
		return Clube;
		
		}
	
	//Plano de Sa�de
	public double plano( boolean checkBox) {
		double Clube = checkBox == true?  100 : 0;
		return Clube;
		
		}
	
	//Faltas
	public double faltas( int faltasTrabalho) {
		
		double faltas = faltasTrabalho == 0?  50 : 0;
		return faltas;
	}
	
	//Atualiza a Tabela
		public DefaultTableModel Atualiza(Colaborador c) {
			DefaultTableModel dadosTabela = new DefaultTableModel();
			dadosTabela.addColumn("Colaborador");
			dadosTabela.addColumn("Sal�rio L�quido");
	

			for (int i = 0; i < Acao.vetorColaborador.size(); i++) {
				dadosTabela.addRow(new Object[] { 
						vetorColaborador.get(i).getColaborador(), 
						vetorColaborador.get(i).getsLiquido(), });

			}
				
			return dadosTabela;
			}

}
