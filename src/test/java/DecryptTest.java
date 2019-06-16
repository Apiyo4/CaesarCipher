import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void newDecrypt_instantiatesCorrectly() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertTrue(testEncrypt instanceof Encrypt);
    }
    @Test
    public void newDecrypt_getsName_Apiyo() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertEquals("Apiyo", testEncrypt.getName());

    }
}