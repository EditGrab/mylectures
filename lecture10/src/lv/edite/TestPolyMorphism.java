package lv.edite;

import lv.edite.polymorphism.Animal;
import lv.edite.polymorphism.Cat;
import lv.edite.polymorphism.Dog;

public class TestPolyMorphism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Animal myAnimal = new Animal ();
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		myAnimal.animalSound();
		myDog.animalSound();
		myCat.animalSound();

	}

}
