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
        assertEquals("Apiyo", testEncrypt.getName());

    }

    @Test
    public void newEncrypt_getsKey_1() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertEquals(1, testEncrypt.getKey());
    }

    @Test
    public void newEncrypt_nameContainsLetters() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertTrue(testEncrypt.nameContainsLetters());
    }

    @Test
    public void newEncrypt_keyIsValid() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertTrue(testEncrypt.keyIsValid());
    }
}