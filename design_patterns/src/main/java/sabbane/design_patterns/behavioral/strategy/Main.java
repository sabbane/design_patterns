package sabbane.design_patterns.behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();

		manager.setStrategy(new Add());
		System.out.println("addition      : " + manager.operation(3, 5));

		manager.setStrategy(new Multiply());
		System.out.println("multiplication: " + manager.operation(3, 5));
	}
}
