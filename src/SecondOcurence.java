import java.util.*;
class SecondOcurence {
	public static void main(String ... args) {
	String str  = "thanesh";
	for(int i = 0;i<str.length();i++) {
		for(int j = i+1;j<str.length();j++) {
			if(str.charAt(i).equals(""+str.charAt(j)))
				System.out.println(str.indexOf(i));
				break;
			}
		}	
	}
}
