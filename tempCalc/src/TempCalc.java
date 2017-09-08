
class Temperature {
    
    public double FahrenheitToCelsius(double fahrenheit) {
        double temperature = 0;
        // Fahrenheit To Celsius conversion code
        temperature = (fahrenheit - 32) * 5 / 9;
        return temperature;
    }
    
    public double CelsiusToFahrenheit(double celsius) {
        double temperature = 0;
        // put Celsius To Fahrenheit conversion code here
        temperature = celsius * 9 / 5 + 32;
        return temperature;
    }
    
}

class TemperatureCalculator {
    
    public static void main(String[] args) {
        
        Temperature temp = new Temperature();
        
    System.out.println("Fahrenheit conversion = " + temp.FahrenheitToCelsius(32));
    System.out.println("Celsius conversion = " + temp.CelsiusToFahrenheit(100));
    
    }
}