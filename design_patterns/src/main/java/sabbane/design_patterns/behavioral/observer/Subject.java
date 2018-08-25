package sabbane.design_patterns.behavioral.observer;

public interface Subject {
	public void addObserver(Observer o);

	public void removeObserver(Observer o);

	public void notifyAllObervers();
}
