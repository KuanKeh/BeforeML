package codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DescendingOrder {

	public DescendingOrder() {
	}

	public static void main(String[] args) {
		long i = 5681234l;
		System.out.println(sortDesc(i));
//		String.valueOf(12345).chars()
		List<String> langList = Arrays.asList("Java", "Python", "Swift", "HTML");
		Stream<String> mapStream = langList.stream();
//				.map(String::toUpperCase);
		System.out.println(mapStream);
		System.out.println(mapStream.collect(Collectors.joining()));
		System.out.println(Long.MAX_VALUE);
		System.out.println("---------");
			
		for(int j = 0; j < 11; j++) {
			long k = (long) (Math.random()*10);
			System.out.println("k = " + k);
			i = i*10 + k;
			System.out.println("i = " + i);
		}
		System.out.println("int to sort:" + i);
		long starttime = System.currentTimeMillis();
		for(int j = 0; j<500; j++) {
			sortDesc(i);
		}
		long mid = System.currentTimeMillis();
		for(int j = 0; j<500; j++) {
			sortDesc1(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("sortDesc = " + (mid-starttime) + "||sortDesc1 = " + (end-mid));
	}
	
	public static long sortDesc(final long num) {
		char[] origin = String.valueOf(num).toCharArray();
		for(int i = 0; i < origin.length - 1; i++) {
			for(int j = i + 1; j < origin.length; j++) {
				if(origin[i] < origin[j]) {
					char t = origin[i];
					origin[i] = origin[j];
					origin[j] = t;
				}
			}
		}
		return Long.parseLong(String.valueOf(origin).trim());
	}
	
    public static long sortDesc1(final long num) {
        return Long.parseLong(String.valueOf(num)
                                      .chars()
                                      .mapToObj(i -> String.valueOf(Character.getNumericValue(i)))
                                      .sorted(Comparator.reverseOrder())
                                      .collect(Collectors.joining()));
    }

}
