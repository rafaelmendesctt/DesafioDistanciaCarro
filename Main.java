package MediaDeDistanciaCarro;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Distancia percorrida: ");
		Estrada estrada = new Estrada();
		estrada.setDistancia(scanner.nextInt());
		
		System.out.print("Combustível gasto: ");
		Carro carro = new Carro();
		carro.setCombustivel(scanner.nextInt());
		
		double calculo = carro.medeConsumo(estrada, carro);
		System.out.printf("Consumo medio = %.3f", calculo);
		
		scanner.close();
	}
}
