package ch.dubach.xml;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "car")
public class Car {

	private String brand;
	private String typ;
	private int horsePower;
	
	public Car() {

	}

	public Car(String brand, String typ, int horsePower) {
		this.brand = brand;
		this.typ = typ;
		this.horsePower = horsePower;
	}

	public String getBrand() {
		return brand;
	}

	public String getTyp() {
		return typ;
	}

	public int getHorsePower() {
		return horsePower;
	}
}
