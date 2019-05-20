package trabalho01;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



public class Principal {

	public static void main(String[] args) {
		
		// Variáveis
		int indice =0;
		
		
		
		// Array para contabilizar os produtos do carrinho
		int[] contador = new int[17];
		double[] preco = new double [18];
		String[] nomep = new String [18];
		

		// Criar um formulário
		JFrame formulario = new JFrame();
		formulario.setSize(1200, 900);
		formulario.setTitle("Carrinho de Compras");
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setResizable(false);

		// criando Panel
		JPanel categorias = new JPanel();
		categorias.setBackground(new Color(67, 183, 89));
		categorias.setVisible(true);
		categorias.setLayout(null);
		categorias.setSize(200, 900);

		// botoes de categorias dos produtos
		JButton limpeza = new JButton("Limpeza");
		limpeza.setBounds(5, 30, 170, 30);
		limpeza.setBorderPainted(false);
		limpeza.setContentAreaFilled(false);
		limpeza.setFocusPainted(false);
		limpeza.setOpaque(false);

		JButton bebidas = new JButton("bebidas");
		bebidas.setBounds(10, 70, 160, 20);
		bebidas.setBorderPainted(false);
		bebidas.setContentAreaFilled(false);
		bebidas.setFocusPainted(false);

		JButton horti = new JButton("Hortifruiti");
		horti.setBounds(10, 110, 160, 20);
		horti.setBorderPainted(false);
		horti.setContentAreaFilled(false);
		horti.setFocusPainted(false);

		JButton frios = new JButton("Frios");
		frios.setBounds(10, 145, 160, 20);
		frios.setBorderPainted(false);
		frios.setContentAreaFilled(false);
		frios.setFocusPainted(false);
		
		JButton rejeita = new JButton("Rejeitar Compra");
		rejeita.setBounds(300, 30, 170, 30);
		
		JButton fecha = new JButton("Fechar Compra");
		fecha.setBounds(500, 30, 170, 30);
	
		
		// Label que mostra os produtos do carrinho
		//JLabel lista = new JLabel();
		//lista.setBounds(10, 10, 160, 20);
		//lista.setBackground(new Color(107, 191, 168));
		//lista.setVisible(true);
		
		
		
		// Label que conta os produtos do carrinho
		JLabel carrinho1 = new JLabel();
		carrinho1.setBounds(15, 305, 55, 55);
		carrinho1.setBackground(new Color(255, 153, 153));
		carrinho1.setVisible(true);
		
		//Criando uma fonte diferente
		Font grande = new Font("Serif", Font.BOLD, 60);
		Font menor = new Font("Serif", Font.BOLD, 30);
		
		//label inicial
		JLabel inicial1 = new JLabel();
		inicial1.setBounds(220, 0, 500, 500);
		inicial1.setBackground(new Color(255, 153, 153));
		inicial1.setVisible(true);
		inicial1.setFont(grande);
		inicial1.setText("Ben Vindo");
		inicial1.setHorizontalAlignment(SwingConstants.CENTER);
		inicial1.setVisible(true);
		
		JLabel inicial2 = new JLabel();
		inicial2.setBounds(50, 100, 900, 500);
		inicial2.setBackground(new Color(255, 153, 153));
		inicial2.setVisible(true);
		inicial2.setFont(menor);
		inicial2.setText("Escolha uma categoria e clique na imagem para adicionar ao carrinho");
		inicial2.setHorizontalAlignment(SwingConstants.CENTER);
		inicial2.setVisible(true);
		
		
		// panel de inicialização
		JPanel inicial = new JPanel();
		inicial.setBackground(new Color(255, 153, 153));
		inicial.setVisible(true);
		inicial.setLayout(null);
		inicial.setSize(250, 800);
		inicial.setBounds(200, 0, 980, 900);
		inicial.add(inicial1);
		inicial.add(inicial2);

		// Area de texto para mostrar os produtos
		JTextArea lista = new JTextArea();
		lista.setBounds(100, 100, 800, 600);
		
		
		//Barra de rolagem
		JScrollPane barra = new JScrollPane(lista) ;
		barra.setBounds(100, 100, 800, 600);
	
		
		// panel mostra produtos escolhidos
		JPanel mostrap = new JPanel();
		mostrap.setBackground(new Color(250, 153, 153));
		mostrap.setVisible(false);
		mostrap.setLayout(null);
		mostrap.setSize(250, 800);
		mostrap.setBounds(200, 0, 980, 900);
		mostrap.add(barra);
		mostrap.add(rejeita);
		mostrap.add(fecha);
		//mostrap.add(lista);

		// panel de produtos LIMPEZA
		JPanel produtosLimp = new JPanel();
		produtosLimp.setBackground(new Color(231, 230, 231));
		produtosLimp.setVisible(false);
		produtosLimp.setLayout(null);
		produtosLimp.setSize(250, 800);
		produtosLimp.setBounds(200, 0, 980, 900);
		
		
			
		// produtos de limpeza
		JLabel proLimp1 = new JLabel();

		proLimp1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [1] = contador[1] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [0] = "OMO líquido 5L";
				preco    [0] = 10.00;
				System.out.println(contador [0]);
				System.out.println(nomep[0]);
				System.out.println(preco[0]);
			
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		URL imagemLimp1;
		try {
			imagemLimp1 = new URL("https://www.paodeacucar.com/img/uploads/1/544/589544x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagemLimp1);
			proLimp1.setIcon(icone);
			proLimp1.setBounds(10, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosLimp.add(proLimp1);

		JLabel proLimp2 = new JLabel();
		
		proLimp2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [2] = contador[2] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [1] = ("Amaciante Confort");
				preco    [1] = 10.00;
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemLimp2;
		try {
			imagemLimp2 = new URL("https://www.paodeacucar.com/img/uploads/1/370/560370x200x200.png?type=product");
			ImageIcon icone = new ImageIcon(imagemLimp2);
			proLimp2.setIcon(icone);
			proLimp2.setBounds(300, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosLimp.add(proLimp2);

		JLabel proLimp3 = new JLabel();
		
		proLimp3.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [3] = contador[3] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [2] = ("Qualíta tira manchas");
				preco    [2] = 10.00;
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemLimp3;
		try {
			imagemLimp3 = new URL("https://www.paodeacucar.com/img/uploads/1/851/326851x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagemLimp3);
			proLimp3.setIcon(icone);
			proLimp3.setBounds(600, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosLimp.add(proLimp3);

		JLabel proLimp4 = new JLabel();
		
		proLimp4.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [4] = contador[4] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [3] = ("Esfregão Multiuso");
				preco    [3] = 20.00;
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemLimp4;
		try {
			imagemLimp4 = new URL("https://www.paodeacucar.com/img/uploads/1/715/329715x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagemLimp4);
			proLimp4.setIcon(icone);
			proLimp4.setBounds(10, 300, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosLimp.add(proLimp4);
		
		

		// BEBIDAS BEBIDAS BEBIDAS

		// panel de produtos BEBIDAS
		JPanel produtosbebida = new JPanel();
		produtosbebida.setBackground(new Color(231, 230, 231));
		produtosbebida.setVisible(false);
		produtosbebida.setLayout(null);
		produtosbebida.setSize(250, 800);
		produtosbebida.setBounds(200, 0, 980, 900);

		// produtos BEBIDAS
		JLabel probebe1 = new JLabel();

		probebe1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [5] = contador[5] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [4] = ("Jim de mel");
				preco    [4] = 15.00;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		URL imagembebe1;
		try {
			imagembebe1 = new URL("https://www.paodeacucar.com/img/uploads/1/274/570274x200x200.png?type=product");
			ImageIcon icone = new ImageIcon(imagembebe1);
			probebe1.setIcon(icone);
			probebe1.setBounds(10, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}

		produtosbebida.add(probebe1);

		JLabel probebe2 = new JLabel();

		probebe2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [6] = contador[6] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [5] = ("Ades Morango");
				preco    [5] = 8.50;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		URL imagembebe2;
		try {
			imagembebe2 = new URL("https://www.paodeacucar.com/img/uploads/1/501/520501x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagembebe2);
			probebe2.setIcon(icone);
			probebe2.setBounds(300, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosbebida.add(probebe2);

		JLabel probebe3 = new JLabel();

		probebe3.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [7] = contador[7] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [6] = ("Bebida Lanjal Laranja");
				preco    [6] = 6.80;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		URL imagembebe3;
		try {
			imagembebe3 = new URL("https://www.paodeacucar.com/img/uploads/1/32/448032x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagembebe3);
			probebe3.setIcon(icone);
			probebe3.setBounds(600, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosbebida.add(probebe3);

		JLabel probebe4 = new JLabel();

		probebe4.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [8] = contador[8] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [7] = ("Vinho Fenix 900ml");
				preco    [7] = 45.90;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		URL imagembebe4;
		try {
			imagembebe4 = new URL("https://www.paodeacucar.com/img/uploads/1/629/576629x200x200.png?type=product");
			ImageIcon icone = new ImageIcon(imagembebe4);
			probebe4.setIcon(icone);
			probebe4.setBounds(10, 300, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosbebida.add(probebe4);

		// HORTI HORTI HORTI

		// panel de produtos HORTI- FRUITI
		JPanel produtoshorti = new JPanel();
		produtoshorti.setBackground(new Color(231, 230, 231));
		produtoshorti.setVisible(false);
		produtoshorti.setLayout(null);
		produtoshorti.setSize(250, 800);
		produtoshorti.setBounds(200, 0, 980, 900);

		// produtos Horti Fruti
		JLabel prohorti1 = new JLabel();
		
		prohorti1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [9] = contador[9] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [8] = ("Abacate Coração feliz");
				preco    [8] = 2.30;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		URL imagemhorti1;
		try {
			imagemhorti1 = new URL(
					"http://www.hortifruti.com.br/wp-content/themes/hortifruti-novo//inc/timthumb.php?w=229&h=182&zc=2&a=c&q=75&src=http://www.hortifruti.com.br/wp-content/uploads/2014/10/PRODUTO_abacate.png");
			ImageIcon icone = new ImageIcon(imagemhorti1);
			prohorti1.setIcon(icone);
			prohorti1.setBounds(10, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtoshorti.add(prohorti1);

		JLabel prohorti2 = new JLabel();
		
		prohorti2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [10] = contador[10] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [9] = ("Graviola");
				preco    [9] = 4.60;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemhorti2;
		try {
			imagemhorti2 = new URL(
					"http://www.hortifruti.com.br/wp-content/themes/hortifruti-novo//inc/timthumb.php?w=229&h=182&zc=2&a=c&q=75&src=http://www.hortifruti.com.br/wp-content/uploads/2014/10/PRODUTO_atemoia.png");
			ImageIcon icone = new ImageIcon(imagemhorti2);
			prohorti2.setIcon(icone);
			prohorti2.setBounds(300, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtoshorti.add(prohorti2);

		JLabel prohorti3 = new JLabel();
		
		prohorti3.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [11] = contador[11] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [10] = ("Alecrim");
				preco    [10] = 1.10;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemhorti3;
		try {
			imagemhorti3 = new URL(
					"http://www.hortifruti.com.br/wp-content/themes/hortifruti-novo//inc/timthumb.php?w=229&h=182&zc=2&a=c&q=75&src=http://www.hortifruti.com.br/wp-content/uploads/2014/05/PRODUTO_alecrim.png");
			ImageIcon icone = new ImageIcon(imagemhorti3);
			prohorti3.setIcon(icone);
			prohorti3.setBounds(600, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtoshorti.add(prohorti3);

		JLabel prohorti4 = new JLabel();
		
		prohorti4.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [12] = contador[12] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [11] = ("Agrião");
				preco    [11] = 9.85;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemhorti4;
		try {
			imagemhorti4 = new URL(
					"http://www.hortifruti.com.br/wp-content/themes/hortifruti-novo//inc/timthumb.php?w=229&h=182&zc=2&a=c&q=75&src=http://www.hortifruti.com.br/wp-content/uploads/2014/10/PRODUTO_agriao.png");
			ImageIcon icone = new ImageIcon(imagemhorti4);
			prohorti4.setIcon(icone);
			prohorti4.setBounds(10, 300, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtoshorti.add(prohorti4);

		// FRIOS FRIOS FRIOS

		// panel de produtos FRIOS

		JPanel produtosfrios = new JPanel();
		produtosfrios.setBackground(new Color(231, 230, 231));
		produtosfrios.setVisible(false);
		produtosfrios.setLayout(null);
		produtosfrios.setSize(250, 800);
		produtosfrios.setBounds(200, 0, 980, 900);

		// produtos FRIOS
		JLabel profrios1 = new JLabel();
		
		profrios1.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [13] = contador[13] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [12] = ("Carne Suína");
				preco    [12] = 18.00;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemfrios1;
		try {
			imagemfrios1 = new URL("https://www.paodeacucar.com/img/uploads/1/777/518777x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagemfrios1);
			profrios1.setIcon(icone);
			profrios1.setBounds(300, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosfrios.add(profrios1);

		JLabel profrios2 = new JLabel();
		
		profrios2.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [14] = contador[14] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [13] = ("Picanha");
				preco    [13] = 28.00;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemfrios2;
		try {
			imagemfrios2 = new URL("https://www.paodeacucar.com/img/uploads/1/833/585833x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagemfrios2);
			profrios2.setIcon(icone);
			profrios2.setBounds(600, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosfrios.add(profrios2);

		JLabel profrios3 = new JLabel();
		
		profrios3.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [15] = contador[15] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [14] = ("Coração de Galinha");
				preco    [14] = 12.00;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemfrios3;
		try {
			imagemfrios3 = new URL("https://www.paodeacucar.com/img/uploads/1/364/579364x200x200.png?type=product");
			ImageIcon icone = new ImageIcon(imagemfrios3);
			profrios3.setIcon(icone);
			profrios3.setBounds(10, 300, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosfrios.add(profrios3);

		JLabel profrios4 = new JLabel();
		
		profrios4.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				contador [0] = contador[0] + 1;
				contador [16] = contador[16] + 1;
				carrinho1.setText(String.valueOf(contador[0]));
				nomep [15] = ("Boi Ralado");
				preco    [15] = 15.40;
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});
		
		URL imagemfrios4;
		try {
			imagemfrios4 = new URL("https://www.paodeacucar.com/img/uploads/1/698/560698x200x200.jpg?type=product");
			ImageIcon icone = new ImageIcon(imagemfrios4);
			profrios4.setIcon(icone);
			profrios4.setBounds(10, 10, 200, 200);
		} catch (Exception e) {
			// TODO: handle exception
		}
		produtosfrios.add(profrios4);
		
		

		// Ações dos botões
		// BOTOES BOTOES BOTOES
		limpeza.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inicial.setVisible(false);
				produtosLimp.setVisible(true);
				produtosbebida.setVisible(false);
				produtoshorti.setVisible(false);
				produtosfrios.setVisible(false);

			}
		});
		bebidas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inicial.setVisible(false);
				produtosbebida.setVisible(true);
				produtosLimp.setVisible(false);
				produtoshorti.setVisible(false);
				produtosfrios.setVisible(false);

			}
		});
		horti.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inicial.setVisible(false);
				produtosLimp.setVisible(false);
				produtoshorti.setVisible(true);
				produtosbebida.setVisible(false);
				produtosfrios.setVisible(false);

			}
		});
		frios.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				inicial.setVisible(false);
				produtosLimp.setVisible(false);
				produtoshorti.setVisible(false);
				produtosbebida.setVisible(false);
				produtosfrios.setVisible(true);

			}
		});
		rejeita.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			lista.setText("");
			for (int i = 0; i < 16; i++) {
				contador[i] = 0;
				nomep[i] = "";
				preco[i] = 0;
			}

			}
		});
		
		fecha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				double soma = 0;
				double total = 0;
				lista.setText("");
				for (int i = 0; i < 16; i++) {
					soma +=preco[i] * contador[i+1];
					
				}
				lista.setText(String.valueOf("\n"+" Total a Pagar: R$ "+soma));

			}
		});
		
		JLabel carrinho = new JLabel();

		carrinho.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				String vprodutos = " ";
				mostrap.setVisible(true);
				inicial.setVisible(false);
				produtosLimp.setVisible(false);
				produtosbebida.setVisible(false);
				produtoshorti.setVisible(false);
				produtosfrios.setVisible(false);
				
				//produtos de Limpeza
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[1]))+" Produto: "+nomep[0] +" - R$ "+(String.valueOf(preco[0])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[2]))+" Produto: "+nomep[1] +" - R$ "+(String.valueOf(preco[1])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[3]))+" Produto: "+nomep[2] +" - R$ "+(String.valueOf(preco[2])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[4]))+" Produto: "+nomep[3] +" - R$ "+(String.valueOf(preco[3])));
				//produtos Bebidaas
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[5]))+" Produto: "+nomep[4] +" - R$ "+(String.valueOf(preco[4])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[6]))+" Produto: "+nomep[5] +" - R$ "+(String.valueOf(preco[5])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[7]))+" Produto: "+nomep[6] +" - R$ "+(String.valueOf(preco[6])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[8]))+" Produto: "+nomep[7] +" - R$ "+(String.valueOf(preco[7])));
				//Produtos horti fruti
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[9]))+" Produto: "+nomep[8] +" - R$ "+(String.valueOf(preco[8])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[10]))+" Produto: "+nomep[9] +" - R$ "+(String.valueOf(preco[9])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[11]))+" Produto: "+nomep[10] +" - R$ "+(String.valueOf(preco[10])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[12]))+" Produto: "+nomep[11] +" - R$ "+(String.valueOf(preco[11])));
				//Produtos Frios
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[13]))+" Produto: "+nomep[12] +" - R$ "+(String.valueOf(preco[12])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[14]))+" Produto: "+nomep[13] +" - R$ "+(String.valueOf(preco[13])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[15]))+" Produto: "+nomep[14] +" - R$ "+(String.valueOf(preco[14])));
				vprodutos+=("\n"+" Quantidade: "+(String.valueOf(contador[16]))+" Produto: "+nomep[15] +" - R$ "+(String.valueOf(preco[15])));
				lista.setText(vprodutos);
				
				
				
				//lista.setText(nomep[0]);


			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		URL imagemcar;
		try {
			imagemcar = new URL(
					"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRx2jbLGYPsYFsX0JzcrOvdJK2tcgSZCwQ0COF05aH09ngKHDiMMQ");
			ImageIcon icone = new ImageIcon(imagemcar);
			carrinho.setIcon(icone);
			carrinho.setBounds(10, 175, 175, 175);
		} catch (Exception e) {
			// TODO: handle exception
		}

		// Importar categorias
		categorias.add(limpeza);
		categorias.add(bebidas);
		categorias.add(horti);
		categorias.add(frios);
		categorias.add(carrinho1);
		categorias.add(carrinho);
		
		// Adicionar ao form
		formulario.add(categorias);
		formulario.add(produtosLimp);
		formulario.add(inicial);
		formulario.add(produtosbebida);
		formulario.add(produtoshorti);
		formulario.add(produtosfrios);
		formulario.add(mostrap);
		

		// exibir o formulario e seus componetes internos
		formulario.setVisible(true);
		
		

	}

}
