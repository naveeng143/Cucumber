package linkdinlearning.cucumbercourse;

public class RestarantMenuItem {

	private String ItemName;
	private String Desc;
	private int price;

	public RestarantMenuItem(String menuItemName, String desc, Integer price) {
		super();
		System.out.println("Constructor called");
		ItemName = menuItemName;
		Desc = desc;
		price = price;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	

}
