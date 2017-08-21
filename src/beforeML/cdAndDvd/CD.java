package beforeML.cdAndDvd;

public class CD extends Item {

	private int numOfTracks = 0;
	private String comment;
	private String title;
	
	public CD(String title, int not) {
		super(title);
		System.out.println(3321);
		numOfTracks = not;
	}
	
	public void print(){
//		System.out.println(title);
		super.print();
		System.out.println(numOfTracks);
	}
	
//	public void title(){
//		super.title = title;
//	}
	
	public static void main(String[] args){
		CD cd = new CD("Owl City",7);
		cd.print();
	}

}
