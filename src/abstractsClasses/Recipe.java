package abstractsClasses;

public class Recipe extends AbstractRecipe {

	@Override
	void getReady() {
		// TODO Auto-generated method stub
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
		
	}

	@Override
	void doTheDish() {
		// TODO Auto-generated method stub
		System.out.println("Do the Dish");
	}

	@Override
	void cleanup() {
		// TODO Auto-generated method stub
		System.out.println("Clean up the utensils");
		
	}

}
