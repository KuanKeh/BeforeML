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
		
<<<<<<< HEAD
		int x=91, y=100;
		int count = 0;
		while(y>0) {
			count++;
			if(x>100) {
				x=x-10;
				y--;
				System.out.println(count);
			}else 
				x++;
		}
		System.out.println(count);
		
//		System.out.println(less(1,2));
		String kn[] = new String[3];
		System.out.println();
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static int less(Comparable v,Comparable w) {
		return v.compareTo(w);
=======
		System.out.println(true||false&&false);
		int i =0;
		System.out.println(i+=1);
>>>>>>> branch 'master' of https://github.com/KuanKeh/BeforeML
	}

}
