import java.util.Random;
import java.text.DecimalFormat;

public class TemperatureMeteoApp {
	public static void main(String[] args) {
	
		System.out.println("Temperature: " + OpenMeteoProvider.TemperatureDecimalFormat(056));
		System.out.println("Humidity: " + PrivateMeteoProvider.getCurrentHumidity(056) + "%");
		
		System.out.println("Temperature: " + OpenMeteoProvider.TemperatureDecimalFormat(156));
		System.out.println("Humidity: " + PrivateMeteoProvider.getCurrentHumidity(156) + "%");
		
		System.out.println("Temperature: " + OpenMeteoProvider.TemperatureDecimalFormat(268));
		System.out.println("Humidity: " + PrivateMeteoProvider.getCurrentHumidity(268) + "%");
		
		System.out.println("Temperature: " + OpenMeteoProvider.TemperatureDecimalFormat(352));
		System.out.println("Humidity: " + PrivateMeteoProvider.getCurrentHumidity(352) + "%");
		
		System.out.println("Temperature: " + OpenMeteoProvider.TemperatureDecimalFormat(450));
		System.out.println("Humidity: " + PrivateMeteoProvider.getCurrentHumidity(450) + "%");
		
		System.out.println("Temperature: " + OpenMeteoProvider.TemperatureDecimalFormat(123));
		System.out.println("Humidity: " + PrivateMeteoProvider.getCurrentHumidity(123) + "%");
	}
}

 class OpenMeteoProvider {
	 
	static double randomTemperature;
	static String TemperatureDecimalFormat(int countryCode) {
		String pattern = "#0.0";
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		randomTemperature = getCurrentTemperature(countryCode);
		String output = myFormatter.format(randomTemperature);
		return output;
	}
	
	 static double getCurrentTemperature( int countryCode ){
	       switch(countryCode) {
	       case 056: System.out.println("Belgium"); randomTemperature = generateRandom(-50, 50); break;
	       case 156: System.out.println("China"); randomTemperature = generateRandom(-50, 50); break; 
	       case 268: System.out.println("Georgia"); randomTemperature = generateRandom(-50, 50); break;
	       case 352: System.out.println("Iceland"); randomTemperature = generateRandom(-50, 50); break;
	       case 450: System.out.println("Madagaskar"); randomTemperature = generateRandom(-50, 50); break;
	       default: System.err.println("Can't provide data for this country!"); randomTemperature = 0; break;
	     }   
	       return randomTemperature;
	 }
	 
	 static double generateRandom(int min, int max) {
		    Random r = new Random();
		    double randomValue = min + r.nextDouble()*(max - min);
		    return randomValue;
		}
}
 
 class PrivateMeteoProvider extends OpenMeteoProvider{
	static byte randomHumidity;
	static byte getCurrentHumidity( int countryCode ) {
		 switch(countryCode) {
	       case 056: System.out.println("Belgium"); randomHumidity = (byte)generateRandom(0, 100); break;
	       case 156: System.out.println("China"); randomHumidity = (byte)generateRandom(0, 100); break; 
	       case 268: System.out.println("Georgia"); randomHumidity = (byte)generateRandom(0, 100); break;
	       case 352: System.out.println("Iceland"); randomHumidity= (byte)generateRandom(0, 100); break;
	       case 450: System.out.println("Madagaskar"); randomHumidity = (byte)generateRandom(0, 100); break;
	       default: System.err.println("Can't provide data for this country!"); randomHumidity = 0; break;
	     }       
	       return randomHumidity;
	 }
 }
 
