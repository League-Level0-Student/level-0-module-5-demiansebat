import javax.swing.JOptionPane;

public class primeornot {
public static void main(String[] args) {
String X=	JOptionPane.showInputDialog("What number do you choose?");
int Y= Integer.parseInt(X);
	for (int i = 2; i <Y; i++) {
		if(Y%i==0) {
			JOptionPane.showMessageDialog(null, "Your number isn't prime.");
			System.exit(0);
		}
	}
	JOptionPane.showMessageDialog(null, "Your number is prime.");
	
}
}
