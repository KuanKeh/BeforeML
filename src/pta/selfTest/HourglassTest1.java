package pta.selfTest;

public class HourglassTest1 {

	public HourglassTest1() {
		
	}
	
	/**
	 * 计算总层数
	 * @param a
	 * @return
	 */
	private int depth(int a) {
		int i=0;
		while(2*(Math.pow(i, 2))-1<a) {
			i++;
		}
		System.out.println("depth="+i);
		return 2*(i-1)-1;
	}
	
	/**
	 * 根据总层数画出图案
	 * @param i
	 */
	private void printHourglass(int i) {
		int half = (i-1)/2;
		for(int k = half; k > 0 ;k--) {
			System.out.println(printSingleRow(2*k+1, (i-(2*k+1))/2));
		}
		for(int k = 0; k < half + 1; k++) {
			System.out.println(printSingleRow(2*k+1, (i-(2*k+1))/2));
		}
	}
	
	/**
	 * 画出单行a个*号
	 * @param a
	 * @param b
	 * @return
	 */
	private String printSingleRow(int a,int b) {
		StringBuffer sb = new StringBuffer("");
		for(int i = 0; i < b; i++) {
			sb.append(" ");
		}
		for(int i = 0; i < a; i++) {
			sb.append("*");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		HourglassTest1 ht = new HourglassTest1();
		int num = 19;
		int depth = ht.depth(num);
		ht.printHourglass(depth);
		System.out.println(num - (2*Math.pow((depth+1)/2, 2)-1));
	}

}
