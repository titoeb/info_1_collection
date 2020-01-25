public class list{
	protected node first = null;
	public list(double data){
		first = new node(data, null);
	}
	public list(){
		this.first = null;
	}

	public void append(double data){
		node insert = new node(data, null);
		if(first != null){
			node tmp = first;
			while(tmp.get_next() != null){
				tmp = tmp.get_next();
			}
			tmp.set_next(insert);
		} else {
			first = insert;
		}
	}
	public void remove_first(){
		if(first != null && first.get_next() != null) first = first.get_next();
	}

	public void remove_last(){
		if(first != null){
			node tmp = first;
			while(tmp.get_next() != null && tmp.get_next().get_next() != null){
				tmp = tmp.get_next();
			}
			tmp.set_next(null);
		}
	}

	public String toString(){
		String out = "";
		if(first != null){
			out = "The list currently contains: ";
			node tmp = first;
			while(tmp.get_next() != null){
				out +=  tmp.get_data() + " ";
				tmp = tmp.get_next();
			}
			
		} else {
			return "The list is empty";
		}
		return out;
	}
	public static void main(String[] args){
		list test = new list();
		SortedList test2 = new SortedList();
		System.out.println(test);
		for(int i = 0; i < 10; i++){
			test.append((int) (Math.random() * 100));
			test2.append((int) (Math.random() * 100));
		}
		System.out.println(test);
		test.remove_first();
		System.out.println(test);
		test.remove_last();
		System.out.println(test);

		System.out.println("Sorted List: ");
		System.out.print(test2);


	}
}
