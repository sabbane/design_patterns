package sabbane.design_patterns.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {

	public static void main(String[] args) {
		List<ShoppingItem> items = new ArrayList<>();
		items.add(new Table("desk", 350));
		items.add(new Chair("leder1", 60));
		items.add(new Chair("leder2", 60));
		items.add(new Chair("kunststoff1", 30));
		items.add(new Chair("kunststoff2", 30));

		ShoppingCartVisitor shoppingCart = new ShoppingCart();
		double sum = 0;

		for (ShoppingItem shoppingItem : items) {
			sum += shoppingItem.accept(shoppingCart);
		}

		System.out.println("Currently items value in Cart: " + sum);
	}
}
