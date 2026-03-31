package ex1_overriding;

public class AnimalMain {
	public static void main(String[] args) {
		
		Animal a = new Animal();
		Dog d = new Dog();
		Cat c = new Cat();
		
		a.sound();
		d.sound();
		c.sound();
		
	}
}
