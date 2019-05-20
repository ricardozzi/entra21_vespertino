package beans01;

public class Jogo {
	//Atributos pegar e manipular os dados que o usuário passa
	private String nomeJogo, genero;
	private String  plataforma, classificcao;
	private Double valor;
	
	//Get & Set
	public String getNomeJogo() {
		return nomeJogo;
	}
	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getPlataforma() {
		return plataforma;
	}
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	public String getClassificcao() {
		return classificcao;
	}
	public void setClassificcao(String classificcao) {
		this.classificcao = classificcao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	

	

}
