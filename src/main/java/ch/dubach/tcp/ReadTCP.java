package ch.dubach.tcp;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ReadTCP {

	private Socket socket;
	private DataOutputStream dataOutputStream;
	private DataInputStream dataInputStream;

	public ReadTCP(String host, int port) {

		try {
			InetSocketAddress endpoint = new InetSocketAddress(host, port);
			this.socket = new Socket();
			this.socket.connect(endpoint, 5000);
			dataInputStream = new DataInputStream(socket.getInputStream());
			dataOutputStream = new DataOutputStream(socket.getOutputStream());
			System.out.println("Verbindung mit " + host + ":" + port + " erfolgreich aufgebaut");
		} catch (IOException e) {
			System.err.println("Verbindung mit " + host + ":" + port + " konnte nicht aufgebaut werden");
			System.err.println(e.getMessage());
		}
	}

	public void displayRequest(int requestCode, int rows) {
		try {
			if (isRequested(requestCode)) {
				for (int i = 0; i < rows; i++) {
					System.out.println(dataInputStream.readInt());
				}
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

	public List<Object> saveRequest(int requestCode, int rows) {
		List<Object> tmpList = new ArrayList<Object>();
		try {
			if (isRequested(requestCode)) {
				for (int i = 0; i < rows; i++) {
					int value = dataInputStream.readInt();
					tmpList.add(value);
				}
				System.out.println(tmpList.size() + " Datensätze wurden in Arrayliste gepspeichert");
			}

		} catch (Exception e) {
			System.err.println("Datensätze konnten nicht gespeichert werden");
			System.err.println(e.getMessage());
		}
		return tmpList;

	}
	
	public void closeConnections() {

		try {
			if (null != socket)
				socket.close();
			if (null != dataInputStream)
				dataInputStream.close();
			if (null != dataOutputStream)
				dataOutputStream.close();

		} catch (Exception e) {
			System.err.println("Konnte Connection nicht schliessen");
		}
	}

	private boolean isRequested(int request) {
		try {
			sendRequest(request);
			int response = dataInputStream.readInt();
			System.out.println("Korrekt bestätigt mit: " + response);
			if (response == request) {
				return true;
			} else {
				return false;
			}
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}

	private void sendRequest(int requestCode) {
		try {
			dataOutputStream.writeInt(requestCode);
			dataOutputStream.writeInt(0);
			dataOutputStream.flush();
			System.out.println("Requestcode: " + requestCode + " erfolgreich gesendet");
		} catch (IOException e) {
			System.err.println("Requestcode: " + requestCode + " konnte nicht gesendet werden");
			System.err.println(e.getMessage());
		}
	}



}
