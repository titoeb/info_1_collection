public class SortedList extends list{

	public SortedList(double data){
		super(data);
	}
	public SortedList(){
		super();
	}
	public void append(double data){
		node insert = new node(data, null);
		node before = super.first;
		
		if (before == null){
			 super.first = insert;
			 return;
		}
		if (before.get_next() == null){
			if(before.get_data() < data){
				before.set_next(insert);
			} else {
				insert.set_next(before);
				super.first = insert;
			}
		} else {
			node after = before.get_next();
			while(after != null && after.get_data() < data){
				after = after.get_next();
				before = before.get_next();
			}
			insert.set_next(after);
			before.set_next(insert);

		}
	}

}
