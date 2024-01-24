import java.util.Scanner;

public class temp{
    public static void main(String[] args){
        Scanner keyb = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit: ");
        double f = keyb.nextDouble();

        double c = (f - 32) * 5 / 9;
        System.out.println("The temperature in Celsius is: " + c);

        keyb.close();
        
    }
}