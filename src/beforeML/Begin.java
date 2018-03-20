/**
 * 
 */
package beforeML;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import org.json.JSONObject;

/**
 * @author Kuan
 *
 */
public class Begin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		System.out.println(s1.offsetByCodePoints(index, codePointOffset));
//		String s1 = "abcdefghij";
//		String s2 = "1234i";
//		System.out.println(s1.substring(8).compareTo(s2.substring(4)));
//		TestObject to = new TestObject();
//		String s = "3";
//		System.out.println(s+to);
//		int[] iii = new int[]{1,2,3};
//		int[] loc = new int[100];
//		for( int i : loc){
//			if(i!=0){
//				System.out.println(i);
//			}
//		}
//		int[] a = new int[]{1,3,5,6,7,9};
//		int k = 3;
//		System.out.println((-1+0)/2);// 0
//		System.out.println(search(a,k));
//		UnicodeEncoding ue = new UnicodeEncoding();
//		muleHorseDunkey();
//		ArrayList<Integer> a = new ArrayList<Integer>();
//		a.add(1);
//		a.add(3);
//		a.add(2);
//		Begin b = new Begin();
//		b.cycleFor(a);
//		b.cycleWhile(a);
//		b.cycleDi(a, a.size()-1, 0);
//		Begin[] c = new Begin[10];
//		System.out.println(a.contains(3));
		data();
	}
	
	/**
	 * 二分搜索
	 */
	public static int search( int[]a , int k ) {
		//{1,3,5,6,7,9}
		int ret = -1;
		int l = 0;
		int r = a.length - 1;
		int m = (l+r)/2;
		while(l!=r){
//			System.out.println("x = " + x++);
			m = (l+r)/2;
			System.out.println("r = " + r);
			if(a[m]>k){
				r = m-1;
			}else if(a[m]<k){
				l = m+1;
			}else{
				ret = m;
				break;
			}
//			System.out.println("r = " + r);
		}
//		if(a[l] == k){
//			ret = l;
//		}
		return ret;
	}
	
	/**
	 * 选择排序
	 */
	public static void order(int[] a){
		for( int i = 0; i < a.length -1; i++ ){
			max(a,i);
		}
		System.out.println(a.toString());
	}
	
	/**
	 * 选择排序
	 */
	public static String order(int[] a,int b){
		for( int i = 0; i < a.length -1; i++ ){
			max(a,i);
		}
		System.out.println(a.toString());
		return null;
	}
	
	/**
	 * 最大值
	 */
	public static void max(int[] a, int i){
		int temp = a[0];
		int idx = 0;
		for(int j = 1; j < a.length - 1 - i; j++){
			if(a[j] > temp){
				idx = j;
				temp = a[j];
			}
		}
		a[idx] = a[a.length - 1 - i]; 
		a[a.length - 1 - i] = temp;
	}
	
	/**
	 * 向文件中写入内容
	 */
	public static void writeFile(){
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("D:\\testjavawrite.txt"));//原文件内容被清空
//			bw = new BufferedWriter(new FileWriter("D:\\testjavawrit1e.txt",true));//新内容增加在原文件后
			bw.write("22f");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(bw!=null){
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * list用法
	 */
	public static void listPlaying(){

	}
	
	/**
	 * 获得当前方法的名称
	 */
	public static void getMethodName(){
		String s = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(s);
	}
	
	/**
	 * 使用jsonobject
	 */
	public static void jsonPlaying(){
		JSONObject jb = new JSONObject();
		jb.put("hu", "who");
		jb.put("kai", "mumu");
		System.out.println(jb.toString());
	}
	
	/**
	 * 获得磁盘文件 递归
	 */
	public static void distribute(){
		File dir = new File("D:\\");
		File[] file = dir.listFiles();
		System.out.println("dir.length() = " + dir.length());
		System.out.println("file.length = " + file.length);
		for(int i = 0; i < file.length; i++){
			System.out.println(file[i].getName() + "|| i = " + i);
		}
	}
	
	/**
	 * 字符串、日期互相转换
	 */
	public static void strToDate(){
		try {
			//字符串-->日期
			Date d = DateFormat.getDateInstance().parse("2016-08-19");
			System.out.println(d);
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2016-06-09");
			System.out.println(d2);
			//日期-->字符串
			String s = new SimpleDateFormat("yyyy-MM-dd").format(d);
			System.out.println(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 把util Date转化为sql Date
	 * 两者可以互相转化，方法相同
	 */
	public static void uToS(){
		java.util.Date d = new java.util.Date();
		java.sql.Date d2 = new java.sql.Date(d.getTime());
		System.out.println(d2);//2017-07-26 不需要format
	}
	
	/**
	 * 文件拷贝
	 */
	public static void copy(){
		
	}
	
	/**
	 * 骡马驴
	 */
	public static void muleHorseDunkey(){
		int a = 0;
		int b = 0;
		for(int x = 0; x <= 100; x++){
			a++;
			for(int y = 0; 100-x-y>=0;y++){
				b++;
//				if(x == 80){
//					System.out.println("x = " + x + " y = " + y + " b = " + b);
//				}
				System.out.println("a = " + a + " b = " + b);
				if((100-x-y)%3==0){
					int z = 3*x + 2*y + (100-x-y)/3;
					if(z==100){
						System.out.println("x = " + x + " y = " + y + " z = " + (100-x-y));
					}
				}
			}
		}
		System.out.println("a = " + a + " b = " + b);
	}
	
	/**
	 * cycle
	 */
	public void cycleFor(ArrayList<Integer> a){
		int sum = 0;
		for(int i = 0; i<a.size();i++){
			sum += a.get(i);
		}
		System.out.println(sum + " for end");
	}
	
	/**
	 * cycle
	 */
	public void cycleWhile(ArrayList<Integer> a){
		int i = 0;
		int max = a.size();
		int sum = 0;
		while(i < max){
			sum += a.get(i++);
		}
		System.out.println(sum + " while end");
	}
	
	/**
	 * cycle
	 */
	public void cycleDi(ArrayList<Integer> a, int index, int sum){
		if(index>=0){
			sum+=a.get(index--);
			cycleDi(a,index,sum);
		}else{
			System.out.println(sum + " Di end");
		}
	}
	
	/**
	 * 数据类型
	 */
	public static void data() {
//		char w = 13;
//		int x = 20;
//		long a = 1000;
//		float y = 6.5f;
//		double z = 70.3;
//		System.out.println((w*x*a).getType().getName());
		int i = 1,j = 2;
		float x = 4.1f,y = 6.5f;
		double u = 100.3, v = 1000.8;
//		i = x;
//		x=u+y;
//		x=23.4+j*y;
		v = (int)x;
		u = x;
//		x = u;
		System.out.println(v);
		
	}
}
