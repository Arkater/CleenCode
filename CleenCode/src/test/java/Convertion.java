import static org.junit.Assert.*;

import org.junit.Test;

public class Convertion {

	@Test
	public void test() {
		assertEquals(Double.valueOf(81.84), ConvertionArgent.convertionTest("CAN", "YEN", 1));
	}

	@Test
	public void test2() {
		assertEquals(Double.valueOf(163.68), ConvertionArgent.convertionTest("CAN", "YEN", 2));
	}

}
