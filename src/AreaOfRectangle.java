
//The Scanner class is used to get user input, and it is found in the java.util package.
import java.util.Scanner;

public class AreaOfRectangle {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.print("Input Rectangle Width (cm): ");
            double w = in.nextDouble();

            System.out.print("Input Rectangle Height (cm): ");
            double h = in.nextDouble();

            double area= w * h;

            System.out.println("Area of rectangle= " + area + " cm ");

        }

    }

