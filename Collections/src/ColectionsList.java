import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ColectionsList {
  //colection- objeto que agrupa multiplos elementos(variaveis primitivas ou objetos) dentro de uma unica unidade
	//serve para armazenar e processar conjuntos de dados de forma mais eficientes
	//interfaces-contrato que quando assumido por uma classe deve ser implementado
	//implementacao ou classes-materializacoes a codificacao das interfaces
	
	//interface list
	//java.util.list

	public static void main(String[] args) {
		//dada uma lista com ? notas de um alunos[7,8.5,9.3,5,7,8,0,3.6]
		
		//List notas = new ArrayList()://ante do java 3
		//List<Double> notas = = new ArrayList<>();
		//List <Double> notas = new ArrayList();
		//List<Double> notas= Arrays.asList(7d,8.5,9.3,5d, 7d,0d,3.6);
	//	notas.add(10d);
		//System.out.println(notas);
		
		//List<Double>notas= List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
	//	notas.add(1d);
		//notas.add(5d);
		//System.out.println(notas);
		
		System.out.println("Crie uma lista e adicione sete notas:");
		List<Double> notas= new ArrayList<Double>();
		notas.add(7d);
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7d);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas.toString());
		System.out.println("Exiba a posicao da nota 5.0  posicao=" + notas.indexOf(5d));
		System.out.println("Adicione na lista a nota 8.0 na  posicao=4" );
		notas.add(4,8d);
		System.out.println(notas);
		
		System.out.println("Substitua a nota 5.0 pela nota 6.0");
		notas.set( notas.indexOf(5d),6.0 );
		System.out.println(notas);
		//substituida por 6
		System.out.println("Confira se a nota 5.0 esta na lista "+ notas.contains(5d));
		
		System.out.println("Exiba todas as notas na ordem em que foram informadas");
		for(Double nota: notas) System.out.println(nota);
		
		

		
	}	
}
