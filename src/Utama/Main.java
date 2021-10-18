package Utama;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;
import java.util.Vector;
import Thread.Gaji;
import Thread.Masak;

public class Main implements Runnable  {
	
	Thread t = new Thread(this);

	Thread t1 = new Thread(this);
	Vector<Customer> temp = new Vector<>();
	int totalMoney =10000;
	Scanner scan = new Scanner(System.in);
	Vector<Menu> menu = new Vector<>();
	Vector<Menu> cook = new Vector<>();
	Vector<Customer> cus = new Vector<>();
	Vector<Vector<Menu>> view = new Vector<>();
	Gaji gaji = new Gaji(totalMoney);
	Chef koki = new Chef();
	Menu bahan = new Menu();
	Random rand = new Random();
	Customer pembeli = new Customer();
	UUID ID=UUID.randomUUID();	
	private String addUsername(Vector<Chef> chef){
		String username="";
		boolean cek = true;
		do{
			cek = true;
			System.out.println("Chef's Username[must be unique]>>");
			username = scan.nextLine();
			for (Chef a : chef) {
				if(a.username.contains(username)){
					System.out.println("Hve been used!");
					cek = false;}
			}
		}while(cek!=true);
		return username;
	}
	
	private void cls(){
		for(int i = 0; i<32;i++){
			System.out.println();
		}
	}
	
	private String  addName(){
		String nama = "";
		String []temp ;
		int count  = 0;
		do{
			count = 0;
			System.out.println("Chef's Name[must contain 3 words]>>");
			nama = scan.nextLine();
			temp = nama.split(" ");
			for (String a : temp) {
				count++;
			}
			if(count == 3)break;
		}while(true);
		return nama;
		
	}
	private boolean showStatus(){
		int random = rand.nextInt(1);
		if(random==1)return true;
		else return false;
		
	}
	private String addGender(){
		String gender = "";
		do{
			System.out.println("Chef's Gender [Female|Male](Case sensitive)>>");
			gender = scan.nextLine();
			if(gender.equals("Female") || gender.equals("Male"))break;
		}while(true);
		return gender;
	}
	private int addAge(){
		int age = 0;
		do{
			System.out.println("Chef's age[17-40]>>");
			age = scan.nextInt();scan.nextLine();
			
		}while(age<17 || age >40);
		return age;
	}
	
	private void cook(Vector<Chef> chef,Vector<Menu>cook,UUID ID){
		int randoms = 0;
		for (Chef a : chef) {
			Masak masak = new Masak(a.Status,ID,cook);
			masak.start();
			masak.getMenu();
			
		}
		
	}

	
	int tambah  = 0;
	int count  = 0;
	
