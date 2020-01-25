public class DayTrader {
	public static final String BUY = "1";
	public static final String SELL = "2";
	public static final String NONE = "3";
 
	public DayTrader(double p) {
		this.cur_price = p;
		this.cur_node = new Node("Start");
		Node n1_1 = new Node(NONE);
		Node n1_2 = new Node(NONE);
		Node n1_3 = new Node(NONE);
		Node n1_4 = new Node(BUY);
		Node n2_1 = new Node(NONE);	
		Node n2_2 = new Node(NONE);
		Node n2_3 = new Node(NONE);
		Node n2_4 = new Node(SELL);

		// Chain them in!
		cur_node.setUpDown(n1_1, n2_1);
		n1_1.setUpDown(n2_1, n1_2);
		n1_2.setUpDown(n2_1, n1_3);
		n1_3.setUpDown(n1_4, n1_3);
		n1_4.setUpDown(n2_2, n1_1);	
		n2_1.setUpDown(n2_2, n1_1);
		n2_2.setUpDown(n2_3, n1_2);
		n2_3.setUpDown(n2_3, n2_4);
		n2_4.setUpDown(n2_1, n1_2);
		
	}

	// setter ----------------------------------------------
	public void setPrice(double p) {
		if(p > this.cur_price) cur_node = cur_node.getUp();
		else cur_node = cur_node.getDown();
		this.cur_price = p;
	}
	public String toString(){
		if(cur_node.getState() == DayTrader.BUY) return "buy";
		if(cur_node.getState() == DayTrader.SELL) return "sell";
		else return "";
	}

	// private ---------------------------------------------
	private Node cur_node;
	private double cur_price;

}
