package ClassesAbstratasGrupo1;

public class Carro extends Veiculo{
	public int velocidadeMaxima = 200;
	public int numeroDePassageiros = 5;

	public Carro() {	
		this.roda = 4;
	}
	
	@Override
	public void Conduzir() {
		System.out.printf("O carro com limite de velocidade de %d km/h e que "
				+ "comporta %d passageiros está em andamento\n", velocidadeMaxima, numeroDePassageiros);
		
	}

}
