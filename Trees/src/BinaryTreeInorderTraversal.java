import apple.laf.JRSUIUtils;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Given a binary tree, return the inorder traversal of its nodes' values.

 For example:
 Given binary tree [1,null,2,3],
 1
  \
   2
  /
 3
 return [1,3,2].

 */
public class BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = TreeNode.getTree();

        System.out.println(getInorderTraversalIterative(root));
    }


    public static ArrayList<Integer> getInorderTraversalIterative(TreeNode root) {

        if(root == null)
            return null;

        ArrayList<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(current!=null || !stack.isEmpty()) {
            while (current!=null){
                stack.push(current); // Push all left nodes to the stack
                current = current.left;
            }

            current = stack.pop(); // get the node and make it the current node
            result.add(current.val); // Add to the result
            current = current.right; // move to the right node
        }
        return result;
    }
}
