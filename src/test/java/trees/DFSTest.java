package trees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DFSTest {

    private TreeNode root;

    @BeforeEach
    void setUp() {
        //    3
        //    /\
        //   5  24
        //  / \   \
        // 23  7   4
        TreeNode node23 = new TreeNode(23, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node5 = new TreeNode(5, node23, node7);
        TreeNode node4 = new TreeNode(4, null, null);
        TreeNode node24 = new TreeNode(24, null, node4);
        root = new TreeNode(3, node5, node24);
    }

    @Test
    void preorder() {
        System.out.println("preorder");
        DFS.preorder(root);
    }

    @Test
    void inorder() {
        System.out.println("inorder");
        DFS.inorder(root);
    }

    @Test
    void postorder() {
        System.out.println("postorder");
        DFS.postorder(root);
    }
}