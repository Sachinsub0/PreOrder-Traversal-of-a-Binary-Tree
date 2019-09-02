import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BT_PreOrderTraversal program = new BT_PreOrderTraversal();
		program.test.setDepth(1);
		program.test.setHead(program.test);
		program.test.setList(new ArrayList<Integer>());
		program.test.left = new TreeNode(2);
		program.test.left.setHead(program.test.left);
		program.test.left.left = new TreeNode(3);
		program.test.left.left.setHead(program.test.left.left);
		program.test.left.left.right = new TreeNode(4);
		program.test.left.left.right.setHead(program.test.left.left.right);
		program.test.right = new TreeNode(5);
		program.test.right.setHead(program.test.right);
		program.test.right.left = new TreeNode(6);
		program.test.right.left.setHead(program.test.right.left);
		program.test.right.right = new TreeNode(7);
		program.test.right.right.setHead(program.test.right.right);
		
		program.test.findMaxDepth(1);
		program.test.details();
		//System.out.println(program.leet.preorderTraversal(program.test));
	}

}
