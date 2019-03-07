package codewars;

public class Kata {
	public int min(int[] list) {
		int min = 0;
		for(int i : list){
			if(i < min) {
				min = i;
			}
		}
		return min;
	}
	public int max(int[] list) {
		int max = 0;
		for(int i : list){
			if(i > max) {
				max = i;
			}
		}
		return max;
	}
}
