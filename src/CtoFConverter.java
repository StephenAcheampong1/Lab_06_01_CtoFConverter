import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        double C = 0;
        double F = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        C = in.nextDouble();

        if (C == 0)
        {
            System.out.println("You have entered the freezing point");
        }
        else if (C == 100)
        {
            System.out.println("You have entered the boiling point");
        }
        else
        {
            F = C * 9 / 5 + 32;
            System.out.println("The equivalent temperature in Fahrenheit is: " +F);
        }
    }
}