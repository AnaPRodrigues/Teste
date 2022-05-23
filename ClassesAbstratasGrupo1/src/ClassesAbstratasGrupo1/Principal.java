package ClassesAbstratasGrupo1;

public class Principal {

	public static void main(String[] args) {
		Moto moto = new Moto();
		Carro carro = new Carro();
		
		System.out.println("--------------------------------------");
		System.out.println("----------Sistema do grupo 1----------");
		System.out.println("--------------------------------------");
		System.out.println("As diferenças são: \n");
		System.out.println("A moto " + moto.marca + " possui " + moto.roda + " rodas");
		System.out.println("O carro possui " + carro.roda + " rodas");
		moto.Conduzir();
		carro.Conduzir();
		System.out.println("--------------------------------------");
		System.out.println("As semelhanças são: \n");
		System.out.println("Ambos possuem rodas");
		System.out.println("Ambos se movimentam");
		System.out.println("--------------------------------------");
		
	}

}
