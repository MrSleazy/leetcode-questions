package trees;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sorting.LeftBinarySearch;

/**
 * Depth first Search using Trees
 * Goes deep into 1 branch before exploring other branches - Vertical Searching
 */
public class DFS {

    private static Logger logger = LogManager.getLogger(LeftBinarySearch.class);

    static void preorder(TreeNode root) {
        if (root == null) return;

        visit(root);
        if (root.left != null) preorder(root.left);
        if (root.right != null) preorder(root.right);
    }

    static void inorder(TreeNode root) {
        if (root == null) return;

        if (root.left != null) inorder(root.left);
        visit(root);
        if (root.right != null) inorder(root.right);
    }

    static void postorder(TreeNode root) {
        if (root == null) return;

        if (root.left != null) postorder(root.left);
        if (root.right != null) postorder(root.right);
        visit(root);
    }

    private static void visit(TreeNode node) {
        // do whatever code required to visit node
        logger.info("Visited value {}", node.value);
    }
}
