/**
 * 
 */
package beforeML.cdAndDvd;

import java.util.ArrayList;

/**
 * @author Kuan
 * @time 2017年8月18日 下午4:42:06
 */
public class Database {
	
	private ArrayList<Item> items;
	
	public void add(Item theItem){
		items.add(theItem);
	}
	
	public void list(){
		for(Item item : items){
			item.print();
			System.out.println();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}

}
