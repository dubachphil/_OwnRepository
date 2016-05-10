package ch.dubach.example.table;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class TestTable extends JFrame{

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		BorderLayout borderLayout = new BorderLayout();
		frame.setLayout(borderLayout);
		frame.setSize(1000, 500);
		frame.setLocation(300, 200);;
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		TablePanel tablePanel = new TablePanel();
		frame.add(tablePanel, BorderLayout.CENTER);
		
		
		Article article1 = new Article(10, "Test1", "Supllier1", "Artikelnumber1", 10);
		Article article2 = new Article(10, "Test2", "Supllier2", "Artikelnumber2", 10);
		List<Article> db = new ArrayList<Article>();
		db.add(article1);
		db.add(article2);
		
		
		tablePanel.setData(db);
		tablePanel.refresh();
		
		
		
		
		
		frame.setVisible(true);
		
		
		
		
		
	}
	
	

}
