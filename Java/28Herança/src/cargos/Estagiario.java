package cargos;

public class Estagiario extends Cargo {
	
	//Construtor
	public Estagiario(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
				
	}

	// IR
	public void impostoRenda() {
		System.out.println("N�o h� imposto de renda pra Estagi�rio");
	}
}
