
public class Point 
{
	private double abscisse;
	private double ordonnee;
	
	
	public void initialiser(double px, double py)
	{
		this.abscisse = px;
		this.ordonnee = py;
	}
	
	public void afficherCoord()
	{
		System.out.println("Abscisse : "+this.abscisse);
		System.out.println("Ordonn�e : "+this.ordonnee);
	}
	
	public void deplacerPoint(double pdx, double pdy)
	{
		this.abscisse = pdx;
		this.ordonnee = pdy;
	}
	
	public double calculDistance(Point pPoint)
	{
		double distance;
		
		distance = Math.sqrt(Math.pow((pPoint.abscisse-this.abscisse), 2) + Math.pow((pPoint.ordonnee-this.ordonnee), 2));
		
		return distance;
	}
	
	
}
