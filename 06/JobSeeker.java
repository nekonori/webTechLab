import java.util.Scanner;
import java.util.regex.*;

public class JobSeeker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        if (!Pattern.matches("^[a-zA-Z0-9]{3,}_job$", sc.nextLine()))
            System.out.println("Invalid username");
        System.out.print("Email: ");
        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
                Pattern.CASE_INSENSITIVE);
        if (!emailPattern.matcher(sc.nextLine()).find())
            System.out.println("Invalid email");
        System.out.print("Password: ");
        if (!Pattern.matches("^[a-zA-Z0-9]*$", sc.nextLine()))
            System.out.println("Invalid password");
        sc.close();
    }
}
