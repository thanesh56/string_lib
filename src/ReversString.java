import java.util.Scanner;
class ReversString {
	public static void main(String ... args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter lines: ");
		String str = s.nextLine();
		/*StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse().toString());*/
		String str1 = "";
		for(int i = str.length()-1;i>=0;i--) {
			 str1 = str1+str.charAt(i);
		}
		System.out.println(str1);
	}
}
