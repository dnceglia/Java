import java.util.Scanner;
 
class Temperature {
	

	public double FahrenheitToCelsius(double fahrenheit) {
		
		double temperatue = 0;
		Scanner inputTemperature = new Scanner(System.in);
		System.out.print("Fahrenheit temperature: ");
		temperature = inputTemperature.nextDouble();
		temperature = ((temperature - 32)*5)/9;
		// double celsius = (5.0/9.0)*(fahrenheit - 32);
		
		System.out.println("Temperature in C is: " + temperatue);
		
	}
		/*
		public double CelsiusToFahrenheit(double celsius) {
		
		double temperatue = 0;
		
		// put Celsius To Fahrenheit conversion code here
		
		// put code here
		
		return temperatue;
		
	}
	*/
}
 
class TemperatureCaluclator {
	
  public static void main(String[] args) {
  	
  	Temperature temp = new Temperature();
  	
    System.out.println("Fahrenheit conversion = " + temp.FahrenheitToCelsius(32));
    
    System.out.println("Celsius conversion = " + temp.CelsiusToFahrenheit(100));
    
  }
}
