package ch.dubach.example.swing.joptionpane;

import javax.swing.JOptionPane;

public class DropDownMenu {

	public static void main(String[] args) {
		Object [] possibleValues = {"First", "Second", "Third"};
		String selectedValue = (String) JOptionPane.showInputDialog (null,
		   "Choose one", "Input", JOptionPane.INFORMATION_MESSAGE, null,
		   possibleValues, possibleValues [0]);
		
		System.out.println(selectedValue);

	}

}
