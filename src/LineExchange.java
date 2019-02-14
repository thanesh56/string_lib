import java.util.Scanner;
class LineExchange {
	public static void main(String ... args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter line number: ");
		int linenum = s.nextInt();
		String[] str = new String[linenum];
		for(int i =0;i<linenum;i++) {
			//System.out.println("Enter line"+i);
			str[i] = s.nextLine();
		}
		StringBuilder[] sb = new StringBuilder[linenum];
		for(int i = linenum-1;i>=0;i-- ) {
			//System.out.println(str[i]);
			sb[i] = new StringBuilder(str[i]);
			System.out.println(sb[i].reverse().toString());
		}
	}}
