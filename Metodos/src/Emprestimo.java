
public class Emprestimo {

	public static int getDuasParcelas() {
		return 2;
	
	}
	public static int getTresParcelas() {
		return 3;
	
	}
	public static double getTaxaDuasParcelas() {
		return 0.5;
	
	}
	public static double getTaxaTresParcelas() {
		return 0.45;
	
	}
	public static void calcular(double valor, int parcelas ) {
		if(parcelas==2) {
			
			double valorFinal= valor+(valor*getTaxaDuasParcelas());
			
			System.out.println("Valor final de emprestimo das duas parcelas :"+ valorFinal);
		}else if (parcelas ==3) {
			double valorFinal= valor+(valor*getTaxaTresParcelas());
			
			System.out.println("Valor final de emprestimo das tres parcelas :"+ valorFinal);
		}else {
			System.out.println("Quantidade de parcelas nao aceita");
		}
	}
}
