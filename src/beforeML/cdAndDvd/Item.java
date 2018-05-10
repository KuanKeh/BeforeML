/**
 * 
 */
package beforeML.cdAndDvd;

/**
 * @author Kuan
 * @time 2017年8月18日 下午4:35:00
 */
public class Item {

	private String title = "tt";
//	private int playingTime;
//	private boolean gotIt;
	private String comment = "";
//	private int cc = 0;
	
//	public Item(String theTitle, int time){
//		title = theTitle;
//		playingTime = time;
//		gotIt = false;
//		comment = "";
//	}
	
	public Item(String title){
		this.title = title;
	}
//	public Item(){
//	}
	
	public Item() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Item i = new DVD("1","2");
//		Item i = new DVD();
//		i.print();
//		System.out.println(i.title);
//		DVD dvd = new DVD();
//		dvd.print();
//		System.out.println(dvd.title);
//		i.print();
//		int i = (int)10.2;
//		int j = (int)10.7;
//		System.out.println(i);
//		System.out.println(j);
//		int i ;
//		System.out.println(i);

	}

	public void print() {
//		System.out.println("title is " + title);
//		System.out.println("comment" + comment);
		System.out.println("print from item");
		this.print_task();
	}
	
	protected void print_task() {
		System.out.println("print_task from item");
	}

}
