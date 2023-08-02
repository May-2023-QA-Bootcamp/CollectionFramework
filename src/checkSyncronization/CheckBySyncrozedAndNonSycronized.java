package checkSyncronization;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class CheckBySyncrozedAndNonSycronized {
	/*
	 * 1.we will crate an obj of collection 
	 * 2.create a method which will add element into the collection when it will be invoked/called
	 * */
	
	//creating an obj of ArrayList
	public static SortedSet<Integer> set=new TreeSet<>();
	 
	
	//method to add element
	public static void addElement() {
		Random random=new Random();
		set.add(random.nextInt(10000));
	}
	
	
	
	

	public static void main(String[] args) {
		
		
		//create our Thread
		
		Thread t1=new Thread(new Runnable() {
					
					@Override
					public void run() {
						//logic
						for(int i=0;i<1000;i++) {
							addElement();
							
						}
						
						
					}
				}
					
				);
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				//logic
				for(int i=0;i<1000;i++) {
					addElement();
				}
				
				
			}
		}
			
		);
		
		Thread t3=new Thread(new Runnable() {
			
			@Override
			public void run() {
				//logic
				for(int i=0;i<1000;i++) {
					addElement();
				}
				
				
			}
		}
			
		);
		
		t1.start();
		t2.start();
		t3.start();	
		
		//starting thread
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		try {
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	
		
		
		
		System.out.println(set.size());  //3000

	}

}
