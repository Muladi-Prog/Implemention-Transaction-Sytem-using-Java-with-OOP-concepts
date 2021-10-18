package Utama;

import java.util.Random;
import java.util.UUID;
import java.util.Vector;

public class Customer extends Details implements Runnable{
	private Thread t ;
	int randoms =0;
	 int rahasia = 1;
	 int menuss = 0;
	 int total= 0 ;
	Random rand = new Random();
	String username;
	String gender;
	int tambah = 0;
	Vector<Menu> menu = new Vector<>();
	int batas = 0;
	int age;
	private int count = 0;
	Vector<Customer> cus ;
	Vector<Customer> temp;
	int pilih =0 ;
	int i;
	boolean running;
	Vector<Vector<Menu>> view = new Vector<>();
	
	public Customer() {
	
	}
	public Customer(int rahasia) {
		this.rahasia = rahasia;
	}
	public void start() {
		if(t==null){
		t = new Thread(this);
		t.start();
		}
		
	}
	public Customer(UUID id, String name,int age ,String gender,int pilih,int rahasia) {
		super(id, name);
		
		this.age = age;
		this.gender = gender;
		this.pilih = pilih;
		this.rahasia = rahasia;
		
	}
	public Customer(Vector<Customer> cus,Vector<Customer> temp ,Vector<Vector<Menu>> view,	Vector<Menu> menu ) {
		this.cus = cus;
		this.temp = temp;
		this.view = view;
		this.menu = menu;
	}
	@Override
	public void showDetails() {
	
		
	}

	public boolean persen(){
		int angka = rand.nextInt(99);
		if(angka<10)return true;
		else return false;
	}
	
	@Override
	public void run() {
		for(int i =0;i<4;i++){
			try {
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		
			
		}

		running = persen();
		if(running == true){
			
		
		temp.addAll(cus);
		temp.get(temp.get(0).pilih).rahasia = rahasia;
//			for(int p = 0; p<temp.get(temp.get(0).pilih).rahasia;p++ ){
//				
//				for (Menu b : menu) {
//					menuss++;
//				}
//				System.out.println("meNU== "+menuss);
//					 randoms = rand.nextInt(menuss);
//				
//			
//				view.get(temp.get(0).pilih).
//			add(p,new Menu(menu.get(randoms).id,menu.get(randoms).Name
//					,menu.get(randoms).getPrice(),total));
//		System.out.println("ldadoaidjddada");
//				menuss= 0;
//		}
			temp.get(0).pilih += 1;
//			
//			
//			System.out.println("sih i = "+temp.get(0).pilih);
//			System.out.println("Hasil"+temp.get(i).rahasia);i++;
			cus.remove(rand.nextInt(4));
//			
			
			rahasia = 1;
			run();
			
		}else{
			
			rahasia++;
			run();
			
		}
//		for (Customer a : cus) {
//			System.out.println("====================");
//			System.out.println(a.Name);
//		}

	}
	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		
	}

}
