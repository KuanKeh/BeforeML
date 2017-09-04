/**
 * 
 */
package beforeML;

/**
 * @author Kuan
 *
 */
public class JustUseTimer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final long timeInternal = 2000;
		Runnable run = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(true) {
					System.out.println("what can i say");
					try {
						Thread.sleep(timeInternal);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		};
		Thread thread = new Thread(run);
		thread.start();
	}
}
