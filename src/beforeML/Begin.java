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
import java.util.Date;

import org.json.JSONObject;

/**
 * @author gyge
 *
 */
public class Begin {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s = new String();
//		s = "ff";
		uToS();

	}
	
	/**
	 * ���ļ���д������
	 */
	public static void writeFile(){
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter("D:\\testjavawrite.txt"));//ԭ�ļ����ݱ����
//			bw = new BufferedWriter(new FileWriter("D:\\testjavawrit1e.txt",true));//������������ԭ�ļ���
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
	 * list�÷�
	 */
	public static void listPlaying(){

	}
	
	/**
	 * ��õ�ǰ����������
	 */
	public static void getMethodName(){
		String s = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(s);
	}
	
	/**
	 * ʹ��jsonobject
	 */
	public static void jsonPlaying(){
		JSONObject jb = new JSONObject();
		jb.put("hu", "who");
		jb.put("kai", "mumu");
		System.out.println(jb.toString());
	}
	
	/**
	 * ��ô����ļ�
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
	 * �ַ��������ڻ���ת��
	 */
	public static void strToDate(){
		try {
			//�ַ���-->����
			Date d = DateFormat.getDateInstance().parse("2016-08-19");
			System.out.println(d);
			Date d2 = new SimpleDateFormat("yyyy-MM-dd").parse("2016-06-09");
			System.out.println(d2);
			//����-->�ַ���
			String s = new SimpleDateFormat("yyyy-MM-dd").format(d);
			System.out.println(s);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * ��util Dateת��Ϊsql Date
	 * ���߿��Ի���ת����������ͬ
	 */
	public static void uToS(){
		java.util.Date d = new java.util.Date();
		java.sql.Date d2 = new java.sql.Date(d.getTime());
		System.out.println(d2);//2017-07-26 ����Ҫformat
	}
	
	/**
	 * �ļ�����
	 */
	public static void copy(){
		
	}
}
