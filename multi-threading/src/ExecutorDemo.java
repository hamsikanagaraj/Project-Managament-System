import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable{
	private final long countUntil;
	
	GoRunnable(long countUntil){
		this.countUntil=countUntil;
	}
	
	public void run() {
		long sum=0;
		for(long i=1;i<countUntil;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
public class ExecutorDemo {
	private static final int NTHREDS=10;
	
	public static void main(String[] args) {
		ExecutorService executor=Executors.newFixedThreadPool(NTHREDS);
		
		long start=System.currentTimeMillis();
		for(int i=0;i<500;i++) {
			Runnable worker=new GoRunnable(100000L+i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		
		while(!executor.isTerminated()) {}
		long end=System.currentTimeMillis();
		System.out.println("Finished all Threads in : "+(end-start)+ "sec");
		
	}

}
