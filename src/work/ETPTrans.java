package work;

import java.io.IOException;
import java.io.StringReader;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

public class ETPTrans {
	public List xmlElements(String xmlDoc,String[] a3) {
        //创建一个新的字符串
        StringReader read = new StringReader(xmlDoc);
        //创建新的输入源SAX 解析器将使用 InputSource 对象来确定如何读取 XML 输入
        InputSource source = new InputSource(read);
        //创建一个新的SAXBuilder
        SAXBuilder sb = new SAXBuilder();
        try {
            //通过输入源构造一个Document
            Document doc = sb.build(source);
            //取的根元素
            Element root = doc.getRootElement();
            Element comp = root.getChild("company");
//            System.out.println(root.getChildren());
//            System.out.println(comp.getText());
            System.out.println("rootNames="+root.getName());//输出根元素的名称（测试）
            //得到根元素所有子元素的集合
//            List jiedian = root.getChildren();
            //获得XML中的命名空间（XML中未定义可不写）
            /*Namespace ns = root.getNamespace();
            Element et = null;
            for(int i=0;i<jiedian.size();i++){
                et = (Element) jiedian.get(i);//循环依次得到子元素
               
                System.out.println(et.getChild("users_id",ns).getText());
                System.out.println(et.getChild("users_address",ns).getText());
            }
           
            et = (Element) jiedian.get(0);
            List zjiedian = et.getChildren();
            for(int j=0;j<zjiedian.size();j++){
                Element xet = (Element) zjiedian.get(j);
                System.out.println(xet.getName());
            }*/
            
            Element names = root.getChild("names");
            List nameList = names.getChildren();
            for(int i=0; i < nameList.size(); i++) {
            	Element name = (Element) nameList.get(i);
            	System.out.println(name.getName());
            	for(int j=0; j<a3.length;j++) {
            		Element child = name.getChild(a3[j]);
            		System.out.print("child.getName()="+child.getName());
            		System.out.println("&&child.getText()="+child.getText());
            	}
            }
            
            
        } catch (JDOMException e) {
            // TODO 自动生成 catch 块
            e.printStackTrace();
        } catch (IOException e) {
            // TODO 自动生成 catch 块
            e.printStackTrace();
        }
        return null;
    }
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i = 0;
//		while(i<100) {
//			System.out.println("LoopPrint = " + i++);
//		}
//		Document xmlDoc = DocumentHelper.parseText("<>");
		System.out.println(27/10);
		System.out.println(23/10);
		int a = 7;
		  int b = 3;
		  double c = ((double)a)/b;

		  int d = (int) Math.ceil(c);
		  int e = (int) Math.floor(c);

		  System.out.println(d);
//		String[] a1 = {"company","address"};
//		String a2 = "name";
//		String[] a3 = {"firstname","secondname"};
//		String a = "<codec>"
//				+ "<company>huawei</company>"
//				+ "<address>shenzhen</address>"
//				+ "<names>"
//				+ "<name>"
//				+ "<firstname>li</firstname>"
//				+ "<secondname>lei</secondname>"
//				+ "</name>"
//				+ "<name>"
//				+ "<firstname>han</firstname>"
//				+ "<secondname>meimei</secondname>"
//				+ "</name>"
//				+ "</names>"
//				+ "</codec>";
//		new ETPTrans().xmlElements(a,a3);
	}

}
