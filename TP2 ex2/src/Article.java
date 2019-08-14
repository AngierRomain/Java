
public class Article 
{
	private static int dernierNumArticle = 0;
	private int numArticle;
	private String designation;
	private double prix;
	private int quantiteStock;
	private Categorie laCategorie;
	
	public Article(String pdesign, double pprix)
	{
		this.numArticle = dernierNumArticle+1;
		dernierNumArticle += 1;
		this.designation = pdesign;
		this.prix = pprix;
		this.quantiteStock = 0;
		this.laCategorie=null;
	}
	
	public void afficher()
	{
		System.out.println("Numéro de l'Article : "+this.numArticle);
		System.out.println("Nom de l'Article : "+this.designation);
		System.out.println("Prix de l'Article : "+this.prix);
		System.out.println("Quantité en Stock : "+this.quantiteStock);
		if(this.laCategorie!=null) {
			this.laCategorie.afficher();
		}else {
			System.out.println("Catégorie non initialisée");
		}
	}
	
	public void approvisionner(int pqte)
	{
		this.quantiteStock += pqte;
	}
	
	public Boolean estDispo()
	{
		Boolean res = false;
		if(quantiteStock > 0)
		{
			res = true;
		}
		
		return res;
	}
	
	public Boolean vendre(int pnb)
	{
		Boolean res = false;
		if(this.quantiteStock > pnb)
		{
			this.quantiteStock -= pnb;
			res = true;
		}
		return res;
	}
	
	public void setLaCategorie(Categorie pcat)
	{
		this.laCategorie = pcat;
	}
	
	public Categorie getLaCategorie()
	{
		return laCategorie;
	}
	
	public int getNumArticle()
	{
		int res;
		res = this.numArticle;
		return res;
	}
	
	public static int getDernierNumArticle()
	{
		int res;
		res = dernierNumArticle;
		return res;
	}
	
	public String getDesignation()
	{
		String res;
		res = this.designation;
		return res;
	}
	
	public double getPrix()
	{
		double res;
		res = this.prix;
		return res;
	}
	
	public int getQuantiteStock()
	{
		int res;
		res = this.quantiteStock;
		return res;
	}
	
	

}
