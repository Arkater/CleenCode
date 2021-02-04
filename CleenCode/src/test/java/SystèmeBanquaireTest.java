import static org.junit.Assert.*;

import org.junit.Test;

public class SystèmeBanquaireTest {

	@Test
	public void test() {
		CompteBanquaire compte = new CompteBanquaire();
		compte.depotArgent(10);
		assertEquals(Double.valueOf(10), CompteBanquaire.getSolde());

	}

	@Test
	public void test2() {
		CompteBanquaire compte = new CompteBanquaire(12);
		compte.depotArgent(10);
		compte.depotArgent(3);
		compte.depotArgent(5);
		assertEquals(Double.valueOf(30), CompteBanquaire.getSolde());

	}

}
