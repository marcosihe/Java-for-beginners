package rectangle;

public class Rectangle {
	// state
	private int length, width;
	
	
	// creation - constructor method
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	// getters and setters - operations
	
	/**
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	
	// other operations
	public int getArea() {
		return length * width;
	}
	
	public int getPerimeter() {
		return 2*(length+width);
	}
	
	public String toString() {
		return String.format("length - %d, width - %d, area - %d, perimeter - %d", 
				length, width, getArea(), getPerimeter());
	}
	
}
