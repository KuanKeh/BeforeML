/**
 * 
 */
package beforeML.cdAndDvd;

/**
 * @author Kuan
 * @time 2017年8月21日 上午10:41:47
 */
public class DVD extends Item {
//	private String title = "ddd";
	private String director = "";
	private String di2;
//	private int cc = 1;
	public DVD(String title, String dir) {
//		super(title);
//		this.title = title;
		director = dir;
	}

	public DVD() {
		// TODO Auto-generated constructor stub
	}

//	public void print(){
////		super.print();
////		System.out.println(this.title);
//		System.out.println("print from dvd");
//	}
	
	protected void print_task() {
		System.out.println("print_task from dvd");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DVD dvd = new DVD("","");
//		System.out.println(dvd.cc);

	}

}
