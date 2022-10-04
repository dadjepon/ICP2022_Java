/**
 * 
 */
package ashesi.edu.gh.Threads;

	/**
	 *ThreadX class
	 */
	class ThreadX implements Runnable{
	  public void run(){
	    for(int i=0; i<=7; i++){
	    	System.out.println("		"+Thread.currentThread().getName()+"-["+i+"]: start");
	    }
	    System.out.println(Thread.currentThread().getName()+" has terminated!");
	  }
	}

	/**
	 *ThreadY class
	 */
	class ThreadY implements Runnable{
	  public void run(){
	    for(int i=0; i<=7; i++){
	    	System.out.println(Thread.currentThread().getName()+"-["+i+"]: end");
	    }
	    System.out.println(Thread.currentThread().getName()+" has terminated --> ["+Thread.currentThread().toString()+"]");
	  }
	}
	  
	/**
	 * @author dadjepon
	 * Main class: MyThread
	 */
	public class MyAdvancedThread {
	  public static void main(String [] args){
		//See the long version of the thread instantiation
	    ThreadX tx = new ThreadX(); //Instantiating ThreadX
	    ThreadY ty = new ThreadY(); //Instantiating ThreadY

	    //Passing the ThreadX object,tx, as a parameter of the Thread Constructor
	    Thread t1 = new Thread(tx); 
	    //Passing the ThreadY object,ty, as a parameter of the Thread Constructor
	    Thread t2 = new Thread(ty);
	    
	    //You can set the name of a Thread
	    //'ashesi' means 'beginning' in Fanti(Akan)
	    //'awiey3' means 'end' in Fanti(Akan)
	    //'ahoma' means 'thread' in Fante
	    t1.setName("ashesi_ahoma");
	    t2.setName("awiey3_ahoma");
	    
	    //As explained earlier, a thread must call the start() to run it
	    t1.start();
	    t2.start();
	    
	    	//Explore sychronization contructs like:
	  		//-Mutexes
	  		//-Semaphores
	  		//-Methods: yield(), sleep(), join(),etc.
	  		//-Keywords: synchronize, lock, etc.
	  }

}
