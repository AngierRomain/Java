public class TestCompteTitre {

	public static void main(String[] args) {
		
		Compte unCompte = new Compte();
		CompteTitre unCompteTitre = new CompteTitre(15);
		
		unCompte.setSolde(2000);
		unCompteTitre.setSolde(1000);
		unCompteTitre.afficher(); //on affiche le compte titre
		unCompte.afficher(); //on affiche le compte principal
		unCompteTitre.payerlesdroits(); 
		unCompteTitre.afficher();
		unCompteTitre.cloturer(unCompte); //On cloture le compte titre en virant tout l'argent sur le compte principal et en mettant à 0 le solde du compte titre
		unCompteTitre.afficher(); //on affiche le compte titre
		unCompte.afficher(); //on affiche le compte principal

	}

}
