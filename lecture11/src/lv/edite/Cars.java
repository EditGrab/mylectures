package lv.edite;

import java.util.ArrayList;

public class Cars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		for(String car : cars){
			System.out.println(car);
		}
	}

}
