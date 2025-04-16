import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder output = new StringBuilder();

        // Full name
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        // Billing Address
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // Ask if shipping address is the same
        System.out.print("Is the shipping address the same as the billing address? (yes/no): ");
        String isSame = scanner.nextLine().trim().toLowerCase();

        String shippingStreet, shippingCity, shippingState, shippingZip;

        if (isSame.equals("yes")) {
            shippingStreet = billingStreet;
            shippingCity = billingCity;
            shippingState = billingState;
            shippingZip = billingZip;
        } else {
            // Shipping Address
            System.out.print("Shipping Street: ");
            shippingStreet = scanner.nextLine();

            System.out.print("Shipping City: ");
            shippingCity = scanner.nextLine();

            System.out.print("Shipping State: ");
            shippingState = scanner.nextLine();

            System.out.print("Shipping Zip: ");
            shippingZip = scanner.nextLine();
        }

        // Build output
        output.append(fullName).append("\n")
                .append("\nBilling Address:\n")
                .append(billingStreet).append("\n")
                .append(billingCity).append(", ").append(billingState).append(" ").append(billingZip).append("\n")
                .append("\nShipping Address:\n")
                .append(shippingStreet).append("\n")
                .append(shippingCity).append(", ").append(shippingState).append(" ").append(shippingZip);

        // Display result
        System.out.println("\n" + output.toString());

    }
}