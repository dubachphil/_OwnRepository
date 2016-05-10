package ch.dubach.example.swing.joptionpane;

import javax.swing.JOptionPane; //Import - macht es im Normalfall automatisch

public class JOptionPane_Examples {

	public static void main(String[] args) {
		
		// Eingabe String mit JOtionPane und Ausgabe mit JOtionPane
		String text = JOptionPane.showInputDialog(null, "Ich bin ein String Eingabefeld");
		JOptionPane.showMessageDialog(null, "Deine Eingabe war " + text); 
				
		// Integer.parseInt(String)....wandelt die Stringzahl direkt in eine Ganzzahl um
		int ganzZahl = Integer.parseInt(JOptionPane.showInputDialog(null, "Bitte gib eine Ganzzahl ein")); 
		JOptionPane.showMessageDialog(null, "Deine Eingabe war " + ganzZahl);
		
		
		// Double.parseDouble(String)....wandelt die Stringzahl direkt in eine Dezimalzahl um
		double doubleZahl = Double.parseDouble(JOptionPane.showInputDialog(null, "Bitte gib eine Dezimalzahl ein")); 
		JOptionPane.showMessageDialog(null, "Deine Eingabe war " + doubleZahl);
		
		// Fragt nach einer Endscheidung
		// Ja gibt 0 zurück
		// Nein gibt 1 zurück
		// Abbrechen gibt 2 zurück
		int endscheidung = JOptionPane.showConfirmDialog(null, "Möchtest du Tanzen?"); 
		switch (endscheidung) {
		case 0:
			JOptionPane.showMessageDialog(null, "Deine Endscheidung war Ja");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "Deine Endscheidung war Nein");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Deine Endscheidung war Abbrechen");
			break;
		default:
			break;
		}
				
	}

}
