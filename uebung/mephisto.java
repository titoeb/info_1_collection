public class mephisto{
	public static String mephisto(int n){
		if(n == 0) return "0";
		String past = mephisto(n - 1);
		String reverse = "";
		for(int i = 0; i < past.length(); i++){
			reverse = reverse  + (past.charAt(i) == '0' ? "1":"0");
		}
		return reverse + past;
	}
	public static void main(String[] args){
		int n = Integer.parseInt(args[0]);
		System.out.println(mephisto(n));
	}
}
