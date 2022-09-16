import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculo {

	public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
		
		String numD= JOptionPane.showInputDialog(null,"Digite o valor em dolar US:");
		double d= Double.parseDouble(numD);
		
		
		double real= d*5.10;
		System.out.println("O valor em real é: " + real);
	}
}
