package exemplo08;

public class Principal {

	public static void main(String[] args) {
		
		/* Regras de c�lculo
		   1 Divis�o
		   2 Multiplica��o
		   3 subtra��o
		   4 soma
		 */
		
		//Condicional Composta
		double nota1 = 8.5;
		double nota2 = 7.5;
		double media = (nota1 + nota2) / 2;
		
		if(media ==10) {
			System.out.println("Parab�ns! Nota m�xima.");}
		else
			if(media >=9) {
				System.out.println("�timo, sua media � " + media);}
			else
				if(media >=8) {
					System.out.println("bom, sua m�dia � " + media);}
				else
					if(media >=7) {
						System.out.println("Na m�dia com " + media);}
					else
						if(media >=5) {
							System.out.println("Em exame com " + media);}
						else
							System.out.println("Reprovado com m�dia " + media);}
			
		
		

	}


