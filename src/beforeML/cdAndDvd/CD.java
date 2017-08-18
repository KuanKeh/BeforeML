package beforeML.cdAndDvd;

public class CD extends Item {

	private int numOfTracks = 0;
	
	public CD(String title, int not) {
		super(title);
		numOfTracks = not;
	}
	
	public static void main(String[] args){
		CD cd = new CD("Owl City",7);
		cd.print();
	}

}
