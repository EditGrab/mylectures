package lv.edite;

public class testArrayAndLists {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] arr = new String[10];
		String [] arrWith = {"1", "1", "1", "1", "1", "1", "1", "1", "1", "1", "1"};
		for(int i = 0; i < arr.length; i++){
		arrToString(arr);
		System.out.println();
		arrToString(arrWith);
		addElementsToArray(arr);			
		}
		
		//for(int i = 0; i < arrWith.length; i++){
			//System.out.println("index number are "+i+" "+arrWith[i]);
		}
	
		public static void arrToString(String[] arr){
			for(int i = 0; i < arr.length; i++){
				System.out.println("index number are "+i+" "+arr[i]);
	
			}
		}
	
		public static void addElementsToArray(String[] arr){
			for(int i = 0; i < arr.length; i++){
				arr[i] = arr[i] + i;
			}
			arrToString(arr);
		}
}


