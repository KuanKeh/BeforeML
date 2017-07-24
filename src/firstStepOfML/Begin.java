/**
 * 
 */
package firstStepOfML;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

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
		distribute();

	}
	
	/**
	 * 向文件中写入内容
	 */
	public static void writeFile(){
		BufferedWriter bw = null;
		try {
//			bw = new BufferedWriter(new FileWriter("D:\\testjavawrite.txt"));//原文件内容会被覆盖
			bw = new BufferedWriter(new FileWriter("D:\\testjavawrit1e.txt",true));
			bw.write("33");
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
	 * 获得磁盘文件
	 */
	public static void distribute(){
//		File subDir = new File("C:\\Users\\gyge\\AppData\\Roaming\\SPlayer\\SVPSub");
		File dir = new File("D:\\");
//		File[] subFiles = subDir.listFiles();
		File[] file = dir.listFiles();
		System.out.println("dir.length() = " + dir.length());
		System.out.println("file.length = " + file.length);
		for(int i = 0; i < file.length; i++){
			System.out.println(file[i].getName() + "|| i = " + i);
//			file[i].
		}
	}
}
