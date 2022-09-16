import javax.swing.JOptionPane;

public class UncheckedException {

	public static void main(String[] args) {
		
		String a= JOptionPane.showInputDialog("Numerador:");
		String b= JOptionPane.showInputDialog("Denominador:");
		
	try {
		int resultado= dividir(Integer.parseInt(a),Integer.parseInt(b));
		System.out.println("Resultado "+ resultado);
	}catch(NumberFormatException e) {
		//e.printStackTrace();
		JOptionPane.showMessageDialog(null, "Entrada inavlida, informe um numero inteiro" +e.getMessage());
	}catch(ArithmeticException e) {
		JOptionPane.showMessageDialog(null, "Nao é possivel ralizar a divisao por 0" +e.getMessage());

	}
	finally {
		System.out.println("Chegou no finally!");
	}
	
	
		System.out.println("O codigo continua...");
	}
	public static int dividir(int a, int b) {
		return a/b;
	}
}
