import java.util.HashMap;

public class Principal {
	
	public static void main(String[] args) {
		//Criar um hashMap
		HashMap<String, String> paises = new HashMap<String, String>();
		
		//Adicionar elementos ao hashMap
		paises.put("Jap�o", "T�quio");
		paises.put("Brasil", "Bras�lia");
		paises.put("Argentina", "Buenos Aires");
		
		//Obter dados da chave
		System.out.println(paises.get("Brasil"));
		
		//Remover item
		paises.remove("Jap�o");
		
		//remover todos
		paises.clear();
		
		//Selecionar Todos os pa�ses
		System.out.println(paises);
	}

}
