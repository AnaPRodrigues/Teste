package ClassesAbstratasGrupo1;

public class Moto extends Veiculo{
	public String cor = "Rosa";
	public String marca = "Yamaha"; 
	
	public Moto() {	
		this.roda = 2;
	}

	@Override
	public void Conduzir() {
		System.out.printf("O ve�culo %s da cor %s est� em andamento\n", marca, cor);
		
	}
}
