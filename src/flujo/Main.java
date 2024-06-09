package flujo;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "La app no tiene presedencia de operaciones", "Información", JOptionPane.INFORMATION_MESSAGE);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
