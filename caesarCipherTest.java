import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class caesarCipherTest {

	@Test
	void testEncryptText() {
		caesarCipher cipher = new caesarCipher();
		String s = "test string 85*@";
		String actual = cipher.encryptText(s);
		String expected = "WHVW VWULQJ 85*@";
		assertEquals(expected,actual);
	}

	@Test
	void testDecryptText() {
		caesarCipher cipher = new caesarCipher();
		String s = "^$8 whvw 20 VWuLqJ";
		String actual = cipher.decryptText(s);
		String expected = "^$8 TEST 20 STRING";
		assertEquals(expected,actual);
	}

}
