import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	
		int val;
		int depth;
		int depthToBottom;
		
		  TreeNode left;
		  TreeNode right;
		  
		  TreeNode tree_head;
		  TreeNode root;
		  
		   List<Integer> result;
		 TreeNode(int x) { 
			 val = x; 
			 
		}
		 
		/*public String toString() {
			//return "node: val -> " + this.val + " : L ->" + this.left + ": R-> " + this.right + "]\n";
			//return "  " + this.val + "\n / \\\n" + this.left + " " + this.right;
		}*/
		 public void details() {
			 System.out.println("\n *********");
			 System.out.println("NODE VALUE     :  " + this.val);
			 System.out.println("ADDR -> THIS     :  " + this);
			 System.out.println("ADDR -> TREE_HEAD    :  " + this.tree_head);
			 System.out.println("DEPTH     :  " + this.depth);
			 System.out.println("DEPTH_TO_BOTTOM    :  " + this.depthToBottom);
			 System.out.println("ADDR -> LEFT    :  " + this.left);
			 System.out.println("ADDR -> RIGHT     :  " + this.right);
			 System.out.println("LIST -> RESULT    :  " + this.result);
		 }
		 
		 void findMaxDepth(int depth) {
			 this.depth = depth;
			 
			 this.result = this.tree_head.result;
			 this.result.add(this.val);
			 
			 if (this.depth > this.tree_head.depthToBottom) {
				 this.tree_head.depthToBottom = this.depth;
			 }
			 this.details();
			 
			 boolean leftNull = this.left == null;
			 boolean rightNull = this.right == null;
			 
			 if (leftNull && rightNull) {
				 System.out.println("Both left and right are null... exiting...");
				 return;
			 }
			 if (!leftNull) {
				 this.left.setHead(this.tree_head);
				 this.left.findMaxDepth(depth + 1);
			 }
			 if (!rightNull) {
				 this.right.setHead(this.tree_head);
				 this.right.findMaxDepth(depth + 1);
			 }
		 }

		void setHead(TreeNode target) {
			// TODO Auto-generated method stub
			this.tree_head = target;
		}
		
		void setList(ArrayList<Integer> list) {
			this.result = list;
		}
		void setDepth(int depth) {
			// TODO Auto-generated method stub
			this.depth = depth;
		}
		void setLeft(TreeNode target) {
			// TODO Auto-generated method stub
			this.left = target;
		}
		void setRight(TreeNode target) {
			// TODO Auto-generated method stub
			this.right = target;
		}
	
 }

