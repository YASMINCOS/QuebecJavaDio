
public class ObjetoEMensagemCarro {

	//objeto
	//Carro carro= new Carro();
	//mensagem-ativacao do metodo
	//Carro carro= new Carro();
	//carro.<metodo>;
	String cor;
	String modelo;
	int capacidadeTanque;
	
	
	//construtor
	ObjetoEMensagemCarro(){
		
	}
	
	ObjetoEMensagemCarro(String cor, String modelo, int capacidadeTanque){
		this.cor=cor;
		this.modelo=modelo;
		this.capacidadeTanque=capacidadeTanque;
	}
	
	//retornar a cor do carro
	public String getCor() {
		return cor;
	}
	//pode colocar um valor no atributo
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	//pode colocar um valor no atributo
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque=capacidadeTanque;

	}
	int getCapacidadeTangue() {
		return capacidadeTanque;
	}
	
	
	//metodos para calcular tanque
	
	double totalValorTanque(double valorCombustivel) {
		return capacidadeTanque* valorCombustivel;
	}
}
