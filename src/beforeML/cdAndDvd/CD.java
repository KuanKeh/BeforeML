package beforeML.cdAndDvd;

public class CD extends Item {

	private int numOfTracks = 0;
	
	public CD(String title, int not) {
		super(title);
		numOfTracks = not;
	}
	
	
	public void print(){
		super.print();
		System.out.println(numOfTracks);
	}
	
	public int getNot(){
		return numOfTracks;
	}
	
//	public void title(){
//		super.title = title;
//	}
	
	public void changeType(){
		
	}
	
	public static void main(String[] args){
		CD cd = new CD("Owl City",7);
		cd.print();
	}

}
