package lv.edite;

import java.util.Scanner;

public class TestScannerInputArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String[] strArr = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(strArr.length+" users in array: ");
		for(int i=0; i < strArr.length; i++){
			strArr[i] = sc.nextLine();
		int arrElementCount = sc.nextInt();
			
			
			System.out.println("Do you want print array");
			System.out.println("Type (Print)");
			System.out.println("Type (notPrint)");
			String statusCheck = sc.nextLine().toLowerCase().trim();
			
			if(statusCheck.equals("print")){
				printArray(strArr);
			}else if(statusCheck.equals("not print")){
				System.out.println("Exit");
			}else{
				System.out.println("You enter it wrong");
		}
	}
		public static void printArray (String[] str){
				for(int i = 0; i<str.length; i++);
				int i;
		System.out.println(str[i]+ " this user is added to array");
		
		 }
	}

	private static void printArray(String[] strArr) {
		
		
	}
}
