
public class ArraysPimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[] arrays; // declare array with type int
		// int arrays2[]; // var pierakstit ari sadi, bet labak pirmais variants
		
		arrays = new int[2];
									// garaks un isaks pieraksts
		int[] arr = new int[10];    // 11 kastites no 0 lidz 10
		
		int[] arrTest = new int[5]; // ir 2 kastites 10 un 3
		
		arrTest[0] = 10;
		arrTest[1] = 3;
		arrTest[4] = 4;
		
		System.out.println(arrTest[0] + " " 
		+ arrTest[1] + " "
		+ arrTest[2] + " "
		+ arrTest[3]
		+ " "+arrTest[4]);
		
		System.out.println("+++++++++++++++++++++++++++");
		
		double[] doubleArray = new double[3];
		doubleArray[0] = 0.5;
		doubleArray[1] = 20;
		doubleArray[2] = 0.2;
		
		System.out.println(doubleArray[0] + " " + doubleArray[1] + " " + doubleArray[2]);
		
		
		char[] charArray = new char[2];
		
		charArray[0] = 'D';
		charArray[1] = 'f';
		System.out.println(charArray[0] + " " + charArray[1]);
		
		boolean[] booleanArray = new boolean[2];
		
		booleanArray[0] = true;
		booleanArray[1] = false;
		
		System.out.println(booleanArray[0] + " " + booleanArray[1]);
		System.out.println("+++++++++++++++++++++++++++");
				
		int checkLenght = arrTest.length;
		int checkLenght2 = booleanArray.length;
		
		System.out.println("Array length is "+ checkLenght);
		System.out.println("Array length is "+ checkLenght2);
		
		System.out.println(booleanArray[booleanArray.length-1]);
		
	}

}
