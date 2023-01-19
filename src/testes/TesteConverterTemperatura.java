package testes;

import controle.ConverterTemperatura;

public class TesteConverterTemperatura {

	public static void main(String[] args) {
		 ConverterTemperatura temperatura = new ConverterTemperatura();
		 
		 //temperatura.celciusParaFahrenheit(55.6);
		 
		 System.out.println(temperatura.celciusParaFahrenheit(200.20563));

	}

}
