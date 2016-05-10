package ch.dubach.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayList2D {

	public static void main(String args[]){
		
		List<List<String>> tabelle= new ArrayList<List<String>>();		 
		List<String> zeile = new ArrayList<String>();
		List<String> xxxx = new ArrayList<String>();
		zeile.add("Hallo");	
		xxxx.add("tabelle");
		tabelle.add(xxxx);
		
		System.out.println(tabelle);
		System.out.println(zeile);
		System.out.println(xxxx);
	}
		
}


