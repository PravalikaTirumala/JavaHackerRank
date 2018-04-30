/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:*/

    class Node {
        int data;
        Node left;
        Node right;
        
        public Node(int data){
        	this.data = data;
        	left =null;
        	right =null;
        }
     }
   
     public class BinarySearchTree{
    	 Node root;
    	// boolean res=false;
     
    	 @SuppressWarnings("static-access")
		public static void main(String [] args){
    		 BinarySearchTree bt =new BinarySearchTree();
    		bt.insert(bt.root, 6); 
    		bt.insert(bt.root, 9); 
    		bt.insert(bt.root, 10); 
    		print(bt.root);
    		checkBST(bt.root);
    	 }
     
    	
    private static void print(Node root2) {
			// TODO Auto-generated method stub	
    	if(root2== null)
    		System.out.println("tree is empty");
    	else{
    		System.out.println(root2.data);
    		if(root2.left!= null)
    			print(root2.left);
    		if(root2.right != null)
    			print(root2.right);
    		
    	}
		}

	
    private static void insert(Node r, int val) {
			// TODO Auto-generated method stub	
    	if(r ==null){
    		r.data= val;
    	}
    	else{
    		if(val < r.data){
    			if(r.left == null){
    				r.left =new Node(val);
    			}
    			else{
    				insert(r.left, val);
    			}
    		}
    		if(val > r.data){
    			if(r.right == null){
    				r.right =new Node(val);
    			}
    			else{
    				insert(r.right, val);
    			}
    		}
    		
    		
    	}
			
		}

	public static boolean checkBST(Node root) {
		boolean res= false;
		if(root ==null)
         return res;
        else{
            
            if(root.left != null){
            if(root.left.data == root.data)
                return res;
                else if(root.left.data > root.data)
                    return res;
                    else{
                        checkBST(root.left);
                    }
            }
             if(root.right != null){
            if(root.right.data == root.data)
                return false;
                else if(root.right.data > root.data)
                    return false;
                    else{
                        checkBST(root.right);
                    }
            }
            
        }
		res=true;
		return res;
     
     
    }
  }
