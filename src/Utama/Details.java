package Utama;

import java.util.UUID;

public abstract class Details {
	
	protected UUID id = UUID.randomUUID();
	
	public String Name;
	
	public Details(UUID id, String name) {
		super();
		this.id = id;
		Name = name;
		
	}



	public Details() {
		// TODO Auto-generated constructor stub
	}

	public  void showDetails(){
		
	}
	public  abstract void sayHello();
	
}
