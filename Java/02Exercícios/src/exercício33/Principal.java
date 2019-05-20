package exercício33;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		int    dia   = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia de seu nascimento: "));
		int    mes   = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês do seu nascimeto: "));
				
				if ((mes == 1)&&((dia ==21)||(dia<=31))) {
					JOptionPane.showMessageDialog(null,"Aquário");
				}else 
					if ((mes == 2)&&(dia<=19)) {
						JOptionPane.showMessageDialog(null,"Aquário");
					}else
						if ((mes == 2)&&((dia ==20)||(dia<=31))) {
							JOptionPane.showMessageDialog(null,"Peixes");
						}else 
							if ((mes == 3)&&(dia<=20)) {
								JOptionPane.showMessageDialog(null,"peixes");
							}else
								if ((mes == 3)&&((dia ==21)||(dia<=31))) {
									JOptionPane.showMessageDialog(null,"Áries");
								}else 
									if ((mes == 4)&&(dia<=20)) {
										JOptionPane.showMessageDialog(null,"Áries");
									}else
										if ((mes == 4)&&((dia ==21)||(dia<=31))) {
											JOptionPane.showMessageDialog(null,"Touro");
										}else 
											if ((mes == 5)&&(dia<=20)) {
												JOptionPane.showMessageDialog(null,"Touro");
											}else
												if ((mes == 5)&&((dia ==21)||(dia<=31))) {
													JOptionPane.showMessageDialog(null,"Gêmeos");
												}else 
													if ((mes == 6)&&(dia<=20)) {
														JOptionPane.showMessageDialog(null,"Gêmeos");
													}else
														if ((mes == 6)&&((dia ==21)||(dia<=31))) {
															JOptionPane.showMessageDialog(null,"Câncer");
														}else 
															if ((mes == 7)&&(dia<=21)) {
																JOptionPane.showMessageDialog(null,"Câncer");
															}else
																if ((mes == 7)&&((dia ==22)||(dia<=31))) {
																	JOptionPane.showMessageDialog(null,"Leão");
																}else 
																	if ((mes == 8)&&(dia<=22)) {
																		JOptionPane.showMessageDialog(null,"Leão");
																	}else
																		if ((mes == 8)&&((dia ==23)||(dia<=31))) {
																			JOptionPane.showMessageDialog(null,"Virgem");
																		}else 
																			if ((mes == 9)&&(dia<=22)) {
																				JOptionPane.showMessageDialog(null,"Virgem");
																			}else
																				if ((mes == 9)&&((dia ==23)||(dia<=31))) {
																					JOptionPane.showMessageDialog(null,"Libra");
																				}else 
																					if ((mes == 10)&&(dia<=22)) {
																						JOptionPane.showMessageDialog(null,"Libra");
																					}else
																						if ((mes == 10)&&((dia ==23)||(dia<=31))) {
																							JOptionPane.showMessageDialog(null,"Escorpião");
																						}else 
																							if ((mes == 11)&&(dia<=21)) {
																								JOptionPane.showMessageDialog(null,"Escorpião");
																							}else
																								if ((mes == 11)&&((dia ==22)||(dia<=31))) {
																									JOptionPane.showMessageDialog(null,"Sagitário");
																								}else 
																									if ((mes == 12)&&(dia<=22)) {
																										JOptionPane.showMessageDialog(null,"Sagitário");
																									}else
																										if ((mes == 12)&&((dia ==22)||(dia<=31))) {
																											JOptionPane.showMessageDialog(null,"Capricórnio");
																										}else 
																											if ((mes == 01)&&(dia<=20)) {
																												JOptionPane.showMessageDialog(null,"Capricórnio");
																											}
						

	}

}
