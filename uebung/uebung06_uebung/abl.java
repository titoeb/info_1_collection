public class abl{

	public static void ableitung(int[] Folge, int position){
		// Abbruchbeding
		if(position == 0){
			return;
		}
		Folge[position] = Math.abs(Folge[position] - Folge[position - 1]);
		ableitung(Folge, position - 1);
	}
	public static void ableitung(int[] Folge){
		ableitung(Folge, Folge.length - 1);
	}


	public static void main(String[] args){
		int[] Folge = {1,1,0,1,0};
		for(int i = 0; i < Folge.length; i++){
			System.out.print(Folge[i]);
		}
		System.out.println();
		ableitung(Folge);
		for(int i = 0; i < Folge.length; i++){
			System.out.print(Folge[i]);
		}
		System.out.println();
	}
}
