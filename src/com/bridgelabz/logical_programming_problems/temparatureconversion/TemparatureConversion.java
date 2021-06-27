package com.bridgelabz.logical_programming_problems.temparatureconversion;

import java.util.Scanner;

public class TemparatureConversion {
	
	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select any conversion: 1) degC to degF 2) degF to degC ");
		int number = scanner.nextInt();
		getTemperature(scanner, number);
	}

	private static void getTemperature(Scanner scanner, int number) {
		
		if (number == 1)
		{
			System.out.println("Enter degC value: ");
			int celsius = scanner.nextInt();
			double result = (celsius * (9/5))+32;
			System.out.println("degF value after conversion is : "+result);
		}
		else {
			System.out.println("Enter degF value: ");
			int fahrenheit = scanner.nextInt();
			double result = (fahrenheit - 32)*5/9;
			System.out.println("degF value after conversion is : "+result);
		}
	}	
}






/*read -p "Select any conversion: 1) degC to degF 2) degF to degC: " num

function getDegFahrenheit()
{
        result=`echo | awk '{print ('$Celsius' * (9/5)) + 32}'`
        echo "degF: " $result"°F"
}
function getDegCelsius()
{
        result=`echo - | awk '{print ('$Fahrenheit' - 32) * 5/9}'`
        echo "degC: " $result"°C"
}

case $num in

        1)
                read -p "Enter degC Value b/w 0C to 100C : " Celsius
                getDegFahrenheit $Celsius
                ;;
        2)
                read -p "Enter degF value b/w 32F to 212F : " Fahrenheit
                getDegCelsius $Fahrenheit
                ;;
esac
*/