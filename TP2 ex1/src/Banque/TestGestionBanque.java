package Banque;

public class TestGestionBanque {

	public static void main(String[] args) 
	{
		Compte compte1 = new Compte(1);
		Compte compte2 = new Compte(2);
		
		Client client1 = new Client(1, "Jean");
		
		compte1.crediter(500);
		compte1.afficher();
		System.out.println("");
		compte1.debiter(100);
		compte1.afficher();
		System.out.println("");
		compte2.crediter(3000);
		compte2.afficher();
		System.out.println("");
		compte2.debiter(1000);
		compte2.afficher();
		System.out.println("");
		client1.afficher();
		client1.affecterCompte(compte1);
		client1.afficher();
		System.out.println("");
		client1.affecterCompte(compte2);
		client1.afficher();
		System.out.println("");
		System.out.println("Nombre de Compte du Client : "+client1.getNbCompte());
		System.out.println("Le Solde total est de : "+client1.total());
		
	}

}
