package teste;



public class Carro 
{
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	
	void liga ()
	{
		System.out.println("Carro esta ligado!");
	}
	
	void desliga ()
	{
		System.out.println("Carro esta desligado!");
	}
	
	void acelera (double quantidade)
	{
	
		this.velocidadeAtual += quantidade;
		
		if (this.velocidadeAtual > this.velocidadeMaxima)
			this.velocidadeAtual = this.velocidadeMaxima;
		
		System.out.println("A velocidade atual do carro é " + this.velocidadeAtual);
	}
	
	

}
