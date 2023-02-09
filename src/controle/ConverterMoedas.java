package controle;

import java.text.DecimalFormat;

public class ConverterMoedas {
	
	//ordem dos valores de cotação
	/*
	 * 0 - real 
	 * 1 - dolar 
	 * 2 - euro 
	 * 3 - libra esterlina 
	 * 4 - peso argentino 
	 * 5 - peso chileno
	 */
	
	// 1 moeda é igual a quanto? 
	
	double[] cotacaoReal = {1 , 5.09, 0.18, 0.16, 35.56, 160.92};
	double[] cotacaoDolar = {5.09, 1, 0.92, 0.82, 180.97, 819.14};
	double[] cotacaoEuro = {5.52, 1.09, 1, 0.89, 196.37, 889.07};
	double[] cotacaoLibraEsrterlina = {6.23, 1.22, 1.13, 1, 221.33, 1001.90};
	double[] cotacaoPesoArgentino = {0.28, 0.0055, 0.0051, 0.0045, 1, 4.53 };
	double[] cotacaoPesoChileno = {0.0062, 0.0012, 0.0011, 0.00100, 0.22, 1};
	
	DecimalFormat formato = new DecimalFormat("###.##");
	
	
	//real x dolar
	
	public String reaisParaDolar(double valorReal) {
		double resultado;
		resultado = valorReal / cotacaoReal[1];
		
		return formato.format(resultado);
	}
	
	//dolar x real 
	
	public String dolarParaReais(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[0];
		
		return formato.format(resultado);
	}
	
	// real X euro
	
	public String reaisParaEuro(double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[2];
		
		return formato.format(resultado);
	}
	
	// euro x real
	
	public String euroParaReais(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[0];
		
		return formato.format(resultado);
	}
	
	// real x libra esterlina 
	
	public String reaisParaLibraEsterlina(double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[3];
		
		return formato.format(resultado);
	}
	
	//libra esterlina x real 
	
	public String libraEsterlinaParaReais(double valorLibra) {
		double resultado;
		resultado = valorLibra * cotacaoLibraEsrterlina[0];
		
		return formato.format(resultado);
	}
	
	// real x peso argentino 
	
	public String reaisParaPesoArgentino (double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[4];
		
		return formato.format(resultado);
	}
	
	// peso argentino x real
	
	public String pesoArgentinoParaReais(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[0];
	
		return formato.format(resultado);
	}
	
	// real x peso chileno 
	
	public String reaisParaPesoChileno(double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[5];
		
		return formato.format(resultado);
	}
	
	// peso chileno x real
	
	public String pesoChilenoParaReais(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[0];
		
		return formato.format(resultado);
	}
	
	// dolar x euro 
	
	public String dolarParaEuro(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[2];
		
		return formato.format(resultado);
	}
	
	// euro x dolar
	
	public String euroParaDolar(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[1];
		
		return formato.format(resultado);
	}
	
	// dolar x libra esterlina
	
	public String dolarParaLibraEsterlina(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[3];
		
		return formato.format(resultado);
	}
	
	// libra estarlina x dolar 
	
	public String libraEsterlinaParaDolar(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[1];
		
		return formato.format(resultado);
	}
	// dolar x peso argentino 
	
	public String dolarParaPesoArgentino(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[4];
		
		return formato.format(resultado);
	}
	
	// peso argentino x dolar 
	
	public String pesoArgentinoParaDolar(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[1];
		
		return formato.format(resultado);
	}
	
	// dolar x peso chileno 
	
	public String dolarParaPesoChileno(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[5];
		
		return formato.format(resultado);
	}
	
	// peso chileno x dolar 
	
	public String pesoChilenoParaDolar(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[1];
		
		return formato.format(resultado);
	}
	
	// euro x libra esterlina 
	
	public String euroParaLibraEsterlina(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[3];
		
		return formato.format(resultado);
	}
	
	// libra esterlina x euro 
	
	public String libraEsterlinaParaEuro(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[2];
		
		return formato.format(resultado);
	}
	
	// euro x peso argentino 
	
	public String euroParaPesoArgentino(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[4];
		
		return formato.format(resultado);
	}
	
	// peso argentino x euro
	
	public String pesoArgentinoParaEuro(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[2];
		
		return formato.format(resultado);
	}
	
	// euro x peso chileno 
	
	public String euroParaPesoChileno(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[5];
		
		return formato.format(resultado);
	}
	
	// peso chileno x euro 
	
	public String pesoChilenoParaEuro(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[2];
		
		return formato.format(resultado);
	}
	
	// libra esterlina x peso argentino 
	
	public String libraEsterlinaParaPesoArgentino(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[4];
		
		return formato.format(resultado);
	}
	
	// peso argentino x libra estelina
	
	public String pesoArgentinoParaLibraEsterlina(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[3];
		
		return formato.format(resultado);
	}
	
	// libra esterlina x peso chileno 
	
	public String libraEsterlinaParaPesoChileno(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[5];
		
		return formato.format(resultado);
	}
	
	// peso chileno x libra esterlina
	
	public String pesoChilenoParaLibraEsterlina(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[3];
		
		return formato.format(resultado);
	}
	
	//peso argentino x peso chileno
	
	public String pesoArgentinoParaPesoChileno(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[5];
		
		return formato.format(resultado);
	}
	
	// peso chileno x peso argentino
	
	public String pesoChilenoParaPesoArgentino(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[4];
		
		return formato.format(resultado);
	}
	
}
