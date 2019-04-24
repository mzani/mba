package teste;

public class  EstudantePos extends Estudante
{

	public EstudantePos(String nome, int anoDeIngresso, int qtdDisciplina) {
		super(nome, anoDeIngresso, qtdDisciplina);
	}

	@Override
	public void calculaCredito ()
	{
		int resultado = 2 * super.getQtdDisciplina();
		System.out.println(" Quantidade de Creditos Pos é:" + resultado);
	}
	
}
