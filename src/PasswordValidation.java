import java.io.Console;
import java.sql.SQLOutput;
import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter password: ");
        String password = input.next();

        if (password.length() < 5) {
            System.out.println("password for kort");
        } else if (password.length() > 8) {
            System.out.println("password for langt");
        } else {
            System.out.println("Password tilpas");
        }
    }
}