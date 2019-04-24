package concurrent;

public class NoVisibility {

	public NoVisibility() {
		// TODO Auto-generated constructor stub
	}
	
	private static boolean ready;
	private static int number;
	private static class ReaderThread extends Thread {
		@Override
	    public void run() {
			while(!ready) {
				Thread.yield();
			}
			System.out.println(Thread.currentThread().getName() + ":" + number);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 30; i++) {
			new ReaderThread().start();
			number = 42;
			ready = true;
		}
	}

}