	int a = 0;
	int b = 0;
	@Override
	public void run() {
			Customer cuss = new Customer(cus,temp,view,menu);
			Customer cuss1 = new Customer(cus,temp,view,menu);
			Customer cuss2 = new Customer(cus,temp,view,menu);
			Customer cuss3 = new Customer(cus,temp,view,menu);
			Customer cuss4 = new Customer(cus,temp,view,menu);
		while(true){
		for (Customer a : cus) {
			tambah++;
		}
			
			
			while(cus.size()<5)	{
				
				a = rand.nextInt(30-20+1)+20;
				b = rand.nextInt(tambah+1);	
				int c= rand.nextInt(1);
				if(c == 0)
			cus.add(new Customer(ID,"Customer "+count,a,"Male",b,c));
				else if (c==1){
					cus.add(new Customer(ID,"Customer "+count,a,"Female",b,c));
				}

		
			
			count++;	cuss.start();
		}
		
//		
//			cuss1.start();
//			cuss2.start();
//			cuss3.start();
//			cuss4.start();
			
			
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
}

	
	public Main() {
		view.add(new Vector<Menu>());
		int i = 0;
		int input = 0;
		String name;
		String username;
		boolean status;
		String gender;
		int age;
		int randoms = 0;
		int menuss = 0;
		Vector<Chef> chef = new Vector<>();
		int total  = 0;
		
	
		//Data dummy Chef
		chef.add(new Chef(ID,"Park sae royi","Sae royi","Male",21,true));
	
		
		//Data Dummy menu
		menu.add(new Menu(ID,"Kimchi Jjigae 김치찌개",rand.nextInt(1000-500+1)+500,1));
		menu.add(new Menu(ID,"Jjinmandu 찐만두",rand.nextInt(1000-500+1)+500,2));
		menu.add(new Menu(ID,"Daeji Bulgogi 불고기",rand.nextInt(1000-500+1)+500,3));
		menu.add(new Menu(ID,"Gogigui 고기구이",rand.nextInt(1000-500+1)+500,4));
		menu.add(new Menu(ID,"Haejangguk 해장국",rand.nextInt(1000-500+1)+500,5));
		menu.add(new Menu(ID,"Sundubu Jjigae 순두부찌게",rand.nextInt(1000-500+1)+500,6));
		menu.add(new Menu(ID,"Saengseon Jjigae 생선찌개",rand.nextInt(1000-500+1)+500,7));
		menu.add(new Menu(ID,"Nakji Bokkeum 낙지볶음",rand.nextInt(1000-500+1)+500,8));
		menu.add(new Menu(ID,"Seolleongtang 설렁탕",rand.nextInt(1000-500+1)+500,9));
		menu.add(new Menu(ID,"Dolsot Bibimbap 돌솥 비빔밥",rand.nextInt(1000-500+1)+500,10));
		
		t.start();
	
		cook(chef,cook,ID);
	gaji.start();
		
		do{
		//	Masak muasak = new Masak(bahan);
			
		if(!gaji.t.isAlive())totalMoney-=3000;
			
			System.out.println("Danbam 김치찌개");
			System.out.println("Total Money = "+totalMoney);
			System.out.println("1.Add Danbam's Chef");
			System.out.println("2.View Danbam's information");
			System.out.println("3.View Customers in danbam");
			System.out.println("4.Quit");
			System.out.println(">>");
		
			input = scan.nextInt(); scan.nextLine();
			
			switch(input){
			case 1:
				cls();
				name = addName();
				username = addUsername(chef);
				gender = addGender();
				age = addAge();
				status = showStatus();
				chef.add(new Chef(ID,username,name,gender,age,status));
				
				break;
			case 2:
				do{
					
					System.out.println("1.View all chefs");
					System.out.println("2.View Customer with history order");
					System.out.println("3.Exit");
					System.out.println(">>");
					input = scan.nextInt();scan.nextLine();
					switch(input){
					case 1:
						cls();
						koki.showDetails(chef);
						break;
					case 2:
						cls();
						if(temp.isEmpty()){
							System.out.println("Empty!");
							break;
						}
						
					
						for (int p = 0;p<temp.get(0).pilih;p++) {
							System.out.println("Name	: "+temp.get(p).Name);
							System.out.println("Gender  : "+temp.get(p).gender);
							System.out.println("Age     : "+temp.get(p).age);
							System.out.println("MENU DETAILS");
							System.out.println("===================");
							for(int j = 0;j<temp.get(p).rahasia;j++){
								for (Menu b : menu) {
									menuss++;
								}
								
									randoms = rand.nextInt(menuss);
								
									System.out.println(menu.get(randoms).id);
									System.out.println(menu.get(randoms).Name);
									System.out.println();
									total+=menu.get(randoms).getPrice();
									
									
									
									menuss = 0;
							}
							
							
							System.out.println("Total price = "+total);
							System.out.println("--------------------");
							i++;
							totalMoney +=total;
						}total= 0 ;
//						for(int p = 0;p<temp.get(0).pilih;p++){
//							for(int j = 0;j<temp.get(p).rahasia;j++){
//								System.out.println(view.get(p).get(j).id);
//								System.out.println(view.get(p).get(j).Name);
//								if(j==temp.get(p).rahasia-1)
//								System.out.println("Total price= "+view.get(p).get(j).getPrice());
//							}
//						}
						
						
						break;
					case 3:
						break;
					}
				}while(input!=3);
				break;
			case 3:
				for (Customer menu : cus) {
					System.out.println("-"+menu.Name);
				}
				break;
			case 4:
				break;
			}
		}while(input != 4);
	}

	public static void main(String[] args) {
		new Main();

	}

}
