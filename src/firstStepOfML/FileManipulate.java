/**
 * 
 */
package firstStepOfML;

import java.io.File;

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
		File dir = new File("D:\\video");
		distribute(dir);
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
}
