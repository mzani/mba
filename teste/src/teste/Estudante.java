package teste;

public class Estudante 

{
	private String matricula, nome;
	private int anoDeIngresso, qtdDisciplina;
	
	public Estudante(String nome, int anoDeIngresso, int qtdDisciplina) 
	{
		super();
		this.nome = nome;
		this.anoDeIngresso = anoDeIngresso;
		this.qtdDisciplina = qtdDisciplina;
	}
	
	public void calculaCredito ()
	{
		int resultado = 4 * qtdDisciplina;
		System.out.println(" Quantidade de Creditos é:" + resultado);
	}

	public int getQtdDisciplina() {
		return qtdDisciplina;
	}
	
    

}
