package sabbane.design_patterns.structural.facade;

public class FacadeMain {

	public static void main(String[] args) {
		SortManager sortManager = new SortManager();

		sortManager.doBubbleSort();

		sortManager.doQuickSort();
	}
}
