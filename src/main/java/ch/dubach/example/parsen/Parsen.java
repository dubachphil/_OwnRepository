package ch.dubach.example.parsen;

public class Parsen {
	
	public static void main(String[] args) {
		
		// Von String zu Integer
		String text = "12345";
		int zahl = Integer.parseInt(text); 
		System.out.println(zahl);
		
		// Von String zu Double
		String text2 = "12345.568";
		double doubleZahl1 = Double.parseDouble(text2); 
		System.out.println(doubleZahl1);
		
		// Von Int zu String
		int zahl1 = 50;
		String textZahl1 = Integer.toString(zahl1); 
		System.out.println(textZahl1);
		
		// Von Double zu String
		double zahl2 = 50.123;
		String textDezimalzahl = Double.toString(zahl2); 
		System.out.println(textDezimalzahl);
		
		// Von Double zu Integer
		double doubleZahl2 = 5.936454654;
		int Zahl3 = new Double(doubleZahl2).intValue();
		System.out.println(Zahl3);
		
		// Von Float zu Integer
		float floatZahl1 = 5.93f;
		int zahl4 = new Float(floatZahl1).intValue();
		System.out.println(zahl4);	
		
		// Von Int zu Double
		int zahl5 = 50;
		double DoubleZahl3 = new Integer(zahl5).doubleValue();
		System.out.println(DoubleZahl3);
		
		// Von Int zu Float
		int zahl6 = 12;
		float floatZahl2 = new Integer(zahl6).floatValue();
		System.out.println(floatZahl2);
	}

}
