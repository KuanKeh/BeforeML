package jumble;

import java.io.Serializable;

public class Person implements Serializable {
	private String name = null;  
	 
    private Integer age = null;  
 
    private Gender gender = null;  
 
    public Person() {  
        System.out.println("none-arg constructor");  
    }  
 
    public Person(String name, Integer age, Gender gender) {  
        System.out.println("arg constructor");  
        this.name = name;  
        this.age = age;  
        this.gender = gender;  
    }  
 
    public Integer getAge() {  
        return age;  
    }  
 
    public void setAge(Integer age) {  
        this.age = age;  
    }  
 
    @Override 
    public String toString() {
        return "[" + name + ", " + age + ", " + gender + "]";  
    }  
}
