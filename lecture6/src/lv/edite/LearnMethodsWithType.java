package lv.edite;

public class LearnMethodsWithType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area = getArea(); // var atstat tikai getArea()
		
	}
	
	public static double getArea(){ // getArea parversas par objektu un so varu izmantot ka mainiga vertibu
		double num1 = 20.3;
		double num2 = 10.0;
		double result = num1 * num2;
		System.out.println("Area of rectangle is: "+result);
		return result;

}
	
}