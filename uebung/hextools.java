public class hextools{
	public static boolean isHexString(String s){
		for(int i = 0; i < s.length(); i++){
			if (!isHexChar(s.charAt(i))) return false;
		}	
		return true;
	}
	public static boolean isHexChar(char c){
		return Character.isDigit(c) || c == 'A' || c == 'B' || c == 'D' || c == 'E' || c == 'F';
	}
	public static int hex2int(String h){
		int decimal = 0;
		int pot = 1;
		for(int i = h.length() - 1; i >= 0; i--){
			decimal += makeDec(h.charAt(i)) * pot;
			pot *= 16;
		}
		return decimal;
	}
	public static int makeDec(char c){
		if(c - '0' < 10){
			return c - '0';
		} else {
			switch(Character.toLowerCase(c)){
				case 'a':
					return 10;
				case 'b':
					return 11;
				case 'c':
					return 12;
				case 'd':
					return 13;
				case 'e':
					return 14;
				case 'f':
					return 15;
				default:
					System.out.println("Char " + c + " not known to makeDec()!");
					return -1;
			}
		}
	}
	public static void main(String[] args){
		if(isHexString(args[0])){
			System.out.println(hex2int(args[0]));
		} else {
			System.out.println("Plase provide a hex String");
		}
	}

}
