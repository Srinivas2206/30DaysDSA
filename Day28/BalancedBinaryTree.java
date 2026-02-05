package Day28;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;
        int l = dfs(root.left);
        if (l == -1)
            return -1;
        int r = dfs(root.right);
        if (r == -1)
            return -1;

        if (Math.abs(l - r) > 1)
            return -1;

        return 1 + Math.max(l, r);
    }
}
