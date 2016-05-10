package ch.dubach.example.arrays;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListen {

	public static void main(String[] args) throws IOException {

	    List<String> farben = new ArrayList<String>();
	    farben.add("rot");
	    farben.add("blau");
	    farben.add("gelb");
	    farben.add("orange");
	    for (String current: farben) {
	        System.out.println(current);
	    }	

	    
	    
	}


}
