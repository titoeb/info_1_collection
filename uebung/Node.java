public class Node{
	private String State;
	private Node up;
	private Node down;
	public void SetState(String State){
		this.State = State;
	}
	public String ggedetState(){
		return this.State;
	}
	public void setUpDown(Node up, Node down){
		this.up = up;
		this.down = down;
	}
	public Node getUp(){
		return this.up;
	}
	public Node getDown(){
		return this.down;
	}
	public Node(String State){
		this.State = State;
		this.up = null;
		this.down = null;
	}
}
