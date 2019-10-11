package sabbane.design_patterns.behavioral.observer;

/**
 * 
 * 	Defines a one-to-many dependency -> if one object change state all of its dependents are notified automatically
 *  
 *  The observers rely/dependent on the subjects
 *  
 *  	Why is it good? LOOSE COUPLING !!!
 *  
 *  		-> when two objects are loosely coupled, they can interact but they have little knowledge of
 *  			each other 
 *  		-> the only thing the subject knows about an observer is that it implements a
 *  				certain interface
 * 			-> we can add observers whenever we want: just have to implement the Observer interface
 * 			-> we do not have to modify the subject to add new type of observers
 * 			-> we can independently reuse subjects or observers
 * 			-> we can change the subject or observer independently
 * 
 * 		SO loosely coupled design is very good: we can build flexible systems that can handle change
 * 			because the interdependency between objects are minimal 
 * 
 * Very important principle in design -> USE LOOSELY COUPLED DESIGNS BETWEEN OBJECTS THAT INTERACTS
 * 
 */

public class Main {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		WeatherObserver weatherObserver = new WeatherObserver(weatherStation);

		weatherStation.setPressure(40);
		weatherStation.setTemperature(22);
		weatherStation.setHumidaty(60);
	}
}
