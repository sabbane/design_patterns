package sabbane.design_patterns.design.decorator;

public class BeverageDecorator implements Beverage {
	protected Beverage beverage;
	
	
	
	public BeverageDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

	@Override
	public int getCost() {
		return this.beverage.getCost();
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription();
	}
}
