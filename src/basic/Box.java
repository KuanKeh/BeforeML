package basic;

class Rect{
	int width,length;
}

public class Box extends Rect{
	int height;
	public int cub() {
		return width*length*height;
	}
}
