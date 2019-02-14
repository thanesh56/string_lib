
import java.util.*;
class SecondOcurence4 {
	public static void main(String... args) {
		String s = "babab";
		char[] c = s.toCharArray();
		int count =0;
		System.out.println("this code print the nearest matching index if character not mached then print -1 ");
		for(int i = 0;i<s.length();i++) {
			for(int j = i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					System.out.println(i);
					count++;
					break;
				}
				if((j+1)==s.length())
					System.out.println("-1");
			}
		}
	}
}
