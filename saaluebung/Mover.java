public class Mover{
	// current x_pos of the mover
	int x_pos = 0;

	// current y_pos of the mover
	int y_pos = 0;

	// direction the mover is looking towards:
		// 0: 0 degrees
		// 1: 90 degrees
		// 2: 180 degrees
		// 3: 270 degrees
	int direction = 0;

	public Mover(int x_pos,int y_pos){
		this.x_pos = x_pos;
		this.y_pos = y_pos;
	}

	private void rotate_clockwise(){
		direction = (direction + 1) % 3;
	}
	private void rotate_counter_clockwise(){
		if(direction == 0) direction = 3;
		else direction--;
	}
	
	private void rotate(char dir){
		if(dir == 'U'){
			// rotate clockwise;
				rotate_clockwise();
		} else {
			if(dir == 'G'){
				// rotate counter-clockwise
				rotate_counter_clockwise();
			} else {
			throw new IllegalArgumentException("Only \'U\' or \'G\' are valid for dir not " + dir);
			}
		}
	}

	private void move(){
		  switch(direction){ 
			case 0: 
			    y_pos--;
			    break; 
			case 1: 
			    x_pos++;
			    break; 
			case 2: 
			    y_pos++;
			    break; 
			case 3: 
			    x_pos--;
			    break; 
			default: 
			    throw new IndexOutOfBoundsException("For internal variable direction only values 0-3 are allowed but value was" + direction); 
        	} 

	}

	public void move_along(char[] z){
		for(int i = 0; i < z.length; i++){
			rotate(z[i]);
			move();
		}
	}

	public String give_pos(){
		return "X-Pos: " + Integer.toString(x_pos) + " Y-Pos: " + Integer.toString(y_pos);
	}

	public static void main(String args[]){
		if(args.length < 1 || args.length > 3){
			throw new IllegalArgumentException("Please prove three arguments consisting of the starting x position, the starting y position and a string containing the rotations");
		}
		Mover test_mover = new Mover(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		for(int i = 0; i < args[2].length(); i++){
			test_mover.rotate(args[2].charAt(i));
			test_mover.move();
		}

		System.out.println(test_mover.give_pos());
		
	}
}
































