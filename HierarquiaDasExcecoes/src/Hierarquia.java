import java.text.NumberFormat;
import java.text.ParseException;

public class Hierarquia {

	//checked and unchecked exceptions- excecoes checadas ou nao checadas
	
	//exception 
	//runtimeexception-classe que determina a excecao que pode acontecer nao preocupar de tratar
	//checada ou nao checada- o ricso de ser disparada e necessidade de tratar
	
	public static void main(String[] args) {
		
		Number valor;
		
		try {
			valor= NumberFormat.getInstance().parse("a1.75");
			System.out.println(valor);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
