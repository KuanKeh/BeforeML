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
		final long timeInternal = 2000;
		Runnable run = new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("what can i say");
					try {
						Thread.sleep(timeInternal);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
				}
			}
		};
		Thread thread = new Thread(run);
		thread.start();
	}
}
