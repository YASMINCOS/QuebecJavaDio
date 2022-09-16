import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
//map
//elementos unicos (key) para cada valor(value)
//hastable- cada elemento de sua lista possui uma chave e valor associado, assim podemos realizar uma busca rápida pela chave que desejamos, sem precisar percorrer toda lista ou saber o index/posição que desejamos consultar.
public class CollectionMap {

	public static void main(String[] args) {
		
		
		System.out.println("Crie um dicionario que relacione os modelos e seu respectivos consumos");
		Map<String,Double> carrosPopulares= new HashMap<>() {{
			put("gol",14.4);
			put("uno",15.5);
			put("mobi",16.1);
			put("hb20",14.5);
			put("kwid",15.6);
			
			
		}};
		System.out.println(carrosPopulares.toString());
		
		System.out.println("Substitua o consumo do gol por 15,2 km/l:");
		carrosPopulares.put("gol", 15.2);
		System.out.println(carrosPopulares);
		
		System.out.println("Confira se o modelo tucson esta na lista"+ carrosPopulares.containsKey("tucson"));
		
		System.out.println("Exiba o consumo do uno" + carrosPopulares.get("uno"));
		
		System.out.println("Exiba os modelos ");
		Set<String> modelos=carrosPopulares.keySet();
		System.out.println(modelos);
		
		System.out.println("Exiba os consumos dos carros:");
		Collection<Double> consumos=carrosPopulares.values();
		System.out.println(consumos);
		
		System.out.println("Exiba o modelo mais economico e seu consumo");
		Double consumoMaisEficiente= Collections.max(carrosPopulares.values());
		Set<Map.Entry<String, Double>> entries= carrosPopulares.entrySet();
		//variaveil de controle
		
		String modeloMaisEficiente="";
		
		for(Map.Entry<String, Double> entry:entries) {
			if (entry.getValue().equals(consumoMaisEficiente))modeloMaisEficiente=entry.getKey();
		}
		System.out.println("Modelo mais eficiente"+modeloMaisEficiente+"-"+consumoMaisEficiente);
		
		
		String modeloMenosEficiente = "";
		System.out.println("Exiba o modelo mais economico e seu consumo");
		Double consumoMenosEfciente=Collections.min(carrosPopulares.values());
		
		
		for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
			if(entry.getValue().equals(consumoMenosEfciente)) modeloMenosEficiente=entry.getKey();
			System.out.println("Modelo menos eficiente:"+modeloMenosEficiente+"-"+consumoMenosEfciente);
		}
	}

	
	}


