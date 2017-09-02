package beforeML;

class Cba{
	public void fc(){
		System.out.println(1234321);
	}
	
	public static void main(String[] args) {
		
	}
}

class Clock {
	private ClockDisplay hour = new ClockDisplay(24);
	private ClockDisplay minute = new ClockDisplay(60);
	
	public void tick(){
		minute.tick();
		if(minute.getValue()==0){
			hour.tick();
		}
	}
	
	public void show(){
//		System.out.println(hour.getValue()+":"+minute.getValue());
//		System.out.printf("%02d:%02d\n", hour.getValue(),minute.getValue());
		System.out.println(hour+":"+minute);
	}
	
	public static void f(){
	}
	
	public static void main(String[] args) {
		f();
		Clock.f();
		Cba c1 = new Cba();
		c1.fc();
		Clock c = new Clock();
		while(true){
			c.tick();
			c.show();
		}
	}
		

}
