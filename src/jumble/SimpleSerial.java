package jumble;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SimpleSerial {
//	 public static void main(String[] args) throws Exception {  
//	        File file = new File("D:\\person.out");  
//	        ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(file));  
//	        Person person = new Person("John", 101, Gender.MALE);  
//	        oout.writeObject(person);  
//	        oout.close();  
//	 
//	        ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file));  
//	        Object newPerson = oin.readObject(); // 没有强制转换到Person类型  
//	        oin.close();  
//	        System.out.println(newPerson);  
//	    }  
	    public static void main(String[] args) {
	        String[] names = {"beibei", "jingjing"};
	        for (String name : names) {
	            name = "huanhuan";
	        }
	        //foreach
	        System.out.println("foreach:"+Arrays.toString(names));
	        //for
	        for (int i = 0; i < names.length; i++) {
	            names[i] = "huanhuan";
	        }
	        System.out.println("for:"+Arrays.toString(names));
	    }
}
