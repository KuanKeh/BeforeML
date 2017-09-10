package weng.oldCastle;

import java.util.Scanner;

public class Game2 {

	private CopyRoom currentRoom;
	
	public Game2(){
		CopyRoom pub = new CopyRoom("酒吧");
		CopyRoom study = new CopyRoom("书房");
		CopyRoom living = new CopyRoom("起居室");
		CopyRoom bedroom = new CopyRoom("卧室");
		CopyRoom out = new CopyRoom("花园");
		
		out.setExits(null, study, living, pub);
		study.setExits(null, null, null, out);
		living.setExits(out, bedroom, null, null);
		bedroom.setExits(null, null, null, living);
		pub.setExits(null, out, null, null);
		
		currentRoom = out;
		
	}
	
	public void statusReport(){
		System.out.println("现在房间："+currentRoom);
		System.out.println("出口有:");
		if(currentRoom.eastroom!=null){
			System.out.print("east ");
		}
		if(currentRoom.westroom!=null){
			System.out.print("west ");
		}
		if(currentRoom.northroom!=null){
			System.out.print("north ");
		}
		if(currentRoom.southroom!=null){
			System.out.print("south ");
		}
		System.out.println();
	}
	
	public void goRoom(String dir){
		CopyRoom nextroom = null;
		if(dir.equals("north")){
			nextroom = currentRoom.northroom;
		}
		if(dir.equals("south")){
			nextroom = currentRoom.southroom;
		}
		if(dir.equals("east")){
			nextroom = currentRoom.eastroom;
		}
		if(dir.equals("west")){
			nextroom = currentRoom.westroom;
		}
		if(null == nextroom){
			System.out.println("wrong room");
		}else{
			currentRoom = nextroom;
			statusReport();
		}
		
	}
	
	public void printHelp(){
		System.out.println("help list");
	}
	
	
	
	public static void main(String[] args) {
		Game2 game = new Game2();
		Scanner in = new Scanner(System.in);
		System.out.println("输入方向");
		while(true){
			game.statusReport();
			String move = in.nextLine();
			String[] m = move.split(" ");
			if(m.length>0){
				if(m[0].equals("help")){
					game.printHelp();
				}else if(m[0].equals("go")){
					game.goRoom(m[1]);
				}else if(m[0].equals("bye")){
					break;
				}
			}
		}
		in.close();
	}
}
