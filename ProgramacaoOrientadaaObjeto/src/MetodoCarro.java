
public class MetodoCarro {

	//carro-ligar
	//computador-desligar
	//comprador-realizar compra
	//visibilidade
	//retorno
	//nome
	//paramentros
	
	//java e #c
	//class carro{
	//  void frear(){
	//     . .
	//  }
	//}
	
	//python carro:
	//  def frear()
	
	//metodos especiais
	//construtor
	//class carro{
	//  carro(){
	//   ...
	//  }
	//}
	
	//destrutor
	///class carro{
	   //void finalize(){
	//     ...
	//}
	//}
	
	//sobrecarga
	//m1()
	//m1(int i)
	//m1(float f)
	//m1(String s, long l)
	//m1(long l, String s)
	
	//atributos
	
	String cor;
	String modelo;
	int capacidadeTanque;
	
	
	//construtor
	MetodoCarro(){
		
	}
	
	MetodoCarro(String cor, String modelo, int capacidadeTanque){
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
