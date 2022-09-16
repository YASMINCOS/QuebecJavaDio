
public class Main {

	public static void main(String[] args) {
		ClassMae[] classes= new ClassMae[] {new ClasseFilha1(), new ClasseFilha2(), new ClassMae()};
		
		for(ClassMae classe: classes) {
			classe.metodo1();
		}
		System.out.println("");
		
		for(ClassMae classe: classes) {
			classe.metodo1();
		}
		System.out.println("");
		
		ClasseFilha2 classeFilha2= new ClasseFilha2();
		classeFilha2.metodo2();
	}
}
