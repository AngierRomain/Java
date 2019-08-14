
public class Article 
{
	private final static double TVA = 19.6;
    private int reference;
    private String intitule;
    private double prixHT;
    private int quantiteEnStock;


    public void afficher()
    {
        System.out.println("reference : " + this.reference);
        System.out.println("Intitule : " + this.intitule);
        System.out.println("Prix HT : " + this.prixHT);

    }

    public void approvisionner(int pnombreUnites)
    {
        this.quantiteEnStock += pnombreUnites;
    }

    public Article(int preference, String pintitule, double pprixHT, int pquantiteEnStock)
    {
        this.reference = preference;
        this.intitule = pintitule;
        this.prixHT = pprixHT;
        this.quantiteEnStock = pquantiteEnStock;
    }

    public int getReference()
    {
        int refer;

        refer = this.reference;
        return refer;
    }

    public String getIntitule()
    {
        String intit;

        intit = this.intitule;
        return intit;
    }

    public int getQuantiteEnStock()
    {
        int quant;

        quant = this.quantiteEnStock;
        return quant;
    }

    public double getPrixHT()
    {
        double prix;

        prix = this.prixHT;
        return prix;
    }

    public boolean vendre(int pnombresUnites)
    {
        boolean res;

        if(this.quantiteEnStock > pnombresUnites)
        {
            this.quantiteEnStock -= pnombresUnites;
            res = true;
        }
        else
        {
            res = false;
        }
        return res;
    }

    public double prixTTC()
    {
        double prixttc;

        prixttc = this.prixHT + (this.prixHT * (TVA / 100));
        return prixttc;
    }
      
    public boolean equals(Article punArticle)
    {
        boolean res;

        if(this.reference==punArticle.reference)
        {
            res = true;
        }
        else
        {
            res = false;
        }
        return res;
    }
	
}
