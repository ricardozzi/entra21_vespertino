package cargos;

public class Estagiario extends Cargo {
	
	//Construtor
	public Estagiario(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
				
	}

	// IR
	public void impostoRenda() {
		System.out.println("Não há imposto de renda pra Estagiário");
	}
}
