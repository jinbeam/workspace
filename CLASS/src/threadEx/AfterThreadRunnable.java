package threadEx;

public class AfterThreadRunnable implements Runnable{
	private String name;
	
	public AfterThreadRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=1;i<100;i++){
			System.out.println(name+" : "+i);
			
			/*
		 	//sleep(100) ==> API 확인
		 	 try{
		 	 	Thread.sleep(100);
		 	 	}catch(InterruptedException e){
		 	 		System.out.println(e);
		 	 	}
		 */
			
		}
	}	
	
	public static void main(String[] args){

		System.out.println("여기는 main start....");

		AfterThread bt1 = new AfterThread("1번째");
		AfterThread bt2 = new AfterThread("2번째");
        //==>start() method 는 어디에 있는가.???
		

        bt1.start();
		bt2.start();
        System.out.println("여기는 main end....");

	}//end of main

}//end of class

