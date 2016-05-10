package ch.dubach.example.table;

import java.util.List;

import javax.swing.table.AbstractTableModel;



public class ArticleTableModel extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	private String[] colNames = {"Bestand","Bezeichnung","Lieferant","Artikelnummer","Minimum"};
	private List<Article> db;
	
	@Override
	public String getColumnName(int column) {
		return colNames[column];
	}
	
	public int getColumnCount() {
		return colNames.length;
	}

	public int getRowCount() {
		if (db==null) {
			return 0;
		}
		return db.size();
	}
	
	
	public Object getValueAt(int rowIndex, int columnIndex) {
		Article article = db.get(rowIndex);
		switch (columnIndex) {
		case 0:
			return article.getStock();
		case 1:
			return article.getDesc();
		case 2:
			return article.getSupplier();
		case 3:
			return article.getArticleNumber();
		case 4:
			return article.getMinStock();
		
		}
		return null;
	}

	
	public void setData(List<Article> db) {
		this.db = db;
	}
	
	public void refresh() {
		fireTableDataChanged();
		
	}

}
