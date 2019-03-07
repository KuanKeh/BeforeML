package codewars;

public class NoVisibility {
	private static boolean ready;
	private static int number;

	private static class ReaderThead1 extends Thread {
		public void run() {
			System.out.println("Thead1 ready:" + ready);
//			while (!ready)
				number++;
//			Thread.yield();
			System.out.println(number);
			System.out.println("count : " + Thread.activeCount());
		}
	}

	private static class ReaderThead2 extends Thread {
		public void run() {
			System.out.println("Thead2 ready:" + ready);
//			while (!ready)
				number++;
//			Thread.yield();
			System.out.println(number);
			System.out.println("count : " + Thread.activeCount());
		}
	}

	public static void main(String[] args) {
		System.out.println("inital = " + number);
		for (int i = 0; i < 30; i++) {
			System.out.println("i = " + i);
			new ReaderThead1().start();
			new ReaderThead2().start();
			number = 42;
			ready = true;
			System.out.println("active thread count : " + Thread.activeCount());
		}
		System.out.println("Main Thread End.");
	}
}