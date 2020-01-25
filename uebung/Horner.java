public class Horner{
	public static void hornerUmkehrungRekursiv(int z, int q){
		System.out.print("z: " + z +" q: " + q);
		if(z == 0){
			return;
		}
		
		hornerUmkehrungRekursiv(z / q, q);
		System.out.print(z % q);	
		return;
	}

	public static void main(String[] args){
		int z = Integer.parseInt(args[0]);
		int q = Integer.parseInt(args[1]);
		hornerUmkehrungRekursiv(z, q);
	}
}
