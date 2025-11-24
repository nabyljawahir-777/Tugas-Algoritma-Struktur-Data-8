import java.util.Scanner;
public class Latihan3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double largest = Double.MAX_VALUE;
        double smallest = Double.MIN_VALUE;
        int count = 0;
        char choice;

        do{
            System.err.println("enter a number: ");
            double num = scanner.nextDouble();
            sum += num;
            count++;

            if (num > largest) largest = num;
            if (num < smallest) smallest = num;

            System.out.print("do you want enter another number? (y/n): ");
            choice = scanner.next().charAt(0);
        }while (choice == 'y' || choice =='Y');
        double average = sum/count;
        
        System.out.println("\n=== Results ===");
        System.out.println("Largest Number: "+ largest);
        System.out.println("Lowest Number: "+ smallest);
        System.out.println("sum: "+ sum);
        System.out.println("Average: "+ average);
        scanner.close();
    }
}