package Trees.DFS;

public class MaxDepthORHeight {
      public class TreeNode {
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

          public int maxDepth(TreeNode root) {
              if(root==null){
                  return 0 ;
              }
              int leftheight = maxDepth(root.left);
              int rightheight= maxDepth(root.right);
              return Math.max(leftheight,rightheight)+1;
          }

  }

}

