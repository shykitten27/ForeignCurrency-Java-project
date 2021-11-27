/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package foreigncurrency;

/**
 *
 * @author Donna
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class ForeignCurrency {
    static double rEUR, rGBP, rJPY;
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
       
    public static void main(String[] args) {
                    System.out.println("Welcome to the currency calculator!");
                    getRates();
                    doValuation();
                    System.out.println("\nThanks for using the currency calculator!\n");

}
    public static void getRates() {
            System.out.println(
                    "\nPlease enter the currency rate per US $ of the following currencies:\n");

            System.out.print("EUR:  ");
            rEUR = sc.nextDouble();
            while (rEUR <= 0) {
                    System.out.print("illegal EUR rate; please enter positive value: ");
                    rEUR = sc.nextDouble();
            } //end of while

            System.out.print("GBP:  ");
            rGBP = sc.nextDouble();
            while (rGBP <= 0) {
                    System.out.print("illegal GBP rate; please enter positive value: ");
                    rGBP = sc.nextDouble();
            } //end of while

            System.out.print("JPY:  ");
            rJPY = sc.nextDouble();
            while (rJPY <= 0) {
                    System.out.print("illegal JPY rate; please enter positive value: ");
                    rJPY = sc.nextDouble();
            } //end of while

            return;

} //end getRates

    public static void doValuation() {
            int choice;
            double qty, val;
            NumberFormat f = NumberFormat.getCurrencyInstance();


    do {
            System.out.print("\nCurrency for valuation (1=EUR, 2=GBP, 3=JPY, 0=Quit:)");
            choice = sc.nextInt();
            if (choice == 1) {
                    System.out.print("How many Euros are you buying? ");
                    qty = sc.nextDouble();
                    val = qty * rEUR;
                    System.out.println("\n" + qty + "1 Euros = " + f.format(val) );

            } else if (choice == 2) {
                    System.out.print("How many Pounds Sterling are you buying? ");
                                            qty = sc.nextDouble();
                                            val = qty * rGBP;
                    System.out.println("\n" + qty + " Pounds Sterling = " + f.format(val) );

            } else if (choice == 3) {
                    System.out.print("How many Yen are you buying? ");
                                            qty = sc.nextDouble();
                                            val = qty * rJPY;
                    System.out.println("\n" + qty + " Yen = " + f.format(val) );

            } else if (choice !=0) {
                    System.out.println("Please enter values 0, 1, 2, or 3");


            } //endif

    } //enddo
    while (choice != 0);

    } //end doValuation
} //end of class
