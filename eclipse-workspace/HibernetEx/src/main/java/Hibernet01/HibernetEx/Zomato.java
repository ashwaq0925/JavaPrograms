package Hibernet01.HibernetEx;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class Zomato {
	@Id
	private int Orderid;
	private String Location;
	public int getOrderid() {
		return Orderid;
	}
	public void setOrderid(int orderid) {
		Orderid = orderid;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	private String item;

}
