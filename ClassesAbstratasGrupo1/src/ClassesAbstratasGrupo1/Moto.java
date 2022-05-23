package ClassesAbstratasGrupo1;

public class Moto extends Veiculo{
	public String cor = "Rosa";
	public String marca = "Yamaha"; 
	
	public Moto() {	
		this.roda = 2;
	}

	@Override
	public void Conduzir() {
		System.out.printf("O veículo %s da cor %s está em andamento\n", marca, cor);
		
	}
}
