package ch.dubach.xml;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class WriteReadXML {

	private JAXBContext context;
	private final static File FILE = new File("file.xml");

	public WriteReadXML() {
		try {
			context = JAXBContext.newInstance(CarPort.class);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

	// marshall = write XML File from a List
	public void marshall(List<Car> carPortList) {
		BufferedWriter bw;
		try {
			bw = new BufferedWriter(new FileWriter(FILE));
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(new CarPort(carPortList), bw);
			bw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Read XML File to a List
	public List<Car> unmarshall() {
		CarPort carPort = new CarPort();
		try {
			Unmarshaller um = context.createUnmarshaller();
			carPort = (CarPort) um.unmarshal(FILE);
		} catch (Exception e) {
			marshall(carPort.getCarportList());
		}
		return carPort.getCarportList();
	}

}
