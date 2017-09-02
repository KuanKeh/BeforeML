/**
 * 
 */
package beforeML;

import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
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
//		loadProperties();
//		printProperties();
//		copy1();
//		System.out.println(System.getProperty("user.dir"));
//		int i = 200;
//		char c = (char) i;
//		System.out.println(c);
//		System.out.println(File.separator);
		readData();
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
		long temp = begin, temp2 = begin;
		int i = 0;
		try {
			in = new FileInputStream(f1);
			out = new FileOutputStream(f2);
			byte[] by = new byte[2097152];// 2M字节
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
	 * 文件拷贝
	 * byte设为2097152时，复制4096B大小的文件占用了2M空间 
	 * @throws IOException 
	 */
	public static void copy1(){
		String fileName = "千手纲手合集233.rar";//"熊熊三贱客.We.Bare.Bears.S01E10.720p.HDTV.x264.双语字幕-深影字幕组.mkv";//文件名
		String sourceDir = "D:\\";//原路径  pwd
		File sourceExist = new File(sourceDir);//原路径  cd
		File[] sourceFiles = sourceExist.listFiles();//原路径文件列表  ls
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
			System.out.println("源文件不存在，请检查文件名。");
		}else{
			String distanceDir = "D:\\234\\";//目的目录
			File distanceExist = new File(distanceDir);//目的目录
			File[] distanceFiles = distanceExist.listFiles();//目的目录文件列表
			boolean dExist = false;
			for(int j = 0; j < distanceFiles.length; j++){
				if(fileName.equals(distanceFiles[j].getName())){
					dExist = true;
					break;
				}
			}
			if(dExist){
				System.out.println("目的文件已存在。");
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
					try {
						System.out.println("ava = " + in.available() + " &marksupport = " + in.markSupported());
					}catch(IOException e) {
						e.printStackTrace();
					}
					out = new FileOutputStream(f2);
					byte[] by = new byte[4096];//new byte[2097152];//可能类似4K对齐,by不能设置太大
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
								System.out.println("res = " + res + " &i = " + i + " &spend = " + (temp2-temp));
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
	 * 读取Property文件  两种方法 getResourceAsStream,FileInputStream
	 */
	public static void loadProperties(){
		//以下两种写法都可以  getResourceAsStream只能获得src下面的文件，/开头则从src路径开始计算，无/开头则从当前class文件的路径下计算。
		InputStream in = FileManipulate.class.getResourceAsStream("/beforeML/everything.properties");
//		InputStream in = FileManipulate.class.getResourceAsStream("everything.properties");
		System.out.println(in);
		Properties p = new Properties();
		try {
			//用于读取非src路径下的文件
//			p.load(new FileInputStream(System.getProperty("user.dir")+"\\properties\\start.properties"));
			p.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}
		p.list(System.out);
	}
	
	/**
	 * move file
	 */
	public static void move() {
		
	}
	
	/**
	 * 缩略图
	 * @throws InterruptedException 
	 */
	public static void thumbNail() throws InterruptedException{
		String imageName = "";
		Image image = Toolkit.getDefaultToolkit().getImage(imageName);
		MediaTracker mt = new MediaTracker(new Container());
		mt.addImage(image, 0);
		mt.waitForID(0);
		System.out.println(mt.isErrorAny());
		int height = 200,width = 100;
		double ratio = (double)height/width;
		int imageHeight = image.getHeight(null);
		int imageWidth = image.getWidth(null);
		double imageRatio = (double)imageHeight/imageWidth;
		if(ratio > imageRatio) {
			height = (int)(width * imageRatio);
		}else {
			width = (int)(height / imageRatio);
		}
		BufferedImage bi = new BufferedImage(width,height,BufferedImage.TYPE_INT_BGR);
		Graphics2D g2d = bi.createGraphics();
		g2d.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2d.drawImage(image,0,0,width,height,null);
	}
	
	/**
	 * system.getproperties
	 */
	public static void printProperties() {
		Properties p = System.getProperties();
//		System.out.println(System.getProperties());
		p.list(System.out);
	}
	
	/**
	 * InputStream
	 */
	public static void readData() {
		FileInputStream fins = null;
		try {
			fins = new FileInputStream("D:\\test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataInputStream dins = new DataInputStream(fins);
		double d = 0.0;
		try {
			d = dins.readDouble();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(d);
	}
}
