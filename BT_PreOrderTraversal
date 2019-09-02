import java.util.ArrayList;
import java.util.List;

public class BT_PreOrderTraversal {
	TreeNode test = new TreeNode(1);
	Solution leet = new Solution();
	class Solution {
	 public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		result = traverse(result,root);
		
	       return result;
	  }
	 public List<Integer> traverse(List<Integer> list, TreeNode root) {
		 TreeNode runner = root;
		 if (root == null) {
			 return list;
		 } else {
			
			 list.add(root.val);
			 if (root.left != null) {
				 runner = runner.left;
			 } else {
				 runner = runner.right;
			 }
			 return traverse(list,runner);
		 }
		
	 }
	}
}
