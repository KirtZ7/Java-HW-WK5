public class MathHW {
    public static void main (String[] args) {


        //Exercise 7

        int a = 74; //give a  variable 74
        int b = 36; //give b  variable 36
        int sumAB = a+b; //add both variables together

        System.out.println("Value of X = " +a); // call a variable
        System.out.println("Value of Y = " +b); // call b variable
        System.out.println("\n"); // new line
        System.out.println("X + Y = " + sumAB); //call the sum function
        System.out.printf("X + Y = " + (a+b)); //do addition without sum


        // Exercise 8
        // set variables
        int c = 50;
        int d = 3;
        //set variables as doubles
        double e = 50d;
        double f = 3d;
        int divCnD = c/d; // divide the variables
        double divEnF = e/d; //divide variables as doubles
        System.out.println(divCnD);
        System.out.println(divEnF);

        //Exercise 9
        // Set variables
        double j = 5d;
        double k = 8d;
        double l = 6d;
        double m = 55d;
        double n = 9d;
        double o = 20d;
        double p = 3d;
        double q = 5d;
        double r = 15d;
        double s = 2d;

        int t = 8;
        int u = 20;
        int v = 3;
        int w = 5;

        // A
        System.out.println("-5 + 8 * 6 = "+ (-j + k * l));

        // B
        System.out.println("(55 + 9 % 9 = )" + (m + n) % n);

        // C
        System.out.println("20 + -3 * 5 / 8 = " + (o + -p*q/k));

        //C alternative
        System.out.println("20 + -3 * 5 / 8 = " + (u + -v*w/t));

        // D
        System.out.println("5 + 15 / 3 * 2 -8 % 3 = " + (j + r / p * s - k % p));



    }

}
