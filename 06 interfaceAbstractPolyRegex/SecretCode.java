import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter code: ");
        String code = sc.next();
        sc.close();
        if (!Character.isUpperCase(code.charAt(0))) {
            System.out.println("Invalid code, first char is not upper case");
            return;
        }
        boolean containsDigit = false;
        for (int i = 0; i < code.length(); i++)
            if (Character.isDigit(code.charAt(i))) {
                containsDigit = true;
                break;
            }
        if (!containsDigit) {
            System.out.println("Invalid code, no digit found");
            return;
        }
        Pattern scPattern = Pattern.compile("^(cod){1}[a-z0-9]{3}$", Pattern.CASE_INSENSITIVE);
        boolean valid = scPattern.matcher(code).find();
        System.out.println(valid ? "Valid code" : "Code not valid");
    }
}
