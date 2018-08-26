package sabbane.design_patterns.behavioral.null_object;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private List<String> customers;

	public Database() {
		this.customers = new ArrayList<>();
		this.customers.add("Ali");
		this.customers.add("Christian");
		this.customers.add("Nadine");
		this.customers.add("Jamila");
	}

	public boolean isCustomerExisting(String name) {
		for (String customer : customers) {
			if (customer.equals(name)) {
				return true;
			}
		}
		return false;
	}
}
