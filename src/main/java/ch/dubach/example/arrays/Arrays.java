package ch.dubach.example.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		
		int [] feld = new int [3]; 		//Array Erstellen mit 3 Stellen
		feld[0] = 20;					//Abfüllen
		feld[1] = 30;		
		feld[2] = 10;		
		System.out.println(feld[0]);
		System.out.println(feld[1]);
		System.out.println(feld[2]);
		java.util.Arrays.sort(feld);
		for (int i = 0; i < feld.length; i++) {
			System.out.println("Sortiert: " + feld[i]);
		}
		System.out.println(java.util.Arrays.toString(feld)); // Alles Ausgeben
		
		
		int [] feld2 = {20,30,40,50,60,70,80,90}; // Direkt abfüllen
		System.out.println("Die Länge von Feld2 ist: " + feld2.length);
		for (int i = 0; i < feld2.length; i++) {
			System.out.println(feld2 [i]);
		}
		
		int [][] feld2D = {{22,33},{45,25},{66,33}};
		System.out.println(feld2D [0] [1]);

		
		
	}
	
	
}
