
public class Quadrilatero {

	//quadrado
	public static void area (double lado) {
		System.out.println("Area do quadrado="+ lado*lado);
	}
	//retangulo
	public static void area (double lado1, double lado2) {
		System.out.println("Area do retangulo="+ lado1*lado2);
	}
	//trapezio
	public static void area (double baseMaior, double baseMenor, double altura) {
		System.out.println("Area do trapazio="+(( baseMaior+baseMenor)*altura)/2);
	}
	//nao e aceito pois o tipo de dado e o mesmo do quadrado-double
	//aceito com double
	public static void area (float diagonal1, float diagonal2) {
		System.out.println("Area do losango="+(diagonal1+diagonal2)/2);
	}
}
