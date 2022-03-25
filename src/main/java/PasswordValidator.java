import java.util.Scanner;

public class PasswordValidator {

    public static void main(String[] args) {

        String password = "";
        while(!isValid(password)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Geben Sie hier ein gültiges Passwort ein und drücken Sie ENTER.\n" +
                    "Das Passwort muss aus mindestens 8 Zeichen bestehen und sowohl mindestens eine Zahl als auch Groß- und Kleinbuchstaben beinhalten:");
            password = scanner.nextLine();
        }
    }

    public static boolean isLengthOK(String password) {

        return password.length() > 7;
    }


    public static boolean hasNumbers(String password) {  // Test28937

        char[] pass = password.toCharArray();            // {'T', 'e', 's', 't', '2', '8', '9', '3', '7'}
        for (int i = 0; i < password.length(); i++) {    // i = 0   bis  i = 4
            if ('0' <= pass[i] && pass[i] <= '9') {       // nicht erfüllt, dann i++  --> wenn erfüllt, dann Ende der Methode
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(String password) {
        return (isLengthOK(password)
                && hasNumbers(password)
                && containsLowerCase(password)
                && containsUpperCase(password)
                && securePassword(password));
    }

    public static boolean containsLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) { // p.charAt() ->
                return true;
            }
        }
        return false;
    }

    public static boolean containsUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) { // p.charAt() ->
                return true;
            }
        }
        return false;
    }

    public static boolean securePassword(String password) {
        String[] badPass = new String[]{"Passwort1234", "Geheim12345", "Passwort1", "TopSecret123", "Qwerty1234"};
        for (int i = 0; i < badPass.length; i++) {
            if (password.equals(badPass[i])) {
                System.out.println("Das Passwort ist nicht erlaubt, wähle bitte ein neues.");
                return false;
            }

        }
        return true;
    }
}
