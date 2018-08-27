package sabbane.design_patterns.design.decorator;

public class DecoratorMain {

	public static void main(String[] args) {
		Beverage beverage = new Sugar(new Milk(new PlainBeverage()));

		System.out.println("Description: " + beverage.getDescription());
		System.out.println("Price      : " + beverage.getCost());
	}

}
