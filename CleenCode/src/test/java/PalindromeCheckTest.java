import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeCheckTest {

	private PalindromeCheck palindromeCheck = new PalindromeCheck();

	@Test
	public void shouldTellANullStringIsNotPalindrome() {
		assertFalse(palindromeCheck.estPalindrome(null));
	}

	@Test
	public void shouldTellAnEmptyStringIsPalindrome() {
		assertTrue(palindromeCheck.estPalindrome(""));
	}

	@Test
	public void shouldTellABlankStringIsPalindrome() {
		assertTrue(palindromeCheck.estPalindrome("     "));
	}

	@Test
	public void shouldTellAPalindromeStringIsPalindrome() {
		assertTrue(palindromeCheck.estPalindrome("KAYAK"));
	}

	@Test
	public void shouldTellANonPalindromeStringIsNotPalindrome() {
		assertFalse(palindromeCheck.estPalindrome("ABC"));
	}

}
