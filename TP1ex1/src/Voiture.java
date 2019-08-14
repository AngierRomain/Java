
public class Voiture 
{
	private String nom;
	private String marque;
	private String couleur;
	private int kilometrage;
	
	
	@Override
	public String toString() {
		return "Voiture [nom=" + nom + ", marque=" + marque + ", couleur=" + couleur + ", kilometrage=" + kilometrage
				+ "]";
	}
	
	
	
	
	public void demarrer() 
	{
		
		System.out.println("Attachez vos ceintures ! Je Démarre");
	}
	
	public void arreter()
	{
		System.out.println("STOP!");
	}
	
	
	public void initialiser(String pnom,String pmarque, String pcouleur, int pkilometrage) 
	{
		
		this.nom = pnom;
		this.marque = pmarque;
		this.couleur = pcouleur;
		this.kilometrage = pkilometrage;
		
	}
	
	public int rouler(int pduree)
	{
		int dist = 0;
		dist = pduree*60;
		this.kilometrage = this.kilometrage+dist;
		return dist;
	}
	
	public void afficher()
	{
		System.out.println("Nom : "+ this.nom);
		System.out.println("Marque : "+ this.marque);
		System.out.println("Couleur : "+ this.couleur);
		System.out.println("Kilometrage : "+ this.kilometrage);
	}
	

	public String getNom() {
		return nom;
	}
	public void setNom(String pnom) {
		this.nom = pnom;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String pmarque) {
		this.marque = pmarque;
	}
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String pcouleur) {
		this.couleur = pcouleur;
	}
	
	public int getKilometrage() {
		return kilometrage;
	}
	public void setKilometrage(int pkilometrage) {
		this.kilometrage = pkilometrage;
	}
}
