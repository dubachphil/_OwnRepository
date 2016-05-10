package ch.dubach.example.swing.joptionpane;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
 
public class JOptionPaneMehrfachEingabe{
	public static void main(String[] bla){
 
		// Erstellung Array vom Datentyp Object, Hinzufügen der Komponenten		
		JTextField name = new JTextField();
		JTextField vorname = new JTextField();
		JTextField wohnort = new JTextField();
		
		Object[] message = {
				"Name", name, 
                "Vorname", vorname,
                "Wohnort", wohnort};
 
		JOptionPane pane = new JOptionPane( message, 
				JOptionPane.PLAIN_MESSAGE, 
				JOptionPane.OK_CANCEL_OPTION);
                pane.createDialog(null, "Eingabe").setVisible(true);
                                
                System.out.println("Eingabe: " + name.getText() + ", " + vorname.getText() + ", " + wohnort.getText());
//                System.exit(0);
                System.out.println(message[0]);
		}
}