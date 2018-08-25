package sabbane.design_patterns.behavioral.observer;

public class Main {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		WeatherObserver weatherObserver = new WeatherObserver(weatherStation);

		weatherStation.setPressure(40);
		weatherStation.setTemperature(22);
		weatherStation.setHumidaty(60);
	}
}
