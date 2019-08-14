
public class AnimalFamilier 
{
	
	private int age;
	private double taille;
	private double poids;
	private String couleur;
	
	
	@Override
	public String toString() {
		return "AnimalFamilier [age=" + age + ", taille=" + taille + ", poids=" + poids + ", couleur=" + couleur + "]";
	}

	public void initialiser(int page, double ptaille, double ppoids, String pcouleur)
	{
		this.age = page;
		this.taille = ptaille;
		this.poids = ppoids;
		this.couleur = pcouleur;
	}
	
	public void manger()
	{
		System.out.println("J'ai si faim !!! ... Donne-moi un biscuit !");
	}
	
	public void dormir()
	{
		System.out.println("Bonne nuit, à demain !");
	}
	
	public String dire(String pmot)
	{
		String phrase;
		phrase = pmot+"Ok!OK!";
		return phrase;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getTaille() {
		return taille;
	}

	public void setTaille(double taille) {
		this.taille = taille;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
	
}
