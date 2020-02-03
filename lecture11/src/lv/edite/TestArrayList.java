package lv.edite;

import java.util.ArrayList;

public class TestArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] arr = new String[2]; // vienkarsais masivs
		System.out.println(arr.length);
		arr[0] = "ElementName";
		System.out.println(arr[0]);
		
		
		ArrayList<String> array = new ArrayList<>(); // <> diamond brackets , array list
		System.out.println(array.size());
		array.add("Element to Array");
		array.add("Element");
		array.add("Diamond");
		array.add("Summer");
		array.add("Winter");
		System.out.println(array);
		System.out.println(array.size());
	}

}


