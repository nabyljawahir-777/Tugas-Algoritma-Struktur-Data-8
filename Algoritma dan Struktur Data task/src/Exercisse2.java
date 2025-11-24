import java.util.Scanner;

public class Exercisse2 {
    public static void main (String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Total Pembayaran: ");
        double Total = input.nextInt();
        System.out.println("Bayar: ");
        double Bayar = input.nextInt();

        if ( Bayar >= Total){
            System.out.println("sisa saldo anda: " + (Bayar - Total));
        } else if (Total >= 50000){
            System.out.println("Sisa saldo anda: " + (Bayar - Total + (Total * 0.10)));
        } else if (Total >= 200000){
            System.out.println("Sisa saldo anda: " + (Bayar - Total + (Total * 0.20)));
        } else if (Bayar < Total){
            System.out.println("Saldo anda tidak cukup");
        }
    }
}
