import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Choose from one of the following:\n" 
			+ "1 (Dog) or 2 (Cat)");
		boolean stat = true;
		while (stat) {
			try {
				int i = kb.nextInt();
			}
			catch (InputMistmatchException e) {
				
			}
		}
		Animal a;

		if (i = 1) {
			a = new Dog();
		}
		else {
			a = new Cat();
		}

		a.printAnimal();
		a.makeNoise();
	}
}
