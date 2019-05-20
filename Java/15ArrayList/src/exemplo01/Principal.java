package exemplo01;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		//ArrayList
		ArrayList<String> cursos = new ArrayList<String>();
		
		//Adicionar cursos
		cursos.add("Java");
		cursos.add("MySQL");
		cursos.add("HTML");
		cursos.add("CSS");
		cursos.add("JavaScrpt");
		
		//Alterar o curso
		cursos.set(4, "Algular");
		
		//Remover o curso
		cursos.remove(1);
		
		//Remover todos os cursos
		//cursos.clear();
		
		//Exibir a quantidade de cursos cadastrados
		System.out.println("Quantidade de cursos: "+cursos.size());
		
		//Listar cursos
		for (String elemento : cursos) {
			System.out.println(elemento);
		}

	}

}
