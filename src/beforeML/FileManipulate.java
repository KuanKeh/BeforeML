/**
 * 
 */
package beforeML;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

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
//		copy();
		loadProperties();
	}
	
	private static int x = 0;
	
	/**
	 * ��ô����ļ�
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
	 * �ļ�����
	 */
	public static void copy(){
		File f1 = new File("D:\\����������.We.Bare.Bears.S01E10.720p.HDTV.x264.˫����Ļ-��Ӱ��Ļ��.mkv");
		File f2 = new File("D:\\123\\����������.We.Bare.Bears.S01E10.720p.HDTV.x264.˫����Ļ-��Ӱ��Ļ��.mkv");
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
	
	/**
	 * �ļ�����
	 */
	public static void copy1(){
		String fileName = "����������.We.Bare.Bears.S01E10.720p.HDTV.x264.˫����Ļ-��Ӱ��Ļ��.mkv";//�ļ���
		String sourceDir = "D:\\";//ԭ·��  pwd
		File sourceExist = new File(sourceDir);//ԭ·��  cd
		File[] sourceFiles = sourceExist.listFiles();//ԭ·���ļ��б�  ls
		System.out.println("sourceExist.getClass = "+sourceExist.getClass());
		System.out.println("sourceFiles.getClass = "+sourceFiles.getClass());
		boolean sExist = false;

		for(int j = 0; j < sourceFiles.length; j++){
			if(fileName.equals(sourceFiles[j].getName())){
				sExist = true;
				break;
			}
		}
		if(!sExist){
			System.out.println("Դ�ļ������ڣ������ļ�����");
		}else{
			String distanceDir = "D:\\123\\";//Ŀ��Ŀ¼
			File distanceExist = new File(distanceDir);//Ŀ��Ŀ¼
			File[] distanceFiles = distanceExist.listFiles();//Ŀ��Ŀ¼�ļ��б�
			boolean dExist = false;
			for(int j = 0; j < distanceFiles.length; j++){
				if(fileName.equals(distanceFiles[j].getName())){
					dExist = true;
					break;
				}
			}
			if(dExist){
				System.out.println("Ŀ���ļ��Ѵ��ڡ�");
			}else{
				try {
					File f1 = new File(sourceDir+fileName);
					File f2 = new File(distanceDir+fileName);
					FileInputStream in = null;
					FileOutputStream out = null;
					long begin = System.currentTimeMillis();
					long temp = begin;
					long temp2 = begin;
					in = new FileInputStream(f1);
					out = new FileOutputStream(f2);
					byte[] by = new byte[2097152];
					int i = 0;
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
	}
	
	/**
	 * ��ȡProperty�ļ�
	 */
	public static void loadProperties(){
		//����
		InputStream in = FileManipulate.class.getResourceAsStream("D:\\everything.properties");
		System.out.println(in);
		Properties p = new Properties();
		try {
//			p.load(new FileInputStream(System.getProperty("user.dir")+"\\properties\\everything.properties"));
			p.load(in);
		} catch (IOException e) {
			//提交
			e.printStackTrace();
		}
		p.list(System.out);
	}
}
