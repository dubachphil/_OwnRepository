package ch.dubach.txt.readwrite;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriteReadTxt {
	
	public void writeArrayToTxtFile(List<String>arrayList, File file) {
		try {
			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			for (int i = 0; i < arrayList.size(); i++) {
				bw.write(arrayList.get(i));
				bw.newLine();
			}
			bw.close();		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public List<String> readTxtFile(File file) {
		List<String> arrayList = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String row = "";
		    while( (row = br.readLine()) != null ) {
			      arrayList.add(row);
		    }
		    br.close();
		} catch (Exception e) {
			System.err.println("Noch keine Datei erstellt");
			
		}
		return arrayList; 
		
		
	}

}
