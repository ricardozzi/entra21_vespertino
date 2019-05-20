package cargos;

public class Analista extends Cargo  {
	
	//Construtor
	public Analista(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
				
	}

	// IR
	public void impostoRenda() {
		System.out.println(cargo+" terá que pagar R$ "+salario*0.20+" de IR");

	}
}
