package sabbane.design_patterns.behavioral.strategy;

public class Add implements Strategy {

	public int operation(int a, int b) {
		return a + b;
	}
}
