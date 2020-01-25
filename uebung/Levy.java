public class Levy{
	public static void main(String[] args){
		int n = Integer.parseInt(args[1]);
		char mod = args[0].charAt(0);
		if(!(mod == 'D' || mod == 'R' || mod == 'L')){
			throw new RuntimeException("Only D for Dragon curve or R for random are accepted.");
		}
		if(mod == 'R'){
			if (n < 0 || n > 100000){
				throw new RuntimeException("Only length between 0 and 100000 are excepted!");
			}
			rand_patt(n);
		} else{ 
			if(mod == 'D'){
				if (n < 0 || n > 20){
					throw new RuntimeException("Only length between 0 and 20 are excepted!");
				}	
				char[] res = new char[(int) (Math.pow(2, n + 1)  - 1)];
				dragon(res, n);
				System.out.println((int) (Math.pow(2, n + 1)  - 1));
				System.out.println(res);
			} else {
				if (n < 0 || n > 20){
					throw new RuntimeException("Only length between 0 and 20 are excepted!");
				}
				char[] lev = new char[1];
				lev[0] = 'F';
				lev = levy(lev, n);
				System.out.println(lev);
				int len = lev_to_F(lev);
				for(int i = 0; i < len; i++) System.out.print(lev[i]);
				System.out.println();
			}
		}
	}
	public static void rand_patt(int len){
		System.out.println(len);
		String rand = "";
		char rand_char;
		double rand_num;
		for(int i = 0; i < len; i++){
			rand_num = StdRandom.uniform(0, 3);
			System.out.println(rand_num);
			if(rand_num < 1.0) rand += "F";
			else{
				if (rand_num > 1.0) rand += "L";
				else rand += "R";
			}
		}
		System.out.println(rand);
	}
	public static void dragon(char[] res, int len){
		String result = dragon_rec(len);
		for(int i = 0; i < res.length; i++) res[i] = result.charAt(i);
	}
	public static String dragon_rec(int degree){
		if (degree == 0) return "F";
		else{
			String last = dragon_rec(degree - 1);
			String out = last + "R";
			char cur;
			for(int i = last.length() - 1; i >= 0; i--){
				cur = last.charAt(i);
				if (cur == 'L') cur = 'R';
				out += cur;
			}
			return out;
		}
	}
	public static char[] levy(char[] in, int degree){
		if(degree > 0){
			char[] out = new char[2 * in.length + 4];
			out[0] = '+';
			for(int i = 0; i < in.length; i++){
				out[1 + i] = in[i];
			}
			out[in.length + 1] = '-';
			out[in.length + 2] = '-';
			for(int i = 0; i < in.length; i++){
				out[3 + in.length + i] = in[i];
			}
			out[in.length * 2 + 3] = '+';
			return(levy(out, degree - 1));
		} else {
			return in;
		}
	}
	public static int lev_to_F(char[] in){

		// Find first F
		int count;
		for(count = 0; count < in.length && in[count] != 'F'; count++);
		int pos = 0;
		char sum = 0;
		char last = 'F';
		for(int i = count; i < in.length - count; i++){
			if(in[i] == 'F'){
				in[pos] = 'F';
				pos++;
			} else {
				if(sum != 0 && last == in[i]){
					if(in[i] == '-') in[pos] = 'L';
					else in[pos] = 'R';
					
					pos++;
					sum = 0;
					
				}
				if(in[i] == '+') sum++;
				if(in[i] == '-') sum--;
				last = in[i];
			}
		}
		return pos;
	}
}
