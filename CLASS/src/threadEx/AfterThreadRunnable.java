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
		 	//sleep(100) ==> API Ȯ��
		 	 try{
		 	 	Thread.sleep(100);
		 	 	}catch(InterruptedException e){
		 	 		System.out.println(e);
		 	 	}
		 */
			
		}
	}	
	
	public static void main(String[] args){

		System.out.println("����� main start....");

		AfterThread bt1 = new AfterThread("1��°");
		AfterThread bt2 = new AfterThread("2��°");
        //==>start() method �� ��� �ִ°�.???
		

        bt1.start();
		bt2.start();
        System.out.println("����� main end....");

	}//end of main

}//end of class

