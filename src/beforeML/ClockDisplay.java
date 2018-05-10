/**
 * 
 */
package beforeML;

/**
 * @author Kuan
 *
 */
public class ClockDisplay {
	private int uplimit;
	private int value;
	
	public ClockDisplay(int uplimit){
		this.uplimit = uplimit;
	}
	
	public void tick(){
		value ++;
		if( value == uplimit) {
			value = 0;
		}
	}
	
	public int getValue(){
		return value;
	}
	
	public String toString(){
		if(value < 10)
			return "0"+value;
		else
			return ""+value;
	}
	
	public static void f(){
//		int i = this.value;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		ClockDisplay cd = new ClockDisplay(24);
//		while(true){
//			cd.tick();
//			System.out.println(cd.getValue());
//		}
		Cba c = new Cba();
	}

}
