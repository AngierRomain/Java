
public class Poisson extends AnimalFamilier
{
	private double profondeurcourante;
	
	
	public void initialiser(int page, double ppoids, double ptaille, String pcouleur, double pprof)
	{
		super.initialiser(page, ptaille, ppoids, pcouleur);
		this.profondeurcourante = pprof;
	}
	
	public void afficher()
	{
		super.afficher();
		System.out.println("Profondeur Courante : "+profondeurcourante+" m");
		System.out.println("---------------------------------------------------------------");
	}
	
	public void plonger(double phauteur)
	{
		this.profondeurcourante += phauteur;
		System.out.println("Le poisson a plongé de : "+phauteur+" m");
		System.out.println("Nouvelle Profondeur : "+profondeurcourante+" m sous le niveau de la mer");
		System.out.println("---------------------------------------------------------------");
	}
}
