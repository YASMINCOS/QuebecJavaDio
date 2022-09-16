
public class NumPares {

	public static void main(String[] args) {
		int[] valores= {2,3,5,7,11,13,18,34};
		
		for(int valor: valores) {
			if(valor% 2==0) {
				System.out.println(valor);
			}
		}
	}
}