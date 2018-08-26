package sabbane.design_patterns.behavioral.null_object;

public class CustomerController {
	private Database database;

	public CustomerController() {
		this.database = new Database();
	}

	public Customer getCustomerByName(String name) {
		if (database.isCustomerExisting(name)) {
			return new RealCustomer(name);
		}

		return new NullCustomer();
	}
}
