import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculo {


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String numC= JOptionPane.showInputDialog(null,"Digite a temperatura em Celsius");
		double c= Double.parseDouble(numC);
		
		double f= (9*c+160)/5;
		JOptionPane.showMessageDialog(null, f);
		
	}
}
