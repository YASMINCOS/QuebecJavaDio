
public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario= new Funcionario();
		
		//upcast
		Funcionario gerente= new Gerente();
		Funcionario vendedor= new Vendedor();
		Funcionario faxineiro= new Faxineiro();
		
		//Donwcast
		//Vendedor vendedor=(Vendedor) new Funcionario();


	}
}
