package ch.dubach.xml;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "carport")

public class CarPort {
	@XmlElement(name = "car", type = Car.class)
	private List<Car>carportList = new ArrayList<Car>();
	
	public CarPort() {
	}

	public CarPort(List<Car> carport) {
		this.carportList = carport;
	}
	
	public List<Car> getCarportList() {
		return carportList;
	}
	
	
	

}
