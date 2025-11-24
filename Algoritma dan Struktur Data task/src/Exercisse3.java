import java.util.Scanner;

public class Exercisse3 {
    public static void main (String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String CorrectPassword = "admin";
        int kesempatan = 3;

        while (kesempatan > 0) {
            System.out.print("Masukan password: ");
            String Password = input.nextLine();

            if (Password.equals(CorrectPassword)){
                System.out.println("Login succesful");
            } else {
                kesempatan -- ;
                System.out.println("Incorrect, sisa kesempatan: " + kesempatan);
            }
            if (kesempatan == 0) {
                System.out.println("Account locked");
            }
        }
    }
}
