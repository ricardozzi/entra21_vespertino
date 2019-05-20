package cargos;

public class Desenvolvedor extends Cargo {
	
	//Construtor
	public Desenvolvedor(String cargo, double salario) {
		this.cargo = cargo;
		this.salario = salario;
				
	}

	//IR
	public void impostoRenda() {
		System.out.println(cargo+" terá que pagar R$ "+salario*0.10+" de IR");
	}
}
