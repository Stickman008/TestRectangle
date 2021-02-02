package rect;

public class Rectangle {

	private int width, height;

	public Rectangle(int witdth, int height) {
		super();
		this.width = Math.max(1, height);
		this.height = Math.max(1, height);
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public int getArea() {
		return this.width * this.height;
	}
}
