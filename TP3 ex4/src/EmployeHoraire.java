public class EmployeHoraire extends Employe {
	private final static int NBHEURESSEMAINE = 25;
	private double pourcentHeureSupp;
	private double nbHeures;
	private double tarifHeures;
	
	public EmployeHoraire(String pnom) {
		super(pnom);
		
	}
	
	public EmployeHoraire(String pnom, double pnbHeures, double ppourcentHeureSupp, double pTH) {
		super(pnom);
		this.setInfoSalaire(pnbHeures,ppourcentHeureSupp,pTH);
	}
	
	public void setInfoSalaire(double pnbHeures, double ppourcentHeureSupp, double pTH) {
		this.nbHeures = pnbHeures;
		this.pourcentHeureSupp = ppourcentHeureSupp;
		this.tarifHeures = pTH;
	}
	
	public double getSalaire() {
		double nbHeuresSupp;
		double salaire;
		
		if(this.nbHeures > NBHEURESSEMAINE) {
			nbHeuresSupp = this.nbHeures - NBHEURESSEMAINE;
			salaire = NBHEURESSEMAINE * tarifHeures + (nbHeuresSupp) * (tarifHeures * (1 + pourcentHeureSupp/100));
		}else {
			salaire = this.nbHeures * this.tarifHeures;
			
		}
		return salaire;
	}
	
	public void afficher() {
		super.afficher();
		System.out.println("Pourcentage a appliquer aux heures supp: " + this.pourcentHeureSupp);
		System.out.println("A fait: " + nbHeures + "heures.");
		System.out.println("Sera paye: " + this.tarifHeures + "euros de l'heure.");
	}
}
