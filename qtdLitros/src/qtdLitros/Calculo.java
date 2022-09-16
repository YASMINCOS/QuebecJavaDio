package qtdLitros;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculo {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
		
		String numT= JOptionPane.showInputDialog(null,"Digite o tempo gasto na viagem");
		double t= Double.parseDouble(numT);
		String numV= JOptionPane.showInputDialog(null,"Digite a velocidade médida da viagem");
		double v= Double.parseDouble(numV);
		
		double distancia= t*v;
		double litros= distancia/12;
		System.out.println("Quantidade de litros gastos:" + litros);
		System.out.println("distancia percorrida" + distancia);
		System.out.println("velocidade média da viagem:"+ v);
	}
}
