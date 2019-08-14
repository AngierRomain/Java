public class Commercial extends Employe {
	private final static int POURCENTAGE = 1;
	private double chiffreAffaire;
	private double fixe;
	
	public Commercial(String pnom) {
		super(pnom);
	}
	public Commercial(String pnom, double pCA, double pfixe) {
		super(pnom);
		this.setInfoSalaire(pCA, pfixe);
	}
	
	public void setInfoSalaire(double pCA, double pfixe) {
		this.chiffreAffaire = pCA;
		this.fixe = pfixe;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Chiffre d'affaire: " + this.chiffreAffaire);
		System.out.println("Montant fixe: " + this.fixe);
	}
	
	public double getSalaire() {
		double res;
		res = this.fixe + (POURCENTAGE / 100) * this.chiffreAffaire;
		return res;
	}

}
