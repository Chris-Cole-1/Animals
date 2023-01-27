import java.util.Scanner;
import java.util.InputMismatchException;

public class Demo {
	public static void main (String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Choose from one of the following:\n1 (Dog) or 2 (Cat)");
		boolean stat = true;
		int i = -1;
		while (stat == true) {
			try {
				i = kb.nextInt();
				if (i == 1 || i == 2) {
					stat = false;
				}
				else {
					System.out.println("ERROR: Please try again");
					System.out.println("Choose from one of the following:\n1 (Dog) or 2 (Cat)");
				}
			}
			catch (InputMismatchException e) {
				System.out.println("ERROR: Please try again");
				System.out.println("Choose from one of the following:\n1 (Dog) or 2 (Cat)");
				kb.nextLine();
			}
		}

		Animal a;
		if (i == 1) {
			a = new Dog();
		}
		else {
			a = new Cat();
		}

		a.printAnimal();
		a.makeNoise();
	}
}
