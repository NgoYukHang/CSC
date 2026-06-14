// NGO YUK HANG 228991 LAB 7 Q1
public class TemperatureUnitConverter{
	public static void main(String[] args){
		System.out.printf("%-10s %-10s | %-10s %-10s\n","Celsius","Fahrenheit","Fahrenheit","Celsius");
		double temperatureCelsius = 40.00;
		double temperatureFahrenheit = 120.00;
		do{
			System.out.printf("%-10.2f %-10.2f | %-10.2f %-10.2f\n",temperatureCelsius,convertCelsiusToFahrenheit(temperatureCelsius),temperatureFahrenheit,convertFahrenheitToCelsius(temperatureFahrenheit));
			temperatureCelsius -= 1;
			temperatureFahrenheit -= 10;
		} while(temperatureCelsius > 30 && temperatureFahrenheit > 20);
	}

	public static double convertCelsiusToFahrenheit(double temperatureCelsius){
		return (9.0/5) * temperatureCelsius + 32;
	}

	public static double convertFahrenheitToCelsius(double temperatureFahrenheit){
		return (temperatureFahrenheit - 32) * (5/9.0);
	}
}
