
class TempConverter {
		
	
	double celsiusToKelvin(double celsiusTemp) {
		
		double kelvinTemp = celsiusTemp+273.15;
		return kelvinTemp;
		
		
	}
	double kelvinToCelsius(double kelvinTemp) {
		double celsiusTemp = kelvinTemp-273.15;
		return celsiusTemp;
		
	}
	
	double celsiusToFarenht(double celsiusTemp) {
		
		double fahrenTemp=((celsiusTemp*1.8)+32);
		return fahrenTemp;
		
	}
	
	double farenhtToCelsius(double fahrenTemp) {
		double celsiusTemp = ((fahrenTemp-32)*5)/9;
		return celsiusTemp;
		
	}
	
	double kelvinToFarenht(double kelvinTemp) {
		double fahrenTemp = ((kelvinTemp-273.15)*1.8)+32;
		return fahrenTemp;
		
	}
	
	double farenhtToKelvin(double fahrenTemp) {
		double tempVariable = farenhtToCelsius(fahrenTemp);
		return tempVariable+273.15;
		
	}
	

}
