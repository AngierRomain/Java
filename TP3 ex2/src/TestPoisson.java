public class TestPoisson {

	public static void main(String[] args)
	{
		AnimalFamilier unPoisson = new Poisson();
		unPoisson.initialiser(5, 0.125, 0.25, "rouge", 0.5);
		unPoisson.afficher();
		unPoisson.manger();
		unPoisson.plonger(0.10);
		unPoisson.afficher();
	}

}
