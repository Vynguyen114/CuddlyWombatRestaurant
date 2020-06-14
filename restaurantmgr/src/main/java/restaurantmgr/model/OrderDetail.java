package restaurantmgr.model;

public class OrderDetail {
	private int id;
	private int orderId;
	private int itemId;
	private int quantity;
	private String itemName;
	
	public OrderDetail(int orderId, int itemId, int quantity) {
		this.orderId = orderId;
		this.itemId = itemId;
		this.quantity = quantity;
	}
	
	public OrderDetail(int id, int orderId, int itemId, int quantity) {
		this.id = id;
		this.orderId = orderId;
		this.itemId = itemId;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItem(int itemId) {
		this.itemId = itemId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return this.itemName + ", qty=" +this.quantity;
	}
}
