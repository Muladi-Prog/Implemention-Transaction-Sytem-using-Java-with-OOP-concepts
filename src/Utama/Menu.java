package Utama;

import java.util.UUID;

public class Menu extends Details {
	public int urutan;
	private int price;
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}
	
	
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public Menu(UUID id, String name, int price,int urutan) {
		super(id, name);
		this.price = price;
		this.urutan = urutan;
	}


	@Override
	public void showDetails() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

}
