package sabbane.design_patterns.design.facade;

public class SortManager {
	private Algorithm quickSort;
	private Algorithm mergeSort;
	private Algorithm bubbleSort;

	public SortManager() {
		this.quickSort = new QuickSort();
		this.mergeSort = new MergeSort();
		this.bubbleSort = new BubbleSort();
	}

	public void doQuickSort() {
		this.quickSort.sort();
	}

	public void doMergeSort() {
		this.mergeSort.sort();
	}

	public void doBubbleSort() {
		this.bubbleSort.sort();
	}
}
