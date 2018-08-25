package sabbane.design_patterns.behavioral.command;

public class Task {
	private int id;

	public Task(int id) {
		this.id = id;
	}

	public void processing() {
		System.out.println("Solving the task: " + id);
	}
}
