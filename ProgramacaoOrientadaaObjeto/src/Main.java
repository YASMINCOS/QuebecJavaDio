
public class Main {

	public static void main(String[] args) {
		ObjetoEMensagemCarro carro1= new ObjetoEMensagemCarro();
		
		carro1.setCor("Azul");
		carro1.setModelo("HB20");
		carro1.setCapacidadeTanque(56);
		
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCor());
		System.out.println(carro1.getCapacidadeTangue());
		System.out.println(carro1.totalValorTanque(6.67));
		
		ObjetoEMensagemCarro carro2= new ObjetoEMensagemCarro("Cinza","Mercedes",58);
		
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCor());
		System.out.println(carro2.capacidadeTanque);
		System.out.println(carro2.totalValorTanque(5.68));
		
	}
}

