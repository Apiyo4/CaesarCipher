import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void newDecrypt_instantiatesCorrectly() {
        Decrypt testDecrypt = new Decrypt(1, "Bqjzp");
        assertTrue(testDecrypt instanceof Decrypt);
    }
    @Test
    public void newDecrypt_getsName_Bqzjp() {
        Decrypt testDecrypt = new Decrypt(1, "Bqjzp");
        assertEquals("Bqjzp", testDecrypt.getName());

    }
}