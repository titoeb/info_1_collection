public class prim_fac{
	public static void factor(int n){
		int t = 2;
		while((n%t == 0) && (t*t < n)){
			t++;
		}
		if (t*t > n){
			System.out.print(n+ " ");
			return;		
		}
		System.out.print(t + " ");
		factor(n/t);
	}

	public static void main(String[] args){
		int z = Integer.parseInt(args[0]);
		System.out.println(z + ": ");
		if(z>1){
			factor(z);
		}
		System.out.println();
	}

}
