import java.util.Scanner;
public class Celsius {
    

//Codigo para conversão de temperaturas


public static void main(String[] args) {
    
    
    Scanner temperatura = new Scanner(System.in);
     double celsius, Kelvin, Reaumur, Rankine, Fahrenheit;
     


System.out.println("Digite uma temperatura em Celsius: ");
celsius = temperatura.nextDouble();

Kelvin = celsius + 273.15;
Reaumur = celsius * 0.8;
Rankine = celsius * 1.8 + 32 + 459.67;
Fahrenheit = celsius * 1.8+ 32;


System.out.println("Em Kelvin: " + Kelvin);
System.out.println("Em Reaumur: "+ Reaumur);
System.out.println("Em Rankine: " + Rankine);
System.out.println("Em Fahrenheit: " + Fahrenheit);




 }
}

