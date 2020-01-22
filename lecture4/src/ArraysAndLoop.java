
public class ArraysAndLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	// Declare variable
		int[] marks = {76, 23, 42, 100, 99, 10, 56};
		// Make toString all elements of array
		// Print in console
		//1.variants manuali System.out.println("[ "+marks[0]+", "+marks[1]+" ]");utt 7 reizes
		// iznakums [76, 23, 42, ]
		
//		for(int i = 0; i < marks.length; i++){
//		System.out.println(marks[i]);
//	}
		System.out.print("[");
		for(int i = 0; i < marks.length-1; i++){
			System.out.print(marks[i]+", "); // ja ir vienkarsi "print" bez ln, tad print in one line
		}
			System.out.print(marks[marks.length-1]+"]");
			
			System.out.println("\n"+marks.length);
			
			System.out.println(marks.length-1);
			
			System.out.println(marks[4]);
			
		}
}
