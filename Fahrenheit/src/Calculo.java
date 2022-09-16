import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculo {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		String numF= JOptionPane.showInputDialog(null,"Digite a temperatura em Fahrenheint");
		double f= Double.parseDouble(numF);
		
		double c= ((f-32)*5)/9;
		JOptionPane.showMessageDialog(null, c);
		
	
	}
}
