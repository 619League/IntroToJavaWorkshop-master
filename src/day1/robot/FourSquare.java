package day1.robot;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot turtle = new Robot ();

	void go() {
		// 4. Make the robot move as fast as possible
		turtle.setSpeed(10);
		// 5. Set the pen width to 5
		turtle.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
	turtle.penDown();
	turtle.setRandomPenColor();
	
			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			turtle.turn(90);
}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() { for (int i = 0; i < 4; i++) {
		turtle.move(100);
		turtle.turn(90);
		
	}
		JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
