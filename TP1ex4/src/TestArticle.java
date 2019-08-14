
public class TestArticle {

	public static void main(String[] args) 
	{
		Article art1 = new Article(1, "poireau", 3.00, 500);
        Article art2 = new Article(2, "carottes", 1.50, 200);

        Boolean res;
        double prix;
        Boolean identique;

        art1.afficher();
        art2.afficher();

        art2.approvisionner(100);
        System.out.println("Quantité de "+art2.getIntitule()+" après Approvisionnement : " + art2.getQuantiteEnStock());
        res = art1.vendre(150);
        System.out.println("Vente réalisé"+res + " " + "Quantité de " + art1.getIntitule() + " après Vente : " + art1.getQuantiteEnStock());


        prix = art1.getPrixHT();
        System.out.println("Prix des " + art1.getIntitule() + " HT : " + art1.getPrixHT());
        prix = art1.prixTTC();
        System.out.println("Prix des " + art1.getIntitule() + " TTC : " + prix);


        identique = art1.equals(art2);
        System.out.println(identique);
        
        if(identique == false)
        {
        	System.out.println("Les deux Produits ne sont pas identique");
        }
        else
        {
        	System.out.println("Ce sont les mêmes Produits");
        }
		
		
		
	}

}
