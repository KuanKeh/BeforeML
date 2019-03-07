package basic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Match {
	public static void main(String[] args) {
		String regex = "中国移动[0-9]{6}";
		String source = "中国移动777777，中国联通7，中国电信666666，uuu";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(source);
		boolean result = matcher.find();
		System.out.println(matcher.start());
		System.out.println(matcher.end());
		System.out.println(source.substring(matcher.start(), matcher.end()));
		StringBuffer sb = new StringBuffer();
		while(result) {
			matcher.appendReplacement(sb, "******");
			result = matcher.find();
			System.out.println(matcher.start());
			System.out.println(matcher.end());
		}
		matcher.appendTail(sb);
		System.out.println(sb);
	}
}
