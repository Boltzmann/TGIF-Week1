public class PasswordValidator {

    public static boolean isLengthOK(String password) {

        return password.length() > 7;
    }


    public static boolean hasNumbers(String password) {

        return true;
    }
}
