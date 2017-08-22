/**
 * 
 */
package beforeML.cdAndDvd;

/**
 * @author Kuan
 * @time 2017年8月21日 上午10:41:47
 */
public class DVD extends Item {
	private String director = "";
	
	public DVD(String title, String dir) {
		super(title);
		director = dir;
	}

	public void print(){
		super.print();
		System.out.println(director);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
