import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Enter Product Details ---");

        System.out.print("Enter Product ID: ");
        String productId = scanner.nextLine();

        System.out.print("Enter Product Name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Stock Quantity: ");
        int stockQuantity = scanner.nextInt();

        Product p = new Product(productId, productName, price, stockQuantity);

        System.out.print("\nEnter Discount Percentage to apply: ");
        double discount = scanner.nextDouble();

        p.applyDiscount(discount);

        System.out.println("\n--- Final Output ---");
        System.out.println("Updated Price: " + p.getPrice());
        System.out.println("Stock Quantity: " + p.getStockQuantity());

        scanner.close();
    }
}