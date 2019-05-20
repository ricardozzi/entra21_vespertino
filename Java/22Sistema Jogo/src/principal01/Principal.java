package principal01;

import java.awt.EventQueue;

import acao01.Acao;
import formulario01.Form01;


public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Form01 frame = new Form01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
