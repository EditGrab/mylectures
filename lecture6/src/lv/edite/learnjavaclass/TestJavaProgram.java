package lv.edite.learnjavaclass;

public class TestJavaProgram {

	public static void main(String[] args) {
		
		Box boxObject = new Box();
		
		//double result = boxObject.getVolume();
		
		//System.out.println("Volume from method: "+result);
		
		
		double volume;
		
		
		double width = 20.23;
		boxObject.width = width;
		boxObject.height = 3.42;
		boxObject.depth = 15.2;
		
		double result = boxObject.getVolume();
		
		System.out.println("Volume from method: "+result);
		
		//volume = boxObject.width*boxObject.height*boxObject.depth;
		
		//System.out.println("Volume "+volume);
		
		//System.out.println(boxObject.width);
		
		//Box boxObject2 = new Box();
		
		//System.out.println(boxObject2.width); // izdrukasies 0
	}

}