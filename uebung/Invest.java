public class Invest{
	public static void main(String[] args){
		double capital = 10000.0;
		double shares = 0.0;		
		double price = 0.0;
		int i = 1;
		DayTrader trader = null;
		System.out.println("period    price      cash     shares    value  trade");
		System.out.println("---------------------------------------------------------------");

		while (!StdIn.isEmpty()) {
		    price = StdIn.readDouble();
		    if (trader == null)
			trader = new DayTrader(price);

		    else {
			trader.setPrice(price);
			if(trader.toString() == "buy"){
				// BUY
				shares += capital / price;
				capital = 0.0;
			} 
			if(trader.toString() == "sell"){
				// SELL
				capital += shares * price;
				shares = 0.0;
			} 
		    }
		    System.out.printf("%5d  %8.2f  %8.2f  %8.2f  %8.2f %s\n", i, price, capital, shares, shares * price + capital,  trader.toString());
		    i++;
		}
		if (shares > 0){
			capital += shares * price;
			shares = 0.0;
		}
		System.out.println("Made a profit of " + (capital - 10000.0) + " Euros!");
	}
}
