package com.leetcode.practice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

 // Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

public class BinaryTreeBFS {

    public List<List<Integer>> levelOrder(TreeNode root) {
        //make a queue
        //while loop until queue is empty
        //insert the root node
        //pop the queue store in list
        //if it is having left right node push to queue
        if(root==null) return new ArrayList<>();
        LinkedList<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        queue.push(root);
        while(!queue.isEmpty()){
            List<Integer> treenode = new ArrayList<>();
            int count =0;
            int end =queue.size();
            while(count<end) {
                TreeNode t = queue.pollLast() ;
                treenode.add(t.val);
                if(t.left!=null)
                    queue.push(t.left);
                if(t.right!=null)
                    queue.push(t.right);
                count++;
            }
            result.add(treenode);
        }
        return result;
    }
}
