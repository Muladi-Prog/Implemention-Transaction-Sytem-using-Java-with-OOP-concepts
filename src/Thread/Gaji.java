package Thread;

public class Gaji extends Thread {
	public Thread t;
	boolean running = true;
	int count = 0;
	int lol = 0;
	@Override
	public synchronized void start() {
		if(t==null){
			t = new Thread(this);
			t.start();
		}
	}
	
	@Override
	public void run() {
		while(running){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		
	
			if(count >240){
				lol-=3000;
				running =false;
					
				
			}
		}
	}
	

	
	public Gaji(int lol) {
	this.lol =lol;
	
	}

}
