import java.util.Scanner;
public class Latihan4 {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);
       System.out.print("input: ");
       String name = scanner.nextLine();
       System.out.println("\nOutput: \n");
       for (int i = 1; i <= name.length(); i++) { {
        System.out.println(name.substring(0,i).toUpperCase());
             }
        }
        scanner.close();
    }
}
