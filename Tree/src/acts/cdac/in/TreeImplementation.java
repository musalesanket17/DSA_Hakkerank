package acts.cdac.in;

public class TreeImplementation {
 
	 static class Root{
		  
		 int data;
		 Root left;
		 Root right;
		public Root(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
		
		public Root() {}

		 
	 }
	 
	 private Root root;

	public TreeImplementation() {
		
		this.root = null;
	}
	
	public void add(int ele) {
		
		 
		 Root nn = new Root(ele);
		 
		 if(root == null) {
			  
			root = nn;
		 }
		 else {
			 Root trav = root;
			 while(true) {
				  
				 if(ele < trav.data) {
					  
					 if(trav.left != null) {
						 trav = trav.left;
					 }
					 else {
						  trav.left = nn;
						  break;
					 }
				 }
				 else{//if(ele >= trav.data)
					  
					 if(trav.right != null) {
						 trav = trav.right;
					 }
					 else {
						  trav.right= nn;
						  break;
					 }
				 }
 
			 }
		 }
	}
	
	public void printPreorder(Root root) {
		 if(root == null)
			 return;
		 else {
			  
			 System.out.print(root.data+" ");
			 printPreorder(root.left);
			 printPreorder(root.right);
		 }
	}
	public void printPreorder() {
		  System.out.println("****PreOrder****");

		   printPreorder( root) ;

	}
	public void printInorder(Root root) {

		if(root == null)
			return;
		else {
			
			printInorder(root.left);
			System.out.print(root.data+" ");
			printInorder(root.right);
		}
	}
	public void printInorder() {
		System.out.println();
		  System.out.println("****InOrder****");

		printInorder( root) ;
		
	}
	public void printPostorder(Root root) {

		if(root == null)
			return;
		else {
			
			printPostorder(root.left);
			printPostorder(root.right);
			System.out.print(root.data+" ");
		}
	}
	public void printPostorder() {
		System.out.println();
		  System.out.println("****PostOrder****");

		printPostorder( root) ;
		System.out.println();
		
	}
	public void deleteAll(Root trav) {
		 
		 if(trav == null)
			 return;
		 else {
			  
			 deleteAll(trav.left);
			 deleteAll(trav.right);
			 
			 trav.left = null;
			 trav.right = null;
			 trav = null;
		 }
	}
	public void deleteAll() {
		deleteAll(root);
		root = null;
	}
	
	public int height(Root trav) {
		 int max;
		if(trav == null)
			return -1;
		else {
			 int hl = height(trav.left);
			 int hr = height(trav.right);
			  max = hl > hr ? hl : hr ;
			 
		}
		return max+1;
	}
	public int height() {
		int max= height(root);
		return max;
	}
	
	public Root binarySerch(int key) {
		 
		 Root trav = root;
		 while(trav != null) {
		 if(trav.data == key)
			 return trav;
		 if(trav.data > key )
			 trav = trav.left;
		 else
			 trav = trav.right;
		 
		 }
		 return null;
	}
	
	public void deleteNode(int ele) {
		 Root parent = null,trav = root;
		 if(root == null) {
			 return;
		 }
		 if(binarySerch(ele) != null) {
			  
			  if(trav.left != null && trav.right != null) {
				   
				  Root succ = trav.right;
				  
				  while(succ.left != null) {
					  parent = succ;
					  succ = succ.left;
				  }
				  trav.data = succ.data;
				  trav = succ;
			  }
		 }
		 if(trav.left == null) {
			  if(trav == root) {
				  root = trav.right;
			  }
			  else if(trav == parent.left) {
				  parent.left = trav.right;
				
			  }
			  else {
				  parent.right = trav.right;
			  }
		 }
		 if(trav.right == null) {
			 if(trav == root) {
				 root = trav.left;
			 }
			 else if(trav == parent.left) {
				 parent.left = trav.left;
				 
			 }
			 else {
				 parent.right = trav.left;
			 }
		 }
		 
	}

	 public static void main(String[] args) {
		 TreeImplementation tree = new TreeImplementation();
		 tree.add(50);
		 tree.add(30);
		 tree.add(10);
		 tree.add(90);
		 tree.add(100);
		 tree.printPreorder();
		 tree.printInorder();
//		 tree.deleteAll();
		 tree.printPostorder();
		 System.out.println("Height : "+ tree.height());
		 try {
			System.out.println(tree.binarySerch(10).data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			
		}
		System.out.println("Enter Node which you want to delete :");
		tree.deleteNode(50);
		System.out.println("After Deletion PrintAll : ");
		tree.printInorder();
		 

		 
	}
	 
}
