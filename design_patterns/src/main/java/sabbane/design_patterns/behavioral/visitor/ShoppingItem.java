package sabbane.design_patterns.behavioral.visitor;

public interface ShoppingItem {
	public double accept(ShoppingCartVisitor visitor);
}
