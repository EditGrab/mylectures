package lv.edite;

public class TestThrow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		checkAge(67);
		
	}
	
	public static void checkAge(int age){
		
		if(age < 18){
			throw new ArithmeticException("Access denied");
		}else{
			System.out.println("Access granted");
		}

	}

}
