package sabbane.design_patterns.behavioral.visitor;

public interface ShoppingCartVisitor {
	public double visit(Table table);

	public double visit(Chair chair);
}
