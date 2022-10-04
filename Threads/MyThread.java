/**
 * Package Thread 
 */
package ashesi.edu.gh.Threads;

/**
 * TestThread1
 * @author dadjepon
 *
 */
class TestThread implements Runnable{
	//Instance variable
	//Constructor
	//Other methods
	public void run(){
		
        for (int i=0; i<=10; i++) {
        	System.out.println("Thread '"+Thread.currentThread().getName()
        			+"' has started");
       }

	}
}

/**
 * TestThread1
 * @author dadjepon
 *
 */
class TestThread1 implements Runnable{
	//Instance variable
	//Constructor
	//Other methods
	public void run(){
		
        for (int i=0; i<=4; i++) {
        	System.out.println("Thread '"+Thread.currentThread().getName()
        			+"' has started");
       }

	}
}


/**
 * Main Class: MyThread
 * @author dadjepon
 *
 */
class MyThread {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread  t1 = new Thread(new TestThread()); // This is the way to instantiate 				   //a thread implementing runnable interface	
		Thread  t2 = new Thread(new TestThread()); // This is the way to instantiate 				   //a thread implementing runnable interface	
		
		t1.start(); // starts the thread by running the run method
		t2.start(); // starts the thread by running the run method
		
		//Explore sychronization contructs like:
		//-Mutexes
		//-Semaphores
		//-Methods: yield(), sleep(), join(),etc.
		//-Keywords: synchronize, lock, etc.
	}
}
