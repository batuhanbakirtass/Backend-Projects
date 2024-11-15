import java.util.Scanner;

public class VATAmountCalculationProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the amount from the user
        System.out.print("Enter the amount : ");
        double amount = scanner.nextDouble();

        // Determine the VAT rate
        double vatRate = (amount > 0 && amount <= 1000) ? 0.18 : 0.08;

        // Calculate the VAT amount and total price including VAT
        double vatAmount = amount * vatRate;
        double totalPrice = amount + vatAmount;

        // Display the results
        System.out.println("Price without VAT : " + amount);
        System.out.println("VAT Rate : %" + (vatRate * 100));
        System.out.println("VAT Amount : " + vatAmount);
        System.out.println("Total Price (including VAT) : " + totalPrice);

        scanner.close();

    }
}
