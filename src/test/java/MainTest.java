import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void passwordLengthCheck_when8_shouldTrue_Test() {

        assertTrue(PasswordValidator.isLengthOK("Passwort"));
    }

    @Test
    void passwordLengthCheck_whenLessThan8_shouldFalse_Test(){
        assertFalse(PasswordValidator.isLengthOK("1234"));
    }

    @Test
    void checkIfContainsNumbers_whenNumbers_shouldTrue(){
        assertTrue(PasswordValidator.hasNumbers("Pass1234"));
    }
}
