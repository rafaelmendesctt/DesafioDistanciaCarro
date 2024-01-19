package MediaDeDistanciaCarro;

public class Carro {
	public double combustivel;
	
	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	
	public double medeConsumo(Estrada estrada, Carro carro) {
		double consumo = estrada.getDistancia() / carro.getCombustivel();
		return consumo;
	}
}
