import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

public class Mouse {
	
	// funcao para mover o mouse pela tela aleatoriamente
	public static void MouseMaluco(Robot robot){
		int cont = 0;
		
		Random random = new Random();
        while (cont<=30) {
            robot.mouseMove(random.nextInt(500), random.nextInt(500));
            cont++;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                
            }
        }               
	}
	
	// funcao para o mouse mover e clicar
	public static void MouseMoveClick(Robot robot, int posX, int posY){
		robot.mouseMove(posX, posY); // posicao
        robot.mousePress(InputEvent.BUTTON1_MASK); // clica
        robot.mouseRelease(InputEvent.BUTTON1_MASK); // solta
	}
}
