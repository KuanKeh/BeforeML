/**
 * 
 */
package beforeML;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author gyge
 *
 */
public class FileManipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File dir = new File("D:\\video");
//		distribute(dir);
		copy();
	}
	
	private static int x = 0;
	
	/**
	 * 获得磁盘文件
	 */
	public static void distribute(File dir){
		File[] file = dir.listFiles();
		for(int i = 0; i < file.length; i++){
			if(file[i].isFile()){
				System.out.println("filename = " + file[i].getName()+" || x = " + x);
				x++;
			}else{
				System.out.println("directory name = " + file[i].getName() + " || parent name = " + file[i].getParent());
				distribute(file[i]);
			}
		}
	}
	
	/**
	 * 文件拷贝
	 */
	public static void copy(){
		File f1 = new File("D:\\熊熊三贱客.We.Bare.Bears.S01E10.720p.HDTV.x264.双语字幕-深影字幕组.mkv");
		File f2 = new File("D:\\123\\熊熊三贱客.We.Bare.Bears.S01E10.720p.HDTV.x264.双语字幕-深影字幕组.mkv");
		FileInputStream in = null;
		FileOutputStream out = null;
		long begin = System.currentTimeMillis();
		long temp = begin;
		long temp2 = begin;
		int i = 0;
		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
			byte[] by = new byte[2097152];
			while(true){
				i++;
				temp = temp2;
				int res = 0;
				try {
					res = in.read(by);
					if(res == -1){
						in.close();
						out.flush();
						out.close();
						break;
					}else{
						out.write(by);
						temp2 = System.currentTimeMillis();
						System.out.println("i = " + i + " &spend = " + (temp2-temp));
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("end-begin = " + (end-begin));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
