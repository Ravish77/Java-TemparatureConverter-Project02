import java.util.Scanner;

public class LaunchConverter {

	public static void main(String[] args) {
		
		TempConverter converter = new TempConverter();
		
		int n;
		double temparature, newTemp;
		
		
		System.out.println("1.  To convert Temperature from Celsius to Kelvin: ");
		System.out.println("2.  To convert Temperature from Celsius to Fahrenheit: ");
		System.out.println("3.  To convert Temperature from Kelvin to Celsius: ");
		System.out.println("4.  To convert Temperature from Kelvin to Fahrenheit: ");
		System.out.println("5.  To convert Temperature from Fahrenheit to Kelvin: ");
		System.out.println("6.  To convert Temperature from Fahrenheit to Celsius: ");
		System.out.println();
		System.out.println("Choose one among the above:");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		while(n<1 || n>6) {
			System.out.println("Choose the above options only.");
			n=sc.nextInt();
		}
		System.out.println();
		System.out.println("Enter the Temperature: ");
		temparature= sc.nextDouble();
		
		switch(n) {
		case 1:
			newTemp = converter.celsiusToKelvin(temparature);
			System.out.println(temparature+" celcius is equal to "+newTemp+" Kelvin");
			break;
		case 2:
			newTemp = converter.celsiusToFarenht(temparature);
			System.out.println(temparature+" celcius is equal to "+newTemp+" Fahrenheit");
			break;
		case 3:
			newTemp = converter.kelvinToCelsius(temparature);
			System.out.println(temparature+" Kelvin is equal to "+newTemp+" celsius");
			break;
		case 4:
			newTemp = converter.kelvinToFarenht(temparature);
			System.out.println(temparature+" Kelvin is equal to "+newTemp+" Fahrenheit");
			break;
			
		case 5:
			newTemp = converter.farenhtToKelvin(temparature);
			System.out.println(temparature+" fahrenheit is equal to "+newTemp+" Kelvin");
			break;
		
		case 6:
			newTemp = converter.farenhtToCelsius(temparature);
			System.out.println(temparature+" Kelvin is equal to "+newTemp+" celsius");
			break;
			
		
		}
		
		

	}

}
