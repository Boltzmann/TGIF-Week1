public class PasswordValidator {

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
}
