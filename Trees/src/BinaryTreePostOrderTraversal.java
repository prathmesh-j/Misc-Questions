import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by prathmeshjakkanwar on 4/11/17.
 */
public class BinaryTreePostOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();

        System.out.println(getPostOrderTraversalIterative(root));
    }

    public static List<Integer> getPostOrderTraversalIterative(TreeNode root) {

        LinkedList<Integer> result = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

            stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode n = stack.pop();
            result.addFirst(n.val);

            if(n.left!=null){
                stack.push(n.left);
            }

            if(n.right!=null){
                stack.push(n.right);
            }
        }
        return result;
    }
}
