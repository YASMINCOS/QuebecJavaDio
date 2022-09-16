import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculo {


	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		
		String numV= JOptionPane.showInputDialog(null,"Digite o valor da prestacao");
		double v= Double.parseDouble(numV);
		String numt= JOptionPane.showInputDialog(null,"Digite a taxa de multa de atrasso");
		double t= Double.parseDouble(numt);
		String numtempo= JOptionPane.showInputDialog(null,"Digite o tempo de atrasso");
		double tempo= Double.parseDouble(numtempo);
		
		double prestacao= v+(v*(t/100)*tempo);
		System.out.println("O valor da prestacao é:"+ prestacao);
	}
}
