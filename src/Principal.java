import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		try {

			Robot robot = new Robot();
			robot.delay(5000); // tempo para iniciar os cliques
			int cont = 0;
			int repeticoes = 3;
			int intervalo = 5; // segundos
			int miliss = intervalo * 1000;

			// loop principal
			while (cont < repeticoes) {
				robot.keyPress(KeyEvent.VK_SPACE);
				cont++;
				if (cont >= repeticoes) {
					miliss = 0;
				}
				robot.delay(miliss);
			}
			JOptionPane.showMessageDialog(null, "Finalizado!");
			System.out.println("Execução finalizada!");

		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}