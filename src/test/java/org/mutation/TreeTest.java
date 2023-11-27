package org.mutation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class TreeTest {
    @Test
    public void inorderTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);

        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> inorder = new ArrayList<>();
        treeAlgo.inorderTraversal(node, inorder);
        Assertions.assertEquals(inorder, Arrays.asList(11, 10, 90));
    }

    @Test
    public void inorderTest2() {
        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> inorder = new ArrayList<>();
        treeAlgo.inorderTraversal(null, inorder);
        Assertions.assertEquals(inorder, new ArrayList<>());
    }

    @Test
    public void preorderTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);

        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> preorder = new ArrayList<>();
        treeAlgo.preorderTraversal(node, preorder);
        Assertions.assertEquals(preorder, Arrays.asList(10, 11, 90));
    }

    @Test
    public void preorderTest2() {
        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> preorder = new ArrayList<>();
        treeAlgo.preorderTraversal(null, preorder);
        Assertions.assertEquals(preorder, new ArrayList<>());
    }

    @Test
    public void postorderTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);

        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> postorder = new ArrayList<>();
        treeAlgo.postorderTraversal(node, postorder);
        Assertions.assertEquals(postorder, Arrays.asList(11, 90, 10));
    }

    @Test
    public void postorderTest2() {
        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> postorder = new ArrayList<>();
        treeAlgo.preorderTraversal(null, postorder);
        Assertions.assertEquals(postorder, new ArrayList<>());
    }

    @Test
    public void levelOrderTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        node.left.left = new Node(91);

        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> levelOrder = new ArrayList<>();
        treeAlgo.levelOrder(node, levelOrder);
        Assertions.assertEquals(levelOrder, Arrays.asList(10, 11, 90, 91));
    }

    @Test
    public void levelOrderTest2() {
        TreeAlgo treeAlgo = new TreeAlgo();
        ArrayList<Integer> levelOrder = new ArrayList<>();
        treeAlgo.levelOrder(null, levelOrder);
        Assertions.assertEquals(levelOrder, new ArrayList<>());
    }

    @Test
    public void maxDepthTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        node.left.left = new Node(91);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.maxDepth(node),3);
    }

    @Test
    public void maxDepthTest2() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.maxDepth(node), 2);
    }

    @Test
    public void maxDepthTest3() {
        Node node = new Node(10);
        node.left = new Node(11);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.maxDepth(node), 2);
    }

    @Test
    public void maxDepthTest4() {
        Node node = new Node(10);
        node.right = new Node(90);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.maxDepth(node), 2);
    }

    @Test
    public void maxDepthTest5() {
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.maxDepth(null), 0);
    }

    @Test
    public void topViewTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        node.left.left = new Node(91);
        node.left.right = new Node(97);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.topView(node),new ArrayList<>(Arrays.asList(91, 11, 10, 90)));
    }

    @Test
    public void topViewTest2() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.topView(node),new ArrayList<>(Arrays.asList(11, 10, 90)));
    }

    @Test
    public void topViewTest3() {
        Node node = new Node(10);
        node.left = new Node(11);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.topView(node),new ArrayList<>(Arrays.asList(11, 10)));
    }

    @Test
    public void topViewTest4() {
        Node node = new Node(10);
        node.right = new Node(90);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.topView(node),new ArrayList<>(Arrays.asList(10, 90)));
    }

    @Test
    public void topViewTest5() {
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.topView(null), new ArrayList<>());
    }

    @Test
    public void bottomViewTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        node.left.left = new Node(91);
        node.left.right = new Node(97);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.bottomView(node),new ArrayList<>(Arrays.asList(91, 11, 97, 90)));
    }

    @Test
    public void bottomViewTest2() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.bottomView(node),new ArrayList<>(Arrays.asList(11, 10, 90)));
    }

    @Test
    public void bottomViewTest3() {
        Node node = new Node(10);
        node.left = new Node(11);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.bottomView(node),new ArrayList<>(Arrays.asList(11, 10)));
    }

    @Test
    public void bottomViewTest4() {
        Node node = new Node(10);
        node.right = new Node(90);
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.bottomView(node),new ArrayList<>(Arrays.asList(10, 90)));
    }

    @Test
    public void bottomViewTest5() {
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.bottomView(null), new ArrayList<>());
    }

    @Test
    public void countNodesTest1() {
        Node node = new Node(10);
        node.left = new Node(11);
        node.right = new Node(90);
        node.left.left = new Node(91);

        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.countNodes(node), 4);
    }

    @Test
    public void countNodesTest2() {
        Node node = new Node(10);

        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.countNodes(node), 1);
    }

    @Test
    public void countNodesTest3() {
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.countNodes(null), 0);
    }

    @Test
    public void maxWidthTest1() {
        Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(2);
        node.left.left = new Node(5);
        node.left.right = new Node(3);
        node.right.right = new Node(9);

        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.widthOfBinaryTree(node), 4);
    }

    @Test
    public void maxWidthTest2() {
        Node node = new Node(1);
        node.left = new Node(3);
        node.right = new Node(2);
        node.right.right = new Node(9);

        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.widthOfBinaryTree(node), 2);
    }

    @Test
    public void maxWidthTest3() {
        TreeAlgo treeAlgo = new TreeAlgo();
        Assertions.assertEquals(treeAlgo.widthOfBinaryTree(null), 0);
    }
}
