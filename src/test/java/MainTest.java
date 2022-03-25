import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void passwordLengthCheck_when8_shouldTrue_Test() {

        assertTrue(PasswordValidator.isLengthOK("Passwort"));
    }

    @Test
    void passwordLengthCheck_whenLessThan8_shouldFalse_Test() {
        assertFalse(PasswordValidator.isLengthOK("1234"));
    }

    @Test
    void checkIfContainsNumbers_whenNumbers_shouldTrue() {
        assertTrue(PasswordValidator.hasNumbers("Pass1234"));
    }

    @Test
    void checkIfContainsNumbers_whenNoNumbers_shouldFalse() {
        assertFalse(PasswordValidator.hasNumbers("PasswortXY"));
    }

    @Test
    void checkIfPasswordIsValid_whenYes_shouldTrue() {
        assertTrue(PasswordValidator.isValid("Passwort13"));
    }

    @Test
    void checkIfPasswordIsValid_whenNoNumber_shouldFalse() {
        assertFalse(PasswordValidator.isValid("Passwortabc"));
    }

    @Test
    void checkIfLowerCaseContained_whenLowerCaseContained_shouldTrue() {
        assertTrue(PasswordValidator.containsLowerCase("Pass123"));
    }

    @Test
    void checkIfLowerCaseContained_whenLowerCaseNotContained_shouldFalse() {
        assertFalse(PasswordValidator.containsLowerCase("PASS123"));
    }

    @Test
    void checkIsValidForLowerCase_whenLowerCaseNotContained_shouldFalse() {
        assertFalse(PasswordValidator.isValid("PASSSS123"));
    }

    @Test
    void checkIfUpperCaseContained_whenUpperCaseContained_shouldTrue() {
        assertTrue(PasswordValidator.containsUpperCase("Pass123"));
    }

    @Test
    void checkIfUpperCaseContained_whenUpperCaseNotContained_shouldFalse() {
        assertFalse(PasswordValidator.containsUpperCase("pass123"));
    }

    @Test
    void checkIsValidForUpperCase_whenUpperCaseNotContained_shouldFalse() {
        assertFalse(PasswordValidator.isValid("passsss123"));
    }

    @Test
    void checkIfBadPassword_whenNotBad_ShouldTrue(){
        assertTrue(PasswordValidator.securePassword("5up3rGeHe1M"));
    }

    @Test
    void checkIfBadPassword_whenBad_ShouldFalse(){
        assertFalse(PasswordValidator.securePassword("Passwort1234"));
    }
}
