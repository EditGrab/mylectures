
public class ForLoopAndIfElseBlock {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++){
			if(i == 5){
				System.out.println("Number of i is "+i);
				break;
			}
				System.out.println(i);
			}
		
		System.out.println("++++++++++++++++++");
		
		for(int i = 0; i < 10; i++){
			if(i == 5){
				System.out.println("Number of i is "+i);
				continue;
			}
				System.out.println(i);
	}
		
}
}



