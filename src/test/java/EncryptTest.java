import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void newEncrypt_instantiatesCorrectly() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertTrue(testEncrypt instanceof Encrypt);
    }

    @Test
    public void newEncrypt_getsName_Apiyo() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertEquals("Apiyo", testEncrypt.getmName());

    }

    @Test
    public void newEncrypt_getsKey_1() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertEquals(1, testEncrypt.getmKey());
    }

    @Test
    public void newEncrypt_nameContainsLetters() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertTrue(testEncrypt.nameContainsLetters());
    }
}