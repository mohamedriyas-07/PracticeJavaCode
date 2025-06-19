package dear;

public class IntToBIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 25,bin = 0, p = 1;
		System.out.print(n +" = ");
		while(n>0) {
			bin = bin +(n%2) *p;
			p*=10;
			n/=2;
		}
		
		System.out.println(bin);
	}

}
	