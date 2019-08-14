public class CompteTitre extends Compte {
	//Attributs
	private double pourcentdroitgarde;
	
	//Accesseurs
	public double getSetDroitsGarde() {
		return this.pourcentdroitgarde;
	}

	public void setDroitsGarde(double pdroitsdarde) {
		this.pourcentdroitgarde = pdroitsdarde;
	}



	
	public CompteTitre(double pdroitg) {
		super(); //appel du constructeur de la classe mère (Compte.java)
		this.pourcentdroitgarde = pdroitg;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Pourcentage de droits de garde: " + this.pourcentdroitgarde);
	}
	
	public void payerlesdroits() {
		super.setSolde(this.getSolde() - (this.pourcentdroitgarde * this.getSolde() / 100));
	}
	
	
	public void cloturer(Compte punCompte) {
		punCompte.setSolde(punCompte.getSolde() + this.getSolde());
		this.setSolde(0);
	}
}
