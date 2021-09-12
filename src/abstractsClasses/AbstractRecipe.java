package abstractsClasses;

public abstract class AbstractRecipe {
	
	// prepare
	public void execute() {
		getReady();
		doTheDish();
		cleanup();
	}
	
	abstract void getReady();
	abstract void doTheDish();
	abstract void cleanup();
	
	// recipe
	// cleanup

}
