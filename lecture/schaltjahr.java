public class schaltjahr{
	public static void main(String[] args){
		int j = Integer.parseInt(args[0]);
		if ((j % 4 == 0 && j % 100 != 0) || j % 400 == 0 ){
			System.out.println("Schaltjahr");
		}
	}
}
