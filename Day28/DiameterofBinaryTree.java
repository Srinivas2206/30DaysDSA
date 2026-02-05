package Day28;

public class DiameterofBinaryTree {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root) {
        if (root == null)
            return 0;
        int l = dfs(root.left);
        int r = dfs(root.right);
        max = Math.max(max, l + r);
        return 1 + Math.max(l, r);
    }
}
