
public class IfElseIf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int time = 4;
		//check time
		if(time < 8){
			System.out.println("Good morning");
		}else if(time <= 18){
			System.out.println("Good day");
		}else{
			System.out.println("Good evening");
		}
	}

}