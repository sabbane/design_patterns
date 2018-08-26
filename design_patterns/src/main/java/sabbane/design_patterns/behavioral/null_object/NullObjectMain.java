package sabbane.design_patterns.behavioral.null_object;

public class NullObjectMain {

	public static void main(String[] args) {
		CustomerController customerController = new CustomerController();
		System.out.println("Custoemr Name: " + customerController.getCustomerByName("Nadine").getName());
		System.out.println("Custoemr Name: " + customerController.getCustomerByName("Faycal").getName());
	}
}
