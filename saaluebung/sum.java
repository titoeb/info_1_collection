public class sum{

public static String sum_s(String x, String y){
	if(x.length() != y.length()) throw new IllegalArgumentException("Please provide strings of the same length!");
	if(x.length() == 0 || y.length() == 0) throw new IllegalArgumentException("Please provide strings of length at least length 1");

	String result = "";
	
	int rest = 0;
	int cur_res = 0;
	for(int i = x.length() - 1; i >= 0; i--){
		cur_res = (int) (x.charAt(i) - '0') + (int) (y.charAt(i) - '0');
		result = (char) (((cur_res + rest) % 10) + '0') + result;
		rest = cur_res / 10;
	}

	while(rest > 0){
		result = (char) ((rest % 10) + '0') + result;
		rest /= 10;
	}
	return result;
}

public static void main(String args[]){
	if(args.length < 2) System.out.println("Please provide two arguments - execution is aborted");
	else System.out.println(sum_s(args[0], args[1]));
}

}
