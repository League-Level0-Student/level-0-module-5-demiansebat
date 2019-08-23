import java.util.Random;

import javax.swing.JOptionPane;

public class skills {
public static void main(String[] args) {

	skills practice = new skills();
          	practice.skill1();
          	practice.skill2();
          	practice.skill3();
          	practice.skill4();
          	practice.skill5();
}

void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
String money=JOptionPane.showInputDialog("How  many dimes do you have?");
int dimes=Integer.parseInt(money);
System.out.println(dimes*10+"cents");

// Tell them how many cents they have (hint multiply by 10)




// Ask the user how tall they are (inches)
String height=JOptionPane.showInputDialog("How tall are you  in inches?");
int you=Integer.parseInt(height);
if(you<36) {
	JOptionPane.showMessageDialog(null, "You should eat you Wheaties");
}

// If they are shorter than 36 inches, tell them to eat their Wheaties




}

void skill2() { // Write a loop to print every third number between 1 and 30 to the console 

	for (int i = 1; i <31; i++) {
if (i%3==0) {
	System.out.println(i);
}
}






}

void skill3() { // Get a random number that is less than 20 and print it to the console 
	Random number1= new Random();
	int thing=number1.nextInt(20);


// Get another random number that is less than 10 and print it to the console 
Random number= new Random();
int something=number.nextInt(10);


// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
JOptionPane.showMessageDialog(null, thing-something);


}

void skill4() { // In a pop-up, ask the user for the 
	String place=JOptionPane.showInputDialog("What city do you live in?");
if (place.equals("San Diego")) {
	JOptionPane.showMessageDialog(null, "You live in america's finest city!");
}
else{
	JOptionPane.showMessageDialog(null, "You should move to San Diego!");
}
// If they answered "San Diego", tell them they live in America's Finest City 



// Otherwise, tell them to move to San Diego 



// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
int cars=2;
JOptionPane.showMessageDialog(null, "In total they have eight wheels.");


// If there is 1 car, use a pop-up to display the make/model of the car 



// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 



}

void skill5() { // In a pop-up, ask the user for the name of their school 
String learn=JOptionPane.showInputDialog("What is the name of your school?");


// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
JOptionPane.showMessageDialog(null, learn+ " is a fantastic school");


}
}