public class Compte 
{


	private static int dernierNumCompte = 0;
	private int numeroCompte;
	private double solde;
	
	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public int getNumeroCompte() {
		return numeroCompte;
	}

	
	public Compte() 
	{
		this.numeroCompte = dernierNumCompte+1;
		dernierNumCompte++;
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

