package lv.edite;

import java.util.ArrayList;

public class TaskTestArrayMethods {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	ArrayList<String> cars = new ArrayList<>();
		
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars.indexOf("Volvo"));  //volvo indexa numurs ir 0
		System.out.println(cars.isEmpty()); // atgrieza false
		System.out.println(cars.get(3)); // atgrieza objektu tresaja indexa
		System.out.println(cars.set(0, "Opel")); //nultajam jaunu elementu parrakstija, masivs nekluva lielaks
		// cars.clear(); // metode iztukso masivu
		
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		System.out.println(cars.size());
		for(String car : cars){
			System.out.println(car);
		}

		System.out.println();
		cars.remove("Ford");    // iznemt objektu
		cars.remove("Mazda");   // iznemt objektu
		System.out.println(cars.size());
		for(String car : cars){
			System.out.println(car);
		
		}
		
		
		
		
}
}