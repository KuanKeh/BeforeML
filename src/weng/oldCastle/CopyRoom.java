package weng.oldCastle;

public class CopyRoom {
	public String description;
	public CopyRoom northroom;
	public CopyRoom eastroom;
	public CopyRoom southroom;
	public CopyRoom westroom;
	
//	public CopyRoom(){
//	}
	
	public CopyRoom(String des){
		description = des;
	}
	
	public void setExits(CopyRoom northroom,CopyRoom eastroom,CopyRoom southroom,CopyRoom westroom){
		this.northroom = northroom;
		this.eastroom = eastroom;
		this.southroom = southroom;
		this.westroom = westroom;
	}
	
	public String toString(){
		return description;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
