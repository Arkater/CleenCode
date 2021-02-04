
public class PalindromeCheck {

	public boolean estPalindrome(String value) {
		if (value == null)
			return false;
		String reverseValue = new StringBuilder(value).reverse().toString();
		if (value.equals(reverseValue))
			return true;
		return false;
	}

}
