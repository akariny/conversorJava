package controle;

import java.text.DecimalFormat;

public class ConverterTemperatura {
	
	DecimalFormat formato = new DecimalFormat("###.##");      

	public String celciusParaFahrenheit(double valor) {
		double resultado = 0;
		resultado = (9 * valor + 160) / 5 ;
		
		return formato.format(resultado);
	}
	
	public String celciusParaKelvin(double valor) {
		double resultado = 0;
		resultado = valor + 273;
		
		return formato.format(resultado);
	}
	
	public String fahrenheitParaCelsius(double valor) {
		double resultado = 0;
		resultado = (valor - 32) / 1.8;
		
		return formato.format(resultado);
	}
	
	public String fahrenheitParaKelvin(double valor) {
		double resultado = 0;
		resultado = (valor - 32) * (5/9) + 273;
		
		return formato.format(resultado);
	}
	
	public String kelvinParaCelsius(double valor) {
		double resultado = 0;
		resultado = valor - 273;
		
		return formato.format(resultado);
	}
	
	public String kelvinParaFahrenheit(double valor) {
		double resultado = 0;
		resultado =(valor - 273) * 1.8 + 32;

		return formato.format(resultado);
	}

}
