package org.mutation;

import java.util.*;
import java.util.LinkedList;

class Pair {
    Node node;
    int hd;

    public Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}
public class TreeAlgo {
    public void inorderTraversal(Node curr, ArrayList<Integer> inOrder) {
        if (curr == null)
            return;

        inorderTraversal(curr.left, inOrder);
        inOrder.add(curr.data);
        inorderTraversal(curr.right, inOrder);
    }
    public void postorderTraversal(Node curr, ArrayList<Integer> postOrder) {
        if (curr == null)
            return;

        postorderTraversal(curr.left, postOrder);
        postorderTraversal(curr.right, postOrder);
        postOrder.add(curr.data);

    }
    public void preorderTraversal(Node curr, ArrayList<Integer> preOrder) {
        if (curr == null)
            return;

        preOrder.add(curr.data);
        preorderTraversal(curr.left, preOrder);
        preorderTraversal(curr.right, preOrder);
    }

    public void levelOrder(Node root, List<Integer> levelOrder) {
        Queue<Node> queue = new LinkedList<>();

        if(root == null) return;

        queue.offer(root);
        while(!queue.isEmpty()){

            if(queue.peek().left != null)
                queue.offer(queue.peek().left);

            if(!queue.isEmpty() && queue.peek().right != null)
                queue.offer(queue.peek().right);
            if (!queue.isEmpty())
                levelOrder.add(queue.poll().data);
        }
    }

    public int maxDepth(Node root) {
        if(root == null) return 0;

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return 1 + Math.max(lh, rh);
    }

    public ArrayList<Integer> topView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            map.computeIfAbsent(hd, k -> temp.data);
            if(temp.left != null) {

                q.add(new Pair(temp.left, hd - 1));
            }
            if(temp.right != null) {

                q.add(new Pair(temp.right, hd + 1));
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public ArrayList<Integer> bottomView(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<Pair>();
        q.add(new Pair(root, 0));
        while(!q.isEmpty()) {
            Pair it = q.remove();
            int hd = it.hd;
            Node temp = it.node;
            map.put(hd, temp.data);
            if(temp.left != null) {
                q.add(new Pair(temp.left, hd - 1));
            }
            if(temp.right != null) {
                q.add(new Pair(temp.right, hd + 1));
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }
    public int countNodes(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root == null) return 0;
        queue.offer(root);
        int count = 0;
        while(!queue.isEmpty()){
            int queueSize = queue.size();
            count += queueSize;
            for(int i = queue.size(); i > 0; i--){
                if(!queue.isEmpty() && queue.peek().left != null) queue.offer(queue.peek().left);
                if(!queue.isEmpty() && queue.peek().right != null) queue.offer(queue.peek().right);
                queue.poll();
            }
        }
        return count;
    }
    public int widthOfBinaryTree(Node root) {
        LinkedList<Pair> q = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        if(root == null) return 0;
        q.addLast(new Pair(root,0));
        while(!q.isEmpty())
        {
            int size = q.size();
            max = Math.max(max, (q.getLast().hd - q.getFirst().hd + 1));

            for(int i = 0; i < size; i++)
            {
                Pair element = q.removeFirst();
                if(element.node.left != null)
                    q.addLast(new Pair(element.node.left,2 * element.hd));
                if(element.node.right != null)
                    q.addLast(new Pair(element.node.right,2 * element.hd + 1));
            }
        }
        return max;
    }

}
