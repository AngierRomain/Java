
public class Categorie 
{
	private static int dernierNumCategorie = 0;
	private int numCategorie;
	private String libelle;

	
	public Categorie(String plibelle) 
	{
		this.numCategorie = dernierNumCategorie+1;
		this.libelle = plibelle;
		dernierNumCategorie +=1;
	}
	
	public void afficher()
	{
		System.out.println("Numéro de la Catégorie :"+this.numCategorie);
		System.out.println("Nom de la Catégorie :"+this.libelle);
	}
	
	public int getNumCategorie()
	{
		int res;
		res = this.numCategorie;
		return res;
	}
	
	public String getLibelle()
	{
		String res;
		res = this.libelle;
		return res;
	}
	
	public static int getDernierNumCateg()
	{
		int res;
		res = dernierNumCategorie;
		return res;
	}
	
	
	
	
}
	