package Banque;
public class Compte 
{
	
	private int numeroCompte;
	private double solde;
	
	public double getSolde() {
		return solde;
	}
	
	public int getNumeroCompte() {
		return numeroCompte;
	}

	
	public Compte(int pnum) 
	{
		this.numeroCompte = pnum;
		this.solde = 0;
	}
	
	public void crediter( double pmontant) 
	{
		this.solde += pmontant;
	}
	
	public void debiter( double pmontant) 
	{
		this.solde -= pmontant;
	}
	
	public void afficher() 
	{
		System.out.println("Numéro de Compte : "+this.numeroCompte);
		System.out.println("Solde : "+this.solde);
	}
	
}
