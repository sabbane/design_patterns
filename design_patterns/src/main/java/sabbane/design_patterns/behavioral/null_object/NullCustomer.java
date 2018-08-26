package sabbane.design_patterns.behavioral.null_object;

public class NullCustomer extends Customer {

	@Override
	public boolean isNull() {
		return true;
	}

	@Override
	public String getName() {
		return "No customer found";
	}
}
