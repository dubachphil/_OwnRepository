package ch.dubach.xml;
import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		WriteReadXML wrxml = new WriteReadXML(); // WriteReadXML instanzieren
		List<Car> cars = new ArrayList<Car>(); // Liste für Daten erstellen
		
		cars = wrxml.unmarshall(); // XML lesen und in Liste schreiben

		// Erstelle neue Autos
//		Car car1 = new Car("Ford", "Mondeo", 120);
//		Car car2 = new Car("Volkswagen", "Golf", 180);
//		Car car3 = new Car("Land Rover", "Range Rover Sport", 555);

		// Autos der Liste hinzufügen
//		cars.add(car1);
//		cars.add(car2);
//		cars.add(car3);
		
		// Ausgabe in Konsole
		for (Car car : cars) {
			System.out.println(car.getBrand() + " " + car.getTyp() + " " + car.getHorsePower() + "PS");
		}

		//wrxml.marshall(cars); // Liste mit Autos in XML schreiben

	}

}
