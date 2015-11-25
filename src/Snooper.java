import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Hello");
	String one = JOptionPane.showInputDialog("Where do you live?");
	String two = JOptionPane.showInputDialog("Do you have any siblings?");
	String three = JOptionPane.showInputDialog("How old are you?");
	JOptionPane.showMessageDialog(null, "So you live at " + one + ", you have " + two + " siblings" + ", and you are " + three + " years old.");
	
	
	
}
}
