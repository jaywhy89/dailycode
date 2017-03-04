import java.util.*;

class Test {
	public static void main (String[] args) {
		String s = "123";
		List<String> list = new ArrayList<String>();
		while (s.length() != 0) {
			int i=0;
			list.add(s.substring(i,i+2));
			s = s.substring(i+2);
		}
		for (String st : list) {
			System.out.println(Integer.parseInt(st));
		}
	}
}