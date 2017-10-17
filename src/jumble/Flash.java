package jumble;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class Flash {

	public static void main(String[] args) {
		tranCode();
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
//		assign();
//		System.out.println(File.separator);//\
//		Person p = new Person("",11,Gender.MALE);
//		Person pp = p;
//		System.out.println(p);//[, 11, MALE]
//		ArrayList<Person> aa = new ArrayList<Person>();
//		aa.add(p);
//		pp.setAge(12);
//		System.out.println(aa.get(0));//[, 12, MALE]
//		Set<String> s = new HashSet<String>();
//		s.add("f");
//		s.add("c");
//		for(String aa:s){
//			System.out.println(aa);
//		}
//		
//		Set<Integer> tree = new TreeSet<Integer>();
//		tree.add(3);
//		tree.add(2);
//		tree.add(4);
//		for(int i : tree){
//			System.out.println(i);
//		}
		
	}

	/**
	 * 下载的附件名乱码，进行解码
	 * 原文件名：海贼王1~3卷（1~18话）
	 */
	public static void tranCode(){
		String a = "%E6%B5%B7%E8%B4%BC%E7%8E%8B1~3%E5%8D%B7%EF%BC%881~18%E8%AF%9D%EF%BC%89";//"%E6%B5%B7%E8%B4%BC%E7%8E%8B1~3%E5%8D%B7%EF%BC%881~18%E8%AF%9D%EF%BC%89";
		a = "<!-- è?????é??é?¨???è??,???é??è????????é??JQUERY -->";
//		a = "<!-- è?????é??é?¨???è??,???é??è????????é??JQUERY -->";
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
			 k = URLDecoder.decode(a,"UTF-8");//海贼王1~3卷（1~18话）
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
	 * ISO-8859-1是单字节编码，无法显示中文，所以用它编码以后不能再用它解码，否则显示??
	 * request.getParameter();方法的时候使用服务器指定的编码格式自动解码一次 ?????
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
	
	/**
	 * 
	 */
	public static void assign(){
		Cell cell = new Cell();
		Cell cell1 = new Cell();
		Cell c1 = cell;
		Cell c2 = c1;
		System.out.println("Before ass");
		c1 = cell1;
		System.out.println("After ass");
	}
}
