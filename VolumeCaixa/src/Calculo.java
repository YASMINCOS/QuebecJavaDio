import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculo {


	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		String numC= JOptionPane.showInputDialog(null,"Digite o comprimento da caixa");
		double c= Double.parseDouble(numC);
		String numl= JOptionPane.showInputDialog(null,"Digite a largura da caixa");
		double l= Double.parseDouble(numl);
		String numa= JOptionPane.showInputDialog(null,"Digite a altura da caixa");
		double a= Double.parseDouble(numa);
		
		double volume=c*l*a;
		System.out.println("O volume da caixa é:" + volume);
		
	}
}
