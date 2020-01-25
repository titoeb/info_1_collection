class BSTSort {
	private static BNode root;

	
	public BSTSort(){
		root = null;
	}   
	public static void insert(int key) {
		BNode node = new BNode(key, null,null);
		BNode parent = root;
		if (parent == null){
		    root = node;
		    return;
		}

		while (parent.leftChild != null || parent.rightChild != null){ 
		    if(node.key == parent.key){
			throw new IllegalArgumentException("BST already contains element with key " + node.key);
		    }else if(node.key < parent.key && parent.leftChild != null){
			parent = parent.leftChild;
		    }else if(node.key > parent.key && parent.rightChild != null){
			parent = parent.rightChild;
		    }else{
			break;
		    }
		}

		if (node.key < parent.key) parent.leftChild = node;
		else parent.rightChild = node;
	}
	public void show(){
		System.out.println("Key\tleft\tright");
		show_BNode_rec(root);
	}
	private void show_BNode_rec(BNode in){
		if(in != null){
			System.out.print(in.key + "\t");
			if(in.leftChild != null) System.out.print(in.leftChild.key + "\t");
			else System.out.print("Null\t");
			if(in.rightChild != null) System.out.print(in.rightChild.key + "\t");
			else System.out.print("Null\t");
			System.out.println();
			show_BNode_rec(in.leftChild);
			show_BNode_rec(in.rightChild);
		}
	}
	public static void main(String[] args){
		BSTSort test = new BSTSort();
		int[] testdata = {42, 47, 2, 15, 13, 55, 30, 26, 51, 20, 8, 36};
		for(int i = 0; i < testdata.length; i++){
			test.insert(testdata[i]);			
		}
		test.show();		
	} 
}
