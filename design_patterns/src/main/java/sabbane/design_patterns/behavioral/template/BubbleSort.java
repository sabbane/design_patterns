package sabbane.design_patterns.behavioral.template;

public class BubbleSort extends Algorithm {

	@Override
	public void initialize() {
		System.out.println("Initialize BubbleSort");
	}

	@Override
	public void sorting() {
		System.out.println("Sorting BubbleSort");
	}

	@Override
	public void printResult() {
		System.out.println("Printing BubbleSort");
	}
}
