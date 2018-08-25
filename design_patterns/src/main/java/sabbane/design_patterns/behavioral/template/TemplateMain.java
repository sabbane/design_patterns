package sabbane.design_patterns.behavioral.template;

public class TemplateMain {

	public static void main(String[] args) {
		Algorithm algorithm1 = new BubbleSort();
		algorithm1.sort();

		System.out.println("------------------------------");

		Algorithm algorithm2 = new InsertionSort();
		algorithm2.sort();
	}
}
