package teste;

public class Universidade {

	public static void main(String[] args) 
	{

		Estudante estudante = new Estudante("Zani", 2004, 10);
		
		EstudantePos estudantePos = new EstudantePos("ZaniPos", 2004, 10);
		
		estudante.calculaCredito();
		
		estudantePos.calculaCredito();

	}

}
