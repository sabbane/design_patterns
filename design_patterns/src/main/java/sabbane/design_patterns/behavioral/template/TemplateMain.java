package sabbane.design_patterns.behavioral.template;

/**
 *  In Template pattern, an abstract class exposes defined way / template to execute its methods
 * 
 *  Its subclasses can override the method implementation as per need but the invocation 
 *  is to be in the same way as defined by an abstract class
 * 
 */

public class TemplateMain {

	public static void main(String[] args) {
		Algorithm algorithm1 = new BubbleSort();
		algorithm1.sort();

		System.out.println("------------------------------");

		Algorithm algorithm2 = new InsertionSort();
		algorithm2.sort();
	}
}
