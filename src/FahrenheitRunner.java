import java.util.Scanner;

public class FahrenheitRunner {

    /**
     * The main method is to ask users input and convert it from Fahrenheit to Celsius.
     * @param args empty
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        double celsius = Temperature.fahrenheitToCelsius(fahrenheit);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    }
}