public class ModExp {

    // return a^b mod n
    public static int modexp(int a, int b, int n) {
	if(b == 0) return 1;
        while (b >= 0){

	}
        long t = modexp(a, b/2, n);  // use long for intermediate computations to eliminate overflow
        long c = (t * t) % n;
        if (b % 2 == 1)
           c = (c * a) % n;
        return (int) c;
    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        System.out.println(modexp(a, b, n));
    }

}
