
public class ThreadPriorityDemo {
		   public static void main(String args[]){

		    AThread A = new AThread();
		    Thread tA = new Thread(A);


		    BThread B = new BThread();
		    Thread tB = new Thread(B);

		    CThread C = new CThread();
		    Thread tC = new Thread(C);
		    tC.setPriority(Thread.MAX_PRIORITY);
		    tA.setPriority(Thread.MIN_PRIORITY);
		  
		    tB.setPriority(Thread.NORM_PRIORITY);


		    System.out.println("A started");
		    tA.start();

		    System.out.println("B started");
		    tB.start();

		    System.out.println("C started");
		    tC.start();

		}       
}
