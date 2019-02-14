import java.util.*;
class SecondOcurence3 {
	public static void main(String... args) {
		String s = "thana";
		char[] c = s.toCharArray();
		int count =0;
		System.out.println("We print index of any matched charecter if all not matched then print -1");
		for(int i = 0;i<s.length();i++) {
			for(int j = i+1;j<s.length();j++) {
				if(c[i]==c[j]) {
					System.out.println(i);
					count++;
					break;
				}
			}
		
		
		}
		if(count==0)
			System.out.println("-1");
	}
}
