public class MiddeSquare{
	public static void main(String[] args){
		int search = Integer.parseInt(args[0]);
		if(search == 1){
			int[] seq;
			for(int i = 1; i < 100; i++){
				seq = middlesquare(i);
				if(is_seq(seq)) System.out.println(i);
			}
		} else {
			int test = Integer.parseInt(args[1]);
			int[] test_seq = middlesquare(test);
			for(int i = 0; i < test_seq.length; i++){
				System.out.println(test_seq[i]);
			}
		}
			
	}

	public static int[] middlesquare(int a){
		if(a < 0 || a > 99){
			throw new RuntimeException("Only positive values with one digit are allowed");
		}
		int seq[] = new int[101];
		for(int i = 0; i < 101; i++){
			seq[i] = a;
			a = a * a;
			a = (a / 10) % 100;
		}
		return seq;
	}

	public static boolean is_seq(int[] seq){
		int h_pos = 2, i_pos = 1;
		boolean was_cyc = false;	
		while(h_pos < 101){
			if(was_cyc == false){
				if(seq[i_pos] == seq[h_pos]) was_cyc = true;
			} else {
				if(seq[i_pos] != seq[h_pos]) return true;
			}
			
			h_pos += 2;
			i_pos++;
		}
		return false;
	}
}
