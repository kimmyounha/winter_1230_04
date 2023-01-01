package info.vo;

public class ProductVO {
	private String name;
	private int price;
	private int productNum;
	private int stockNum;
	public ProductVO(String name, int price, int productNum, int stockNum) {
		super();
		this.name = name;
		this.price = price;
		this.productNum = productNum;	//제품번호
		this.stockNum = stockNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public int getStockNum() {
		return stockNum;
	}
	public void setStockNum(int stockNum) {
		this.stockNum = stockNum;
	}	
	
	
}