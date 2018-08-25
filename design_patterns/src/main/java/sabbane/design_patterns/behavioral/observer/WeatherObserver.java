package sabbane.design_patterns.behavioral.observer;

public class WeatherObserver implements Observer {
	private int pressure;
	private int temperature;
	private int humidaty;

	private Subject subject;

	public WeatherObserver(Subject subject) {
		this.subject = subject;

		this.subject.addObserver(this);
	}

	@Override
	public void update(int pressure, int temperature, int humidaty) {
		this.pressure = pressure;
		this.temperature = temperature;
		this.humidaty = humidaty;

		showData();
	}

	private void showData() {
		System.out.println("pressure: " + this.pressure + "  - temperature: " + this.temperature + "  - humidaty: "
				+ this.humidaty);
	}

}
