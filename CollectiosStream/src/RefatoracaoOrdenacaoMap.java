import java.util.HashMap;
import java.util.Map;

public class RefatoracaoOrdenacaoMap {

	public static void main(String[] args) {
		System.out.println("--\t Ordem aleattora \t --");
		Map<Integer, Contato> agenda = new HashMap<>() {{
			put(1, new Contato ("Simba",5555));
			put(2, new Contato ("Cami",1111));
			put(3, new Contato ("Jon",2222));
		}};	
		System.out.println(agenda);
		
		for(Map.Entry<Integer, Contato> entry: agenda.entrySet()) {
			System.out.println(entry.getKey()+"-"+ entry.getValue());
		}
	}
}
