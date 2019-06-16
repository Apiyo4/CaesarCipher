import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void newEncrypt_instantiatesCorrectly() {
        Encrypt testEncrypt = new Encrypt(1, "Apiyo");
        assertTrue(testEncrypt instanceof Encrypt);
    }
}