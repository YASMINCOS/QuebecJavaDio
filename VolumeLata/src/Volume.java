import java.util.Scanner;

import javax.swing.JOptionPane;

public class Volume {

	public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		
		String numA= JOptionPane.showInputDialog(null,"Digite a altura da lata");
		double a= Double.parseDouble(numA);
		String numR= JOptionPane.showInputDialog(null,"Digite o raio da lata");
		double r= Double.parseDouble(numR);
		
		double v= 3.1415*r* Math.pow(a, a);
		JOptionPane.showMessageDialog(null, v);
		
	
	}
	}
}
