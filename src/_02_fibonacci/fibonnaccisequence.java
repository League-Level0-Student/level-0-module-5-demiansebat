package _02_fibonacci;

import javax.swing.JOptionPane;

public class fibonnaccisequence {
public static void main(String[] args) {
int X =0;
int Y =1;
int Z =X+Y;
for (int i = 0; i < 6; i++) {
	System.out.println(X);
	System.out.println(Y);
	X=X+Y;
	Z=X;
	Y=X+Y;
}
}
}
