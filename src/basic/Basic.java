/**
 * 
 */
package basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * @author Kuan
 *
 */
public class Basic {

	public static void ppt(int i) throws MyException {
		if(i==0) {
			System.out.println("i is zero");
		}else {
			throw new MyException("i is not zero");
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String $abc = "cccc";
		String ff = "";
//		System.out.println($abc);
		List<String> ll1 = new ArrayList<String>();
		List<String> ll2 = new LinkedList<String>();
		List<String> ll3 = new Vector<String>();
		HashMap<String,String> hm = new HashMap<String,String>();
		Map m = new HashMap();
		boolean a = true;
		boolean b = false;
//		System.out.println(a&&b);
//		int i = 1;
//		try {
//			ppt(i);
//		} catch (MyException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
////			System.exit(0);
//		}finally {
//			Nyy nnn = Nyy.createN();
//			System.out.println(nnn==null);
//		}
		Parent p = new Child();
		System.out.println(p.name);
		System.out.println(p.getName());
		
//		String s = "";
//		String s = new String();
//		long start = System.currentTimeMillis();
//		for(int i = 0; i < 100000; i++){
//			s = s + i;
//		}
//		long end = System.currentTimeMillis();
//		System.out.println("time="+ (end-start));
		
		System.out.println(true||false&&false);
		int i =0;
		System.out.println(i+=1);
	}

}
