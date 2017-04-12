import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by prathmeshjakkanwar on 4/11/17.
 */
public class BinaryTreePreOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();

        System.out.println(getPreOrderTraversalIterative(root));
    }

    public static ArrayList<Integer> getPreOrderTraversalIterative(TreeNode root) {

        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            result.add(n.val);

            if(n.right!=null){
                stack.push(n.right);
            }

            if(n.left!=null){
                stack.push(n.left);
            }
        }
        return result;
    }
}
