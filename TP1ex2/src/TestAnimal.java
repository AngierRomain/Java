
public class TestAnimal {

	public static void main(String[] args) 
	{
		
		AnimalFamilier unAnimal = new AnimalFamilier();
		
		unAnimal.initialiser(2, 20, 3, "blanc");
		System.out.println(unAnimal.toString());
		
		unAnimal.manger();
		unAnimal.dormir();
		String parler = unAnimal.dire("Va Dehors !! ");
		System.out.println(parler);

	}

}
