package sabbane.design_patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
	private int pressure;
	private int temperature;
	private int humidaty;
	private List<Observer> observers;

	public WeatherStation() {
		this.observers = new ArrayList<>();
	}

	public void addObserver(Observer o) {
		this.observers.add(o);

	}

	public void removeObserver(Observer o) {
		this.observers.remove(o);
	}

	public void notifyAllObervers() {
		for (Observer observer : observers) {
			observer.update(pressure, temperature, humidaty);
		}
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;

		this.notifyAllObervers();
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;

		this.notifyAllObervers();
	}

	public void setHumidaty(int humidaty) {
		this.humidaty = humidaty;

		this.notifyAllObervers();
	}
}
