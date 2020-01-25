public class euclid{
	public static void main(String[] args){
		if (args.length != 2){
			System.out.print("Please provide two numbers!\n");
			
		} else {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			if (a < 0  |  b < 0){
				System.out.print("Both numbers have to be greater equals zero!\n");
			} 
			int x, y, r;
			if (a > b){
				x = a;
				y = b;
			} else {
				x = b;
				y = a;	
			}
		
			while (y != 0){
			r = x %  y;
			x = y;
			y = r;
			}
		System.out.println("The smallest divisor is " + x);
		}
	}
}
