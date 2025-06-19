package dear;

public class methodarray {
	public static int[] change(int x[]) {
		x[0]=10;
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		 arr=change(arr);
		for(int i=0;i<arr.length;System.out.print(arr[i]+" "),i++) {
			
		}

	}

}
