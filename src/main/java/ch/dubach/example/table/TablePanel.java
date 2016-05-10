package ch.dubach.example.table;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

@SuppressWarnings("serial")
public class TablePanel extends JPanel {

	private ArticleTableModel articleTableModel;
	private JTable storageTable;

	public TablePanel() {
		setLayout(new BorderLayout());

		articleTableModel = new ArticleTableModel();
		storageTable = new JTable(articleTableModel);
//		storageTable.setAutoCreateRowSorter(true);

//		TableColumnModel colModel = storageTable.getColumnModel();
//		// Bestand
//		colModel.getColumn(0).setPreferredWidth(80);
//		colModel.getColumn(0).setMaxWidth(80);
//		// Bezeichnung
//		colModel.getColumn(1).setPreferredWidth(280);
//		// Lieferant
//		colModel.getColumn(2).setPreferredWidth(180);
//		colModel.getColumn(2).setMaxWidth(180);
//		// Artikelnummer
//		colModel.getColumn(3).setPreferredWidth(120);
//		colModel.getColumn(3).setMaxWidth(120);
//		// Minimum Bestand
//		colModel.getColumn(4).setPreferredWidth(100);
//		colModel.getColumn(4).setMaxWidth(100);
//		storageTable.setColumnModel(colModel);
//
//		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
//		centerRenderer.setHorizontalAlignment(SwingUtilities.CENTER);
//		// Bestand
//		storageTable.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
//		// Minimum Bestand
//		storageTable.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

		add(new JScrollPane(storageTable), BorderLayout.CENTER);

	}

	public void setData(List<Article> db) {
		articleTableModel.setData(db);

	}

	public void refresh() {
		articleTableModel.refresh();
	}

	public JTable getStorageTable() {
		return storageTable;
	}

	public int getSelectedRow() {
		int row = storageTable.getSelectedRow();
		return row;
	}

	public List<Object> getVauluesOnRow(int row) {
		List<Object> values = new ArrayList<Object>();
		for (int i = 0; i < 5; i++) {
			values.add(storageTable.getValueAt(row, i));

		}
		return values;
	}

}
