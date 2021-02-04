
public class CompteBanquaire {

	private static double solde;

	public CompteBanquaire() {
		CompteBanquaire.solde = 0;
	}

	public CompteBanquaire(double SoldeInitiale) {
		CompteBanquaire.solde = SoldeInitiale;
	}

	public void depotArgent(double solde) {
		CompteBanquaire.solde += solde;
	}

	public static Double getSolde() {
		return solde;
	}

}
