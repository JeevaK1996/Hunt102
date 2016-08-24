# Hunt102
public class Act1 {

	public static void main(String[] args) {
		int n = 1234;
		int reverse = 0;
		while( n != 0 )
	      {
	          reverse = reverse * 10;
	          reverse = reverse + n%10;
	          n = n/10;
	      }
		//System.out.println(reverse);
		 int sum = 0;
		int[] d = new int[10];
		int len = Integer.toString(reverse).length();
		for (int i = 0; i < len; i++) {
			d[i] = reverse % 10;
			reverse = reverse / 10;
			//System.out.print(d[i]);
			}
		int b=0;
		b=len;
		for (int k = 0; k < len; k++) {
			//System.out.println(b);
			for(int j=0;j<b;j++){
				sum+=d[j];
			}
			b--;
			}
		System.out.println(sum);
	}

}
