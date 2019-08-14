
public class Catalogue 
{
	//CONSTANTE
	private final static int MAX = 200;
	
	//ATTRIBUTS
	private int numCatalogue;
	private static int dernierNumCatalogue = 0;
	private int annee;
	private String saison;
	
	private Article[] lesArticles;
	private int nbArticles = 0;
	
	
	public Catalogue(int pan, String psaison)
	{
		this.numCatalogue = dernierNumCatalogue+1;
		dernierNumCatalogue += 1;
		this.annee = pan;
		this.saison = psaison;
		this.lesArticles = new Article[MAX];
		this.nbArticles = 0;
	}
	
	public void afficher()
	{
		System.out.println("Numéro du Catalogue : "+this.numCatalogue);
		System.out.println("Année du Catalogue : "+this.annee);
		System.out.println("Saison : "+this.saison);
		System.out.println("Nombre d'articles du catalogue: "+this.nbArticles);
		
		for(int i=0; i<this.nbArticles;i++) {
			this.lesArticles[i].afficher();
		}
		
	}
	
	public boolean ajouterArticle(Article particle)
	{
		
		boolean res = false;
		
		if(nbArticles < MAX) {
			this.lesArticles[nbArticles] = particle;
			nbArticles += 1;
			res = true;
		}
		
		return res;
		
	}
	
	public Article[] listeDispo()
	{
		Article[] res = new Article[MAX];
		int j = 0;
		//On parcoure le tableau lesArticles
		for(int i = 0; i<= this.nbArticles; i++)
		{
			if(this.lesArticles[i].estDispo() == true)
			{
				
				res[j] = lesArticles[i];
				j++;
			}
		}
		
		return res;
	}
	
	public Article[] listeNonDispo()
	{
		int j = 0;
		Article[] listeArticleNonDispo = new Article[MAX];
		for(int i = 0; i<= nbArticles; i++)
		{
			
			if(lesArticles[i].estDispo() == false)
			{
				
				listeArticleNonDispo[j] = lesArticles[i];
				j++;
			}
		}
		
		return listeArticleNonDispo;
	}
	
	public Article[] listeCateg(String plib)
	{
		int j = 0;
		Article[] listeArticleCateg = new Article[MAX];
		
		for(int i = 0; i< nbArticles; i++)
		{
			
			if(lesArticles[i].getLaCategorie().getLibelle().equals(plib))
			{
				listeArticleCateg[j] = this.lesArticles[i];
				j++;
			}
		}

		return listeArticleCateg;
	}

	
	public int getNumCatalogue()
	{
		int res;
		res = this.numCatalogue;
		return res;
	}
	
	public int getAnnee()
	{
		int res;
		res = this.annee;
		return res;
	}
	
	public String getSaison()
	{
		String res;
		res = this.saison;
		return res;
	}
	
	
}
