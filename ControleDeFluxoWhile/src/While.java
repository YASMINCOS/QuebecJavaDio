import java.util.concurrent.ThreadLocalRandom;
public class While {
    public static void main(String[] args) {
	//while(expressao booleana de validacao)
    	//{
    	//comando
    	//}
    	double mesada=50.0;
    	while(mesada>0) {
    		Double valorDoce= valorAleatorio();
    		
    		//if(valorDoce>mesada) {
    		//	valorDoce=mesada;
    			
    			System.out.println("Doce do valor:" +valorDoce+ " Adicionado");
    			mesada=mesada+valorDoce;
    		//}
    		System.out.println("Mesada" + mesada);
    		System.out.println("Joa gastou toda sua mesada em doce");
    	}
}
    private static double valorAleatorio() {
    	return ThreadLocalRandom.current().nextDouble(2,8);
    }
}
