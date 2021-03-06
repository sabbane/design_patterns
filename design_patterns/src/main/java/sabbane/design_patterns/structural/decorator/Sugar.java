package sabbane.design_patterns.structural.decorator;

public class Sugar extends BeverageDecorator {
	private Beverage beverage;

	public Sugar(Beverage beverage) {
		super(beverage);
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost() + 7;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + " sugar";
	}
}
