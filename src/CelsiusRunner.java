import java.util.Scanner;

public class CelsiusRunner {

    /**
     * The main method is to ask users input and convert it from Celsius to Fahrenheit.
     * @param args empty
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = Temperature.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degree Celsius is equal to " + fahrenheit + " in Fahrenheit");
    }
}