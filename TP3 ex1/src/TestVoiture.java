
public class TestVoiture {

	public static void main(String[] args) {
		
		Voiture maVoiture = new Voiture();
		
		maVoiture.initialiser("Cars", "Ferrari", "Rouge", 1000);
		maVoiture.afficher();
		System.out.println("");
		
		maVoiture.demarrer();
		int distance = maVoiture.rouler(2);
		System.out.println("Distance parcourue : "+distance);
		
		maVoiture.afficher();
		System.out.println("");
		
		int kilom = maVoiture.getKilometrage();
		System.out.println("Kilometrage : "+kilom);
		System.out.println("Kilometrage : "+maVoiture.getKilometrage());
		
		maVoiture.arreter();
		
		Voiture v1 = new Voiture();
		VoitureJamesBond v2 = new VoitureJamesBond();
		Voiture v3 = new VoitureJamesBond();
	}

}
