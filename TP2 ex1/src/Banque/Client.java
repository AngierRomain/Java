package Banque;
import Banque.Compte;
public class Client 
{
	private final static int MAX = 10;
	private int numeroClient;
	private String nom;
	private Compte[] lesComptes;
	private int nbCompte;
	
	
	public Client(int pnum, String pnom) 
	{
		this.numeroClient = pnum;
		this.nom = pnom;
		this.lesComptes = new Compte[MAX];
		this.nbCompte = 0;
		
	}
	
	public double total() 
	{
		double res = 0;
		
		for(int i = 0; i< nbCompte; i++) 
		{
			res += lesComptes[i].getSolde();
		}
		return res;
	}
	
	public int getNumeroClient() {
		return numeroClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbCompte() {
		return nbCompte;
	}
	
	public void affecterCompte(Compte unCompte) 
	{
		if(this.nbCompte != MAX) 
		{
			lesComptes[nbCompte+1] = unCompte;
			nbCompte += 1;
		}
		else 
		{
			System.out.println("Erreur : Nombre MAX de Compte atteint");
			
		}
	}
	
	public void afficher() 
	{
		System.out.println("Numéro Client : "+this.numeroClient);
		System.out.println("Nom Client : "+this.nom);
		System.out.println("Nombre de Compte du Client : "+this.nbCompte);
		for(int i=0; i<nbCompte;i++) 
		{
			System.out.println("Comptes du Client : ");
			lesComptes[i].afficher();
		}
		

		

	}

}
