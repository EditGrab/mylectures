public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		char operatorMath = '*';
		double num1 = 100.0;
		double num2 = 2;
		double result;
		// 6 % 3 = 0
		// 50 % 24,5 = 1.0

		if (operatorMath == '+') {
			result = num1 + num2;
			System.out.println(result);
		} else if (operatorMath == '/') {
			result = num1 / num2;
			System.out.println(num1 / num2);
		} else if (operatorMath == '*') {
			result = num1 * num2;
			System.out.println(num1 * num2);
		} else if (operatorMath == '-') {
			result = num1 - num2;
			System.out.println(num1 - num2);
		} else if (operatorMath == '%') {
			if (num1 >= num2) {
				result = num1 % num2;
				System.out.println(result);
			} else {
				System.out.println("If num1 less than num2"
						+ "then result is num1: " + num1);
			}
		} else {
			System.out.println("Wrong data");
		}
		System.out.println("----------------------------------------------");

		switch (operatorMath) {
		case '+':
			result = num1 + num2;
			System.out.println(result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(result);
			break;
		case '%':
			if(num1 >= num2){
			result = num1 % num2;
			System.out.println(result);
			} else {
			System.out.println("If num1 less than num2"
						+ "then result is num1: " + num1);
			}
			break;
		
			default:
			System.out.println("No such number or operator");

		}
	}

}
