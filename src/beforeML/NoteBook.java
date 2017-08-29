package beforeML;

import java.util.ArrayList;

public class NoteBook {

	private ArrayList<String> notes = new ArrayList<String>();
	
	public void add(String s){
		notes.add(s);
	}
	
	public int getSize(){
		return notes.size();
	}
	
	public String getNote(int index){
		return "";
	}
	
	public boolean removeNote(int index){
		return false;
	}
	
	public String[] list(){
		return new String[10];
	}
	
	public static void main(String[] args) {
		NoteBook nb = new NoteBook();
		nb.add("first");
		nb.add("second");
		System.out.println(nb.getSize());

	}

}
