public class Quersumme{
	public static void main(String[] args){
		int test = Integer.parseInt(args[0]);
		System.out.println("quersumme(" + test + ") = " + quersumme(test));
		System.out.println("quersumme_it(" + test + ") = " + quersumme_it(test));
	}
	public static int quersumme(int number){
		int sum = 0;
		while(number > 0){
			sum += number % 10;
			number /= 10;
		}
		return sum;
	}
	public static int quersumme_it(int number){
		while(number > 10) number = quersumme(number);
		return number;
	}
}
