package dear;

public class stringandnumber {
	public static void main(String[] args) {
		String s="a2b3d4";
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();i+=2) {
			char ch=s.charAt(i);
			int a=s.charAt(i+1)-'0';
			for(int j=0;j<a;j++) {
				result.append(ch);
			}
		}
		System.out.println(result.toString());
	}
}
