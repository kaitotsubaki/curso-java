package exercicios.sequenciais;
import java.util.Locale;

public class exc0 {
    public static void main (String [] args){

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.println(product1 + ", which price is $ " + price1);
        System.out.println(product2 + ", which price is $ " + price2);

        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);
        System.out.println("Measure with eight decimal places: " + measure);
        System.out.printf("Rounded (three decimal places): %.2f%n", measure);

        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.2f%n", measure);


    }
}
