package sabbane.design_patterns.behavioral.strategy;

public class Manager implements Strategy {

	private Strategy strategy;

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	public int operation(int a, int b) {
		return this.strategy.operation(a, b);
	}
}
