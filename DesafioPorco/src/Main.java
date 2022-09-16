
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	List<Porco> porcos = new ArrayList<>();

	public static void main(String[] args) {
		
		Porco porquinho = new Porco("porquinho", SexoPorcoEnum.MACHO,8, 40);
		Porco porquinhoA = new Porco("porquinhoA", SexoPorcoEnum.FEMEA,6, 50);
		
		
		
		Porco[] porcos = {porquinho, porquinhoA};
		
		Chiqueiro chiqueiro = new Chiqueiro();
		
		chiqueiro.adicionarPorco(porcos);
		
		Porco porquinhoB = new Porco("porquinhoB", SexoPorcoEnum.MACHO, 7, 60);
		chiqueiro.adicionarPorco(porquinhoB);
		
		System.out.println("Quantidade de porcos macho: " + chiqueiro.quantidadePorcosMacho);
		System.out.println("Media Peso Geral: " + chiqueiro.mediaPesoPorcosGeral);
		System.out.println("Porco fêmea mais pesada: " + chiqueiro.porcoMaisPesadoFemea);
		
	}
}
	