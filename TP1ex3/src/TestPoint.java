
public class TestPoint {

	public static void main(String[] args) 
	{
		
		Point point1 = new Point();
		Point point2 = new Point();
		
		point1.initialiser(0, 0);
		point2.initialiser(4, 4);
		point1.afficherCoord();
		point2.afficherCoord();
		
		System.out.println("Distance entre le point 1 et le point 2 : "+point1.calculDistance(point2));

	}

}
