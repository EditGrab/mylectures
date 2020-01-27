package lv.edite;

import lv.edite.bookstore.Author;
import lv.edite.bookstore.Book;

public class TestBookStore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Author rowling = new Author("J.K.Rowling", "rowling@gmail.com", 'f');
		Author rainis = new Author("Rainis", "rainis@gmail.com", 'm');
		System.out.println(rowling.getEmail());
		rowling.setEmail("rowling@inbox.lv");
		System.out.println(rowling.getEmail());
		
		Author test20 = new Author("Test20");
		
		Book harrypotter = new Book("Harry Potter", rowling, 20.3, 1000);
		System.out.println(harrypotter.toString());
		
		Book testBook2 = new Book ("Test Book", test20, 40.2, 20);
		System.out.println(testBook2.toString());
		
		
		
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++");
		System.out.println("++++++++++++++++++++++++++++++");
		
		Author test1 = new Author("name", "name@name", 'f');
		Author test2 = new Author("name1", "name1@name1", '0');
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		System.out.println("+++++++++++++++++++++");
		
		
		

		
		
		
		char m = 'm';
		char f = 'f';
		char o = 'g';
		
		// if(m==o || f ==o){
			// System.out.println("It is M or F");
		// }else{
			//System.out.println("It is not M or F");
		//}
	
	switch(o){
		case 'm':
			System.out.println("It is m");
			break;
		case 'f':
			System.out.println("It is f");
			break;
		default:
			System.out.println("Not in list");
			
	}
	
	
	}

	}
	
