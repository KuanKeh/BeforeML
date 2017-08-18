/**
 * 
 */
package beforeML.cdAndDvd;

/**
 * @author Kuan
 * @time 2017年8月18日 下午4:35:00
 */
public class Item {

	private String title;
	private int playingTime;
	private boolean gotIt;
	private String comment;
	
	public Item(String theTitle, int time){
		title = theTitle;
		playingTime = time;
		gotIt = false;
		comment = "";
	}
	
	public Item(String title){
		this.title = title;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 3321

	}

	public void print() {
		System.out.print("title is " + title + ", playingTime is " + playingTime);
	}

}
