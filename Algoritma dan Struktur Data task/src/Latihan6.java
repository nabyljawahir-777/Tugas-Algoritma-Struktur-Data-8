import java.util.Scanner;
public class Latihan6 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String text = input.nextLine();
        String cleaned = text.replaceAll("\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        if (cleaned.equals(reversed)) {
            System.out.println(text+"is a palindrome");
        }else{
            System.out.println(text+"is not a palindrome");
        }
        input.close();
    }
}
