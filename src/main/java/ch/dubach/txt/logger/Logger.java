package ch.dubach.txt.logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

abstract public class Logger {
	
	public void writeLog(String text, File file) {
		try {
			Date date = new Date();
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(date + ": " + text);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
