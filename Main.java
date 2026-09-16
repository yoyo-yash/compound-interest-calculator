import java.util.Scanner; // importing scanner
class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // set up scanner object
    
        // define variables
        double principal;
        double rate;
        int years;
        double amount;

        System.out.print("Enter the pricipal amount: "); // input the principal
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): "); // input the rate
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the number of years: "); // input the number of years
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate, years); // calculate amount

        System.out.printf("The amount after %d years is %.2f", years, amount); // gives final output

        scanner.close(); // close scanner

    }
}