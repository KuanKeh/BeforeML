/**
 * 
 */
package beforeML.cdAndDvd;

/**
 * @author Kuan
 * @time 2017年8月18日 下午4:35:00
 */
public class Item {

	protected String title = "";
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
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 3321
		Item i = new DVD("1","2");
		System.out.println(i.title);

	}

	public void print() {
		System.out.println("title is " + title);
		System.out.println("comment" + comment);
	}

}
