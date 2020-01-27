package lv.edite.figure;

public class Rectangle {
	
	private float length = 1.0f; // floatiem liek klat f
	private float width = 1.0f;
	
	
	public Rectangle(){
		this.length = 5.0f;
		this.width = 4.0f;
		
	}


	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(float width){
		this.length = 2.2f;
		this.width = width;
	}
	
	

	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}
	
	public String toString(){
		return "Length: "+this.length+" Width: "+this.width;
	}
	
	
	
}
