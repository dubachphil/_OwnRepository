package ch.dubach.example.swing.layout;

import javax.swing.* ; 

import java.awt.*; 
class Layout extends JFrame { 
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Container contentPane = getContentPane(); 
	JPanel panel = new JPanel(); 
	JPanel grid = new JPanel(new GridLayout(3,2)); 
	JTextArea textAusgabe = new JTextArea();
	
	public Layout() { 
		super( "Layout Manager" ); 
	setSize( 600,800 ); 
	setDefaultCloseOperation( EXIT_ON_CLOSE );	
	panel.add(new JButton("PanelButton1") ); 
	panel.add(new JButton("PanelButton2") ); 
	panel.add(new JButton("PanelButton3") ); 
	
	textAusgabe.add(new JTextArea());
	
	
    textAusgabe.setLineWrap(true);
    textAusgabe.setWrapStyleWord(true);
    JScrollPane scrollpane = new JScrollPane(textAusgabe);
    contentPane.add(scrollpane);
    
    
	contentPane.add("Center", scrollpane);
	contentPane.add("North", panel ); 
	contentPane.add("West",new JButton("Aktien Zeigen")); 
	contentPane.add("East",new JButton("Beenden")); 
	setVisible( true );
	
	textAusgabe.setText("graeeeeee aerg reag era gaerg reg reg erg regserg aergraeeeeee aerg reag"
			+ " era gaer regserg aergraeeeeee aerg reag era  regserg aergraeeeeee aerg reag era  regserg a"
			+ "ergraeeeeee aerg reag era  regserg aergraeeeeee aerg reag era  regserg aergraeeeeee aerg reag e"
			+ "ra  regserg aergraeeeeee aerg reag era  regserg aergraeeeeee aerg reag era  regserg aergraeeeeee "
			+ "aerg reag era  regserg aergraeeeeee aerg reag era  regserg aergraeeeeee aerg reag era  regserg aer"
			+ "graeeeeee aerg reag era  regserg aergraeeeeee aerg reag era  regserg aergraeeeeee aerg reag era  re"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser"
			+ "gserg aergraeeeeee aerg reag era g reg reg erg regser");
	} 
	
	
	
	public static void main( String[] args ) { 
		new Layout() ;
	}	
} 