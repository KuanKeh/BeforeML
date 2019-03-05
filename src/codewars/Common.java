package codewars;

public class Common extends Number implements Comparable<Double>{

	int c = 0;
	
	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}
	
	public Common() {
		
	}
	
	public Common(int c) {
		this.c = c;
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Common doubleIt() {
		return new Common(this.c * 2);
	}

	@Override
	public int compareTo(Double o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
