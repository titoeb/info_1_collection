public class drawcurve2{
	public static void main(String[] args){
		int y = StdIn.readInt();
		String input = StdIn.readString();
		
		int pos_x = 0, pos_y = 0;
		int rot = 1;

		// Simulation run
		int max_x = 0, min_x = 0, max_y = 0, min_y = 0;
		char cur_char;
		for(int i = 0; i < input.length(); i++){
			cur_char = input.charAt(i);

			switch (cur_char){
				case 'L':
					// Rotate left
					if(rot > 0) rot--;
					else rot = 3;
				break;

				case 'R':
					// Rotate right
					rot = (rot + 1) % 4;
					break;
				case 'F':
					switch (rot){
						case 0:
							// Move up!
							pos_y++;
							break;
						case 1:
							// Move right
							pos_x++;
							break;
						case 2:
							// Move down
							pos_y--;
							break;
						case 3:
							// Move left
							pos_x--;
							break;
				}
			}
			// Update max
			max_x = Math.max(max_x, pos_x);
			min_x = Math.min(min_x, pos_x);
			max_y = Math.max(max_y, pos_y);
			min_y = Math.min(min_y, pos_y);
		}

		// Set Box accordingly
		StdDraw.setXscale(min_x -1, max_x + 1);
		StdDraw.setYscale(min_y - 1, max_y + 1);

		// Draw 
		pos_x = 0;
		pos_y = 0;
		rot = 1;
		for(int i = 0; i < input.length(); i++){
			cur_char = input.charAt(i);

			switch (cur_char){
				case 'L':
					// Rotate left
					if(rot > 0) rot--;
					else rot = 3;
				break;

				case 'R':
					// Rotate right
					rot = (rot + 1) % 4;
					break;
				case 'F':
					switch (rot){
						case 0:
							// Move up!
							pos_y++;
							StdDraw.line(pos_x, pos_y - 1, pos_x, pos_y);
							break;
						case 1:
							// Move right
							pos_x++;
							StdDraw.line(pos_x - 1, pos_y, pos_x, pos_y);
							break;
						case 2:
							// Move down
							pos_y--;
							StdDraw.line(pos_x, pos_y + 1, pos_x, pos_y);
							break;
						case 3:
							// Move left
							pos_x--;
							StdDraw.line(pos_x + 1, pos_y, pos_x, pos_y);
							break;
				}
			}
		}
	}
}
