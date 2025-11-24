import java.util.Scanner;
public class Latihan5 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.err.print("enter customer name: ");
        String name = scanner.nextLine();
        final double PRICEPERITEM = 20000;
        System.out.print("Enter total quantity: ");
        int quantity = scanner.nextInt();
        int DiscountSteps = quantity/10;
        double discount = DiscountSteps*0.05;

        if (discount>0.50){
            discount = 0.50;
        }
        double totalPrice = quantity*PRICEPERITEM;
        double DiscountAmount = totalPrice*discount;
        double finalPrice = totalPrice-DiscountAmount;

        System.err.println("\n==Nota==");
        System.err.println("Name: "+ name);
        System.err.println("Quantity"+ quantity);
        System.err.println("Price per item: Rp."+ PRICEPERITEM);
        System.err.println("Discount: "+ (discount*100)+ "%");
        System.err.println("Total before discount: Rp."+ totalPrice);
        System.err.println("Discount amount: Rp."+ DiscountAmount);
        System.err.println("Final total: Rp."+ finalPrice);

        scanner.close();
    }
}
