package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot cosmos = new Robot ();
	
	void go() {
		// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		cosmos.setSpeed(10);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int console = 50;
		// 7. Do the following (up to step 10) 60 times
for (int i = 0; i < 60; i++) {
cosmos.penDown();


			// 9. Change the color of the pen to a random color
cosmos.setRandomPenColor();
			// 8. Increase the length of the side by 10 pixels
int length = 60;
			// 5. call your drawTriangle() method using your length variable
cosmos.move(100);
cosmos.turn(120);

			// 10. Turn the tortoise 6 degrees to the right
cosmos.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable for the size of the triangle. */
	private void drawTriangle(int length) {for (int i = 0; i < 3; i++) {
		cosmos.move(100);
		cosmos.turn(120);

	}
		
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
