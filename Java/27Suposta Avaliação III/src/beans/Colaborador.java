package beans;

public class Colaborador {

	//Atributos
	private String colaborador, cargo;
	private double sBruto, sLiquido, Vale, Imposto;
	private int faltas;
	private boolean clube, saude, transporte;
	
	//Get & Set
	
	
	public double getVale() {
		return Vale;
	}
	public void setVale(double vale) {
		Vale = vale;
	}
	public double getImposto() {
		return Imposto;
	}
	public void setImposto(double imposto) {
		Imposto = imposto;
	}
	public String getColaborador() {
		return colaborador;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getsBruto() {
		return sBruto;
	}
	public void setsBruto(double sBruto) {
		this.sBruto = sBruto;
	}
	public double getsLiquido() {
		return sLiquido;
	}
	public void setsLiquido(double sLiquido) {
		this.sLiquido = sLiquido;
	}
	public int getFaltas() {
		return faltas;
	}
	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}
	public boolean isClube() {
		return clube;
	}
	public void setClube(boolean clube) {
		this.clube = clube;
	}
	public boolean isSaude() {
		return saude;
	}
	public void setSaude(boolean saude) {
		this.saude = saude;
	}
	public boolean isTransporte() {
		return transporte;
	}
	public void setTransporte(boolean transporte) {
		this.transporte = transporte;
	}



}
