package lv.edite.interfaces;

public class Rectangle implements Shape{  // implements
	
	private int length;
	private int width;
	
	public Rectangle(int len, int wid){
		this.length = len;
		this.width = wid;
				
					
}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width;
				
	}

	@Override
	public double getArea() {
		return length * width;
	}
	
	
	
}
