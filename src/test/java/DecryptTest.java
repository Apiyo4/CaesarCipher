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
    @Test
    public void newDecrypt_getsKey_1() {
        Decrypt testDecrypt = new Decrypt(1, "Bqjzp");
        assertEquals(1, testDecrypt.getKey());
    }
    @Test
    public void newDecrypt_nameContainsLetters() {
        Decrypt testDecrypt = new Decrypt(1, "Bqjzp");
        assertTrue(testDecrypt.nameContainsLetters());
    }
}