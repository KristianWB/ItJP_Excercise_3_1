import java.util.Scanner;

public class Algebra_SolveQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompting the user to insert the 3 values for a, b and c
        System.out.println("Please insert values for a, b and c ");
        System.out.print("value a: ");
        double a = input.nextDouble();
        System.out.print("value b: ");
        double b = input.nextDouble();
        System.out.print("Value c: ");
        double c = input.nextDouble();

        // Calculating the values of r_1 and r_2 based on the entered values for a, b and c
        double r1 = (-b + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
        //System.out.println(r1); // Testline
        //System.out.println(r2); // Testline

        // Calculating the discriminant
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        //System.out.println(discriminant);   // Testline

        // Arranging the printout utilising to the switch system
        int statusD = 0;
        if (discriminant > 0)
            statusD = 0;
        else if (discriminant == 0)
            statusD = 1;
        else if (discriminant < 0)
            statusD = 2;
        else
            System.out.println("Error, fail in input... retry");

        // Arranging the printout according to result type eg. 1, 2 or 0 roots

        switch (statusD) {
            case 0: System.out.println("There are two roots and their values are r1: " + r1 + " and r2: " + r2); break;
            case 1: System.out.println("There are only one root and it's value are r: " + r1); break;
            case 2: System.out.println("There are no roots, now bugger off, you.....SLACKER!!!");


        }
        // Solution where result are displayed directly on boolian logic
        if (discriminant > 0)
            System.out.println("There are two roots and their values are r1: " + r1 + " and r2: " + r2);
        else if (discriminant == 0)
            System.out.println("There are only one root and it's value are r: " + r1);
        else if (discriminant < 0)
            System.out.println("There are no roots, now bugger off, you.....SLACKER!!!");
        else
            System.out.println("Sorry to disturb you sir.... You have trespassed down the wrong ally and must return to sanity");
    }
}
