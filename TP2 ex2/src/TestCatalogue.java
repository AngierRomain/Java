
public class TestCatalogue {

	private final static int MAXCATEG = 10;
	
	public static void main(String[] args) 
	{
		System.out.println("Veuillez saisir l'année du catalogue: ");
		int annee = Clavier.lireInt();
		
		System.out.println("Veuillez saisir la saison du catalogue: ");
		String saison = Clavier.lireString();
		
		Catalogue lecatalogue = new Catalogue(annee, saison);
		
		//Création des catégories
		//Tableau local des catégories
		Categorie[] lesCategories = new Categorie[MAXCATEG];
		int nbCateg = 0;
		
		//Boucle de saisie des catégories
		String rep="oui";
		while(rep.equals("oui") && nbCateg != MAXCATEG) {
			System.out.println("Voulez-vous saisir une nouvelle catégorie ? (oui/non)");
			rep = Clavier.lireString();
			
			if(rep.equals("oui")) {
				System.out.println("Veuillez saisir le libellé de la catégorie: ");
				String libelle = Clavier.lireString();
				
				Categorie lacateg = new Categorie(libelle);
				lesCategories[nbCateg] = lacateg;
				nbCateg++;
			}
		}
		
		//Création des articles
		
		//Boucle de saisie des articles
		rep="oui";
		boolean resajout = true;
		while(rep.equals("oui") && nbCateg != MAXCATEG) {
			System.out.println("Voulez-vous saisir un nouvel article ? (oui/non)");
			rep = Clavier.lireString();
					
			if(rep.equals("oui")) {
				System.out.println("Veuillez saisir la désignation de l'article: ");
				String design = Clavier.lireString();
				
				System.out.println("Veuillez saisir le prix de l'article: ");
				double prix = Clavier.lireDouble();
				
				Article larticle = new Article(design, prix);
				
				//Affichage des catégories
				for(int i = 0; i<nbCateg; i++) {
					lesCategories[i].afficher();
				}
				
				System.out.println("Veuillez saisir le numéro de catégorie pour l'article: ");
				int numCateg = Clavier.lireInt();
				
				//Affectation de la catégorie choisie à l'article créé
				larticle.setLaCategorie(lesCategories[numCateg -1]);
				
				resajout = lecatalogue.ajouterArticle(larticle);
				if(resajout == false) {
					System.out.println("Ajout de l'article impossible (maximum atteint");
				}
				
			}
		}
				System.out.println("");
				System.out.println("Affichage du catalogue");
				//Affichage du catalogue
				lecatalogue.afficher();
	}
}
		
		
		
		
		
		
		
		
	/*	
		Categorie[] lesCategories = new Categorie[10];
		Article[] lesArticles = new Article[50];
		
		
		// ------------------CATALOGUE----------------------//
		System.out.println("Enregistrement d'un Catalogue : ");
		System.out.print("Année du Catalogue : ");
		int pannee = Clavier.lireInt();
		
		System.out.println("Saison du Catalogue : ");
		String psaison = Clavier.lireString();
			
		Catalogue leCatalogue = new Catalogue(pannee, psaison);
		
		// ------------------CATEGORIE----------------------//
		String rep = "oui";
		while(rep.equals("oui"))
		{
			System.out.println("Création de la Catégorie : ");
			System.out.println("Nom de la Catégorie : ");
			String plibcateg = Clavier.lireString();
			
			Categorie laCateg = new Categorie(plibcateg);
			int res = Categorie.getDernierNumCateg();
			lesCategories[res] = laCateg;
			
			System.out.println("Voulez vous saisir une autre Categorie ? (oui ou non)");
			rep = Clavier.lireString().toLowerCase();	
		}
		System.out.println("------------------------------------------------------------");
		
		// ------------------ARTICLE----------------------//
		rep = "oui";
		while(rep.equals("oui"))
		{
			System.out.println("Enregistrement d'un Article: ");
			System.out.println("Nom de l'Article :");
			String pnomarticle = Clavier.lireString();
			
			System.out.println("Prix de l'Article :");
			double pprixarticle = Clavier.lireDouble();
			
			Article unArticle = new Article(pnomarticle, pprixarticle);
			int res2 = Article.getDernierNumArticle();
			lesArticles[res2]= unArticle;
			System.out.println("------------------------------------------------------------");
			System.out.println("Définition de la Categorie de l'Article crée :");
			System.out.println("Les Catégories disponibles sont :");
			System.out.println("*****************");
			int res = Categorie.getDernierNumCateg();
			int i = 1;
			while(i <= res) 
			{
				if(lesCategories[i].equals(null))
				{
					i++;
				}
				else
				{
					int res1 = lesCategories[i].getNumCategorie();
					System.out.print(res1+"  ");
					String res3 = lesCategories[i].getLibelle();
					System.out.println(res3);
					i++;
				}
				
			}
			// ------------------ASSIGNATION ARTICLE / CATEGORIE----------------------//
			System.out.println("Quel est le numero de Catgorie de l'Article : ");
			int res4 = Clavier.lireInt();
			res2 = Article.getDernierNumArticle();
			lesArticles[res2].setLaCategorie(lesCategories[res4]);
			
			leCatalogue.ajouterArticle(lesArticles[res2]);
			
			System.out.println("Voulez vous saisir un autre Article ? (oui ou non)");
			rep = Clavier.lireString().toLowerCase();
		}
		System.out.println("------------------------------------------------------------");
		
		// ------------------ASSIGNATION ARTICLE / CATALOGUE----------------------//
		int res4 = Article.getDernierNumArticle();
		rep ="oui";
		while(rep.equals("oui"))
		{
			for(int i = 1; i<= res4; i++)
			{
				System.out.println("Liste d'Article :");
				System.out.println("*****************");
				System.out.println("Numéro de l'Article : "+ lesArticles[i].getNumArticle());
				System.out.println("Désignation de l'Article : "+ lesArticles[i].getDesignation());
				System.out.println("Catégorie de l'Article : "+ lesArticles[i].getLaCategorie().getLibelle());
				System.out.println("*****************");
			}
			System.out.println("Quel Article voulez vous ajouter au Catalogue : (le numéro)");
			int res5 = Clavier.lireInt();
			boolean retour = leCatalogue.ajouterArticle(lesArticles[res5]);
			if(retour == true)
			{
				System.out.println("L'ajout a bien été effectué");
			}
			else
			{
				System.out.println("L'ajout n'a pas été effectué");
			}
			System.out.println("------------------------------------------------------------");
			System.out.println("Voulez vous encore remplir le Catalogue ? (oui ou non)");
			rep = Clavier.lireString();
		}
		
		*/


