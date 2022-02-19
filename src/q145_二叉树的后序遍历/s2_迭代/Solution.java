package q145_二叉树的后序遍历.s2_迭代;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node.left != null) {
                stack.push(node.left);
            }//和传统先序遍历不一样，先将左结点入栈
            if (node.right != null) {
                stack.push(node.right);
            }//后将右结点入栈
            res.add(0, node.val);                        //逆序添加结点值
        }
        return res;
    }
}
