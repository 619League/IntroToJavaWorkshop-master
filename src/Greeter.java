import javax.swing.JOptionPane;

public class Greeter {
 public static void main(String[] args) {
  
  		JOptionPane.showMessageDialog(null, "Hello" + ", You're amazing!");
  		String other = JOptionPane.showInputDialog("What is your favorite color?");
  		
  		String answer = JOptionPane.showInputDialog("What is your favorite animal?");
  		JOptionPane.showMessageDialog(null, "Your favorite color is " +other + "Your favorite animal is" + answer );

}
}
