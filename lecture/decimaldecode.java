public class decimaldecode{
	public static void main(String[] args){
		int z = 0; // Initialllize accumualtor
		char c;
		do {
			c = StdIn.readChar();
			if ('0' <= c && c <= '9'){
				z *= 10;
				z = z + (c - '0'); 
				if (c == '\n'){
					break;
				}
			}		
		} while(c != '\n');
		System.out.println(z);
	}	
}
