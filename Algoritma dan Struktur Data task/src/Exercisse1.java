import java.util.Scanner;

public class Exercisse1 {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Total Pembayaran: ");
        int Total = input.nextInt();
        System.out.println("Bayar: ");
        int Bayar = input.nextInt();

        if (Bayar >= Total) {
            System.out.println("Sisa saldo anda: " + (Bayar - Total));
        } else {
            System.out.println("saldo anda tidak cukup");
        }
    }
}
