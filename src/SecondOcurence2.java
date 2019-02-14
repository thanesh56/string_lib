
class SecondOcurence2 {
	public static void main(String... args) {
	String str = "Thaanesh";
	int count = 0;
	for(int i = 0;i<str.length()-1;i++) {
		count = 0;
		for(int j= 0; j<str.length();j++) {
			System.out.println(str.charAt(i)+" "+str.charAt(j));
			if(str.charAt(i)==(str.charAt(j))){
				count++;
			}
			if(count==2) {
				System.out.println(str.indexOf(str.charAt(j),str.indexOf(str.charAt(j))+1));
				continue;
			}
		
		}
	}
	if(count<1) {
		System.out.println("-1");
	
	}
}

}
