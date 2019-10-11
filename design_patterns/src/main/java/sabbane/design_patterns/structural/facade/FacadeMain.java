package sabbane.design_patterns.structural.facade;

/**
 *  This pattern provides a unified interface to a
 *   set of interfaces in a system 
 *   
 *   		It defines a high level interface 
 *   		that makes the subsystem easier to use 
 * 
 */

public class FacadeMain {

	public static void main(String[] args) {
		SortManager sortManager = new SortManager();

		sortManager.doBubbleSort();

		sortManager.doQuickSort();
	}
}
