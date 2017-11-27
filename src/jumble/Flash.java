package jumble;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Scanner;
import java.util.UUID;

public class Flash {

	public static void main(String[] args) {
//		tranCode();
//		uuidTest();
//		try {
//			toUTF("中文","UTF-8");
//			toUTF("中文","GBK");
//			toUTF("中文","GB2312");
//			toUTF("中文","GB18030");
//			toUTF("中文","ISO8859-1");
//			toUTF("中文","");
//			trans();
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
		
//		Scanner in = new Scanner(System.in);
		System.out.println("ar0 = " + args[0]);
		System.out.println("ar1 = " + args[1]);
	}

	/**
	 * 下载的附件名乱码,进行解码
	 * 原文件名：海贼王1~3卷（1~18话）
	 */
	public static void tranCode(){
		String a = "%B0%A1%B0%A1%B0%A1";//"%E6%B5%B7%E8%B4%BC%E7%8E%8B1~3%E5%8D%B7%EF%BC%881~18%E8%AF%9D%EF%BC%89";
		byte[] x = a.getBytes();
		String b = "";
		String c = "";
		String d = "";
		String f = "";
		String g = "";
		
		String h = "";
		String i = "";
		String j = "";
		String k = "";
		String l = "";
		try {
			 b = new String(x,"GB2312");
			 c = new String(x,"GB18030");
			 d = new String(x,"GBK");
			 f = new String(x,"UTF-8");
			 g = new String(x,"ISO8859-1");
			 
			 h = URLDecoder.decode(a,"GB2312");
			 i = URLDecoder.decode(a,"GB18030");
			 j = URLDecoder.decode(a,"GBK");
			 k = URLDecoder.decode(a,"UTF-8");
			 l = URLDecoder.decode(a,"ISO8859-1");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		System.out.println(f.toString());
		System.out.println(g.toString());
		
		System.out.println(h.toString());
		System.out.println(i.toString());
		System.out.println(j.toString());
		System.out.println(k.toString());
		System.out.println(l.toString());
	}
	
	/**
	 * UUID测试
	 */
	public static void uuidTest(){
		String uuid = UUID.randomUUID().toString();
		System.out.println(uuid);
	}
	
	/**
	 * 中文转UTF-8
	 * @throws UnsupportedEncodingException 
	 */
	public static void toUTF(String chinese,String code) throws UnsupportedEncodingException{
		byte[] b = chinese.getBytes();
		for(int i = 0; i<b.length; i++){
			System.out.print(b[i]+"||");
		}
		System.out.println();
	}
	
	/**
	 * 中文转UTF-8 ISO-8859-1
	 * ISO-8859-1是单字节编码,无法显示中文,所以用它编码以后不能再用它解码,否则显示
	 * request.getParameter();方法的时候使用服务器指定的编码格式自动解码一次 
	 * @throws UnsupportedEncodingException 
	 */
	public static void trans() throws UnsupportedEncodingException{
		String s = URLEncoder.encode("测试","UTF-8");
		System.out.println(s);
		s = URLEncoder.encode(s,"ISO-8859-1");
		System.out.println(s);
		s = URLDecoder.decode(s,"ISO-8859-1");
		System.out.println(s);
		System.out.println(URLDecoder.decode(s,"UTF-8"));
	}
}
