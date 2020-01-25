public class bike{
	private int speed, gears;
	public bike(){
		this.speed = 0;
		this.gears = 1;
	}
	public bike(int speed, int gears){
		this.speed = speed;
		this.gears = gears;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void SetGears(int gears){
		this.gears = gears;
	}
}
