package principal;

import java.awt.EventQueue;

import formularios.Formulario01;

public class Principal {


		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						Formulario01 frame = new Formulario01();
						frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}



}
