package cargos;

public class Cargo {
	
	//Atributos
	protected String cargo;
	protected double salario;
	
	//Vale transporte
	public void valeTransporte() {
		System.out.println("O cargo:"+cargo+", ter� um desconto de vale transporte no valor de R$ "+salario*0.06);
	}

}
