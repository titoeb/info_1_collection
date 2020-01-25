public class Felder_saal_4{
	public static void main(String[] args){
		int[] d = new int[10];

		System.out.println("First allocation of the field:");
		for(int i = 0; i < 10; i++){
			d[i] = 9 - i;
			System.out.println("d[" + i +"] = " + (9 - i));
		}
		
		System.out.println();
		System.out.println("Second allocation of the field:");
		for(int i = 0; i < 10; i++){
			System.out.println("d[" + i +"] = " + "d[d[" + i + "]] = d[" + d[i] + "] = " + d[d[i]]);
			d[i] = d[d[i]];
			
		}
		System.out.println();
		System.out.print("The final field is: ");

		for(int i = 0; i < 10; i++){
			System.out.print(d[i] + " ");		
		}

		System.out.println();
	}

}
