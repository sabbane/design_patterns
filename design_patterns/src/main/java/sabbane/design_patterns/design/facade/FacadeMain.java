package sabbane.design_patterns.design.facade;

public class FacadeMain {

	public static void main(String[] args) {
		SortManager sortManager = new SortManager();

		sortManager.doBubbleSort();

		sortManager.doQuickSort();
	}
}
