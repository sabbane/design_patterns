package sabbane.design_patterns.design.decorator;

public class PlainBeverage implements Beverage {
	@Override
	public int getCost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return "Plain beverage ";
	}
}
