/**
 * 
 */
package beforeML.cdAndDvd;

import java.util.ArrayList;

/**
 * @author Kuan
 * @date 2017年8月18日 下午4:42:06
 */
public class Database {
	
	private ArrayList<Item> items = new ArrayList<Item>();
	
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
		Database db = new Database();
		CD cd = new CD("Owl City",7);
		DVD dvd = new DVD("大话西游","周星驰");
		Item i = new Item("3321");
//		db.add(i);
		db.add(cd);
		db.add(dvd);
//		db.add(new CD("Owl City",7));
//		db.add(new DVD("大话西游","周星驰"));
//		db.list();
		Item it = cd;
//		it.print();
		CD cdd = (CD) it;//报错  Exception in thread "main" java.lang.ClassCastException: beforeML.cdAndDvd.Item cannot be cast to beforeML.cdAndDvd.CD
		cdd.print();
		it.print();
		
//		System.out.println(cd.getNot());
		
		//The method getNot() is undefined for the type Item	Database.java	/BeforeML/src/beforeML/cdAndDvd	line 47	Java Problem
//		System.out.println(it.getNot());
		
		

		
	}

}
