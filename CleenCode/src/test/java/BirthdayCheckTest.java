import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class BirthdayCheckTest {

	@Test
	public void test() {
		LocalDate myBirthDay = LocalDate.of(2021, 2, 2);
		assertTrue(BirthDayCheck.isMyBirthDay(myBirthDay));
	}

}
