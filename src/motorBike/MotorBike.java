package motorBike;

public class MotorBike {
	// state
	private int speed;
	
	// constructor method
	public MotorBike() {
		// default value
		this(90); // Llama al otro método constructor
	}
	public MotorBike(int speed){
		this.speed = speed;
	}
	
	// behavior
	// methods
	public void setSpeed(int speed) {
		if(speed > 0)
			this.speed = speed;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}
	
	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
	
	void start() {
		System.out.println("MotorBiked Started, with an speed of: " + getSpeed());
	}
}
