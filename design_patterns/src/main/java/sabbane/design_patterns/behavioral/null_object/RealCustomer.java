package sabbane.design_patterns.behavioral.null_object;

public class RealCustomer extends Customer {
	private String name;

	public RealCustomer(String name) {
		this.name = name;
	}

	@Override
	public boolean isNull() {
		return false;
	}

	@Override
	public String getName() {
		return this.name;
	}
}
