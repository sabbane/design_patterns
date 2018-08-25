package sabbane.design_patterns.behavioral.command;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Algorithm {
	private BlockingQueue<Command> commandsList;

	public Algorithm() {
		this.commandsList = new ArrayBlockingQueue<>(10);
	}

	public void produce() {
		for (int i = 0; i < 10; i++) {
			try {
				this.commandsList.put(new TaskSolver(new Task(i + 1)));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void consume() {
		try {
			Thread.sleep(1000);
			for (Command command : commandsList) {
				command.execute();
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
