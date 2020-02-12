package lv.edite.repeatJavaClassOOP;

public class MyClassMethods {
	
	public MyClass myClass;
	
	//public MyClassMethods(MyClass myClass){
		//this.myClass = myClass;
	//}
	
	public MyClass createNewObjMyClass(){
		return new MyClass();
	}
	
	public void createNewObjMyClassVoid(){;
	MyClass obj = new MyClass();
	}
	
	public static void myMethod(){
		
		System.out.println("Hello world!");
	}
	
	public String myStringMethod(){
		
		myMethod();
		
		
		return "Hello";
		
	}
	
	public double returnDouble(){
		return 60.3;
		
	}
	
	public char returnChar(int a, int b){
		int charFromInt = a + b;
		
		char charVariable = (char)charFromInt;
		
		return charVariable;
		
		}
}


