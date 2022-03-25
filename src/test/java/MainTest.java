import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    void passwordLengthCheck_exp8_shouldTrue_Test() {
        assertTrue(PasswordValidator.isLengthOK("Passwort"));
    }
}
