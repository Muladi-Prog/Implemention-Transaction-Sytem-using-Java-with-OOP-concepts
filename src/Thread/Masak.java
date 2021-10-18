package Thread;



import java.util.Vector;
import java.util.*;
import Utama.Chef;
import Utama.Menu;

public class Masak extends Thread implements add{
	Thread time ;
	Random rand = new Random();
	boolean running = true;
	boolean status ;
	Vector<Menu> menu ;
	int randoms = 0;
	UUID ID;
	
	public Masak(boolean status,UUID ID,Vector<Menu> menu) {
		this.status = status;
		this.ID= ID;
		this.menu = menu;
	}
	
	public Masak(Menu menu){
		this.menu =new  Vector<Menu>();
	}
	@Override
	public synchronized void start() {
		if(time == null){
			time = new Thread(this);
			time.start();
		}
	}
	
	public Vector<Menu> getMenu(){
		return menu;
	}
	
	@Override
	public void run() {
	while(true){
		//prof
		if( status == true){
			for(int i = 0; i<1;i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}
				
				
				add();
				
			}
			//Selesai
			
			
		}else if(status == false){
			for(int i = 0; i<2;i++){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				
			}	
			add();
			
		}
	

	}
}

	@Override
	public void add() {
		randoms =1+ rand.nextInt(10);
		if(randoms==1)menu.add(new Menu(ID,"Kimchi Jjigae 김치찌개",500+rand.nextInt(1000),1));
		else if(randoms==2)	menu.add(new Menu(ID,"Jjinmandu 찐만두",500+rand.nextInt(1000),2));
			else if(randoms==3)menu.add(new Menu(ID,"Daeji Bulgogi 불고기",500+rand.nextInt(1000),3));
				else if(randoms==4)		menu.add(new Menu(ID,"Gogigui 고기구이",500+rand.nextInt(1000),4));
					else if(randoms==5)		menu.add(new Menu(ID,"Haejangguk 해장국",500+rand.nextInt(1000),5));
						else if(randoms==6)		menu.add(new Menu(ID,"Sundubu Jjigae 순두부찌게",500+rand.nextInt(1000),6));
							else if(randoms==7)		menu.add(new Menu(ID,"Saengseon Jjigae 생선찌개",500+rand.nextInt(1000),7));
								else if(randoms==8)		menu.add(new Menu(ID,"Nakji Bokkeum 낙지볶음",500+rand.nextInt(1000),8));
									else if(randoms==9)		menu.add(new Menu(ID,"Seolleongtang 설렁탕",500+rand.nextInt(1000),9));
										else if(randoms==10)		menu.add(new Menu(ID,"Dolsot Bibimbap 돌솥 비빔밥",500+rand.nextInt(1000),10));
		
	}
	
	
	

}
