
public class Ferie extends DateFr{
	private String libelle;
	
	public Ferie(int j, int m, int a, String plib) {
		super(j,m,a); //Appel du constructeur de la classe mère
		this.libelle = plib;
	}

}



//C#
// class Ferie:DateFr{
//    public Ferie(int j, int m, int a, String plib):base(j,m,a)
//		{
//          this.libelle=plib;
//		}