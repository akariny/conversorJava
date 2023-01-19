package controle;

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
	
	
	//real x dolar
	
	public double reaisParaDolar(double valorReal) {
		double resultado;
		resultado = valorReal / cotacaoReal[1];
		System.out.println(resultado);
		return resultado;
	}
	
	//dolar x real 
	
	public double dolarParaReais(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[0];
		
		return resultado;
	}
	
	// real X euro
	
	public double reaisParaEuro(double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[2];
		
		return resultado;
	}
	
	// euro x real
	
	public double euroParaReais(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[0];
		
		return resultado;
	}
	
	// real x libra esterlina 
	
	public double reaisParaLibraEsterlina(double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[3];
		
		return resultado;
	}
	
	//libra esterlina x real 
	
	public double libraEsterlinaParaReais(double valorLibra) {
		double resultado;
		resultado = valorLibra * cotacaoLibraEsrterlina[0];
		
		return resultado;
	}
	
	// real x peso argentino 
	
	public double reaisParaPesoArgentino (double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[4];
		
		return resultado;
	}
	
	// peso argentino x real
	
	public double pesoArgentinoParaReais(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[0];
	
		return resultado;
	}
	
	// real x peso chileno 
	
	public double reaisParaPesoChileno(double valorReal) {
		double resultado;
		resultado = valorReal * cotacaoReal[5];
		
		return resultado;
	}
	
	// peso chileno x real
	
	public double pesoChilenoParaReais(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[0];
		
		return resultado;
	}
	
	// dolar x euro 
	
	public double dolarParaEuro(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[2];
		
		return resultado;
	}
	
	// euro x dolar
	
	public double euroParaDolar(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[1];
		
		return resultado;
	}
	
	// dolar x libra esterlina
	
	public double dolarParaLibraEsterlina(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[3];
		
		return resultado;
	}
	
	// libra estarlina x dolar 
	
	public double libraEsterlinaParaDolar(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[1];
		
		return resultado;
	}
	// dolar x peso argentino 
	
	public double dolarParaPesoArgentino(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[4];
		
		return resultado;
	}
	
	// peso argentino x dolar 
	
	public double pesoArgentinoParaDolar(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[1];
		
		return resultado;
	}
	
	// dolar x peso chileno 
	
	public double dolarParaPesoChileno(double valorDolar) {
		double resultado;
		resultado = valorDolar * cotacaoDolar[5];
		
		return resultado;
	}
	
	// peso chileno x dolar 
	
	public double pesoChilenoParaDolar(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[1];
		
		return resultado;
	}
	
	// euro x libra esterlina 
	
	public double euroParaLibraEsterlina(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[3];
		
		return resultado;
	}
	
	// libra esterlina x euro 
	
	public double libraEsterlinaParaEuro(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[2];
		
		return resultado;
	}
	
	// euro x peso argentino 
	
	public double euroParaPesoArgentino(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[4];
		
		return resultado;
	}
	
	// peso argentino x euro
	
	public double pesoArgentinoParaEuro(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[2];
		
		return resultado;
	}
	
	// euro x peso chileno 
	
	public double euroParaPesoChileno(double valorEuro) {
		double resultado;
		resultado = valorEuro * cotacaoEuro[5];
		
		return resultado;
	}
	
	// peso chileno x euro 
	
	public double pesoChilenoParaEuro(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[2];
		
		return resultado;
	}
	
	// libra esterlina x peso argentino 
	
	public double libraEsterlinaParaPesoArgentino(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[4];
		
		return resultado;
	}
	
	// peso argentino x libra estelina
	
	public double pesoArgentinoParaLibraEsterlina(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[3];
		
		return resultado;
	}
	
	// libra esterlina x peso chileno 
	
	public double libraEsterlinaParaPesoChileno(double valorLibraEsterlina) {
		double resultado;
		resultado = valorLibraEsterlina * cotacaoLibraEsrterlina[5];
		
		return resultado;
	}
	
	// peso chileno x libra esterlina
	
	public double pesoChilenoParaLibraEsterlina(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[3];
		
		return resultado;
	}
	
	//peso argentino x peso chileno
	
	public double pesoArgentinoParaPesoChileno(double valorPesoArgentino) {
		double resultado;
		resultado = valorPesoArgentino * cotacaoPesoArgentino[5];
		
		return resultado;
	}
	
	// peso chileno x peso argentino
	
	public double pesoChilenoParaPesoArgentino(double valorPesoChileno) {
		double resultado;
		resultado = valorPesoChileno * cotacaoPesoChileno[4];
		
		return resultado;
	}
	
}
