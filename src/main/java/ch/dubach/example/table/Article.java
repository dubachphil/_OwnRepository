package ch.dubach.example.table;

public class Article {
	
	private int stock;
	private String desc;
	private String supplier;
	private String articleNumber;
	private int minStock;
	private int id;
	private static int count = 1;
	
	public Article(int stock, String desc, String supplier, String articleNumber,  int minStock) {
		this.stock = stock;
		this.supplier = supplier;
		this.articleNumber = articleNumber;
		this.desc = desc;
		this.minStock = minStock;
		this.id = count;
		count++;
	}
	
	public Article(int stock, String desc, String supplier,
			String articleNumber, int minStock, int id) {
		this(stock, desc, supplier, articleNumber, minStock);
		this.id = id;
	}
	
	public int getId() {
		return id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public String getSupplier() {
		return supplier;
	}
	
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public String getArticleNumber() {
		return articleNumber;
	}

	public void setArticleNumber(String articleNumber) {
		this.articleNumber = articleNumber;
	}


	public int getMinStock() {
		return minStock;
	}

	public void setMinStock(int minStock) {
		this.minStock = minStock;
	}
	
	public static void setCount(int count) {
		Article.count = count;
	}
	
	@Override
	public String toString() {
		return id + ": " + desc;
	}
	
	


}
