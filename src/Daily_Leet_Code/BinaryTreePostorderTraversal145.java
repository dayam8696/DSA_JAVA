//package Daily_Leet_Code;
//
//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
//public class BinaryTreePostorderTraversal145 {
//    public static void main(String[] args) {
//
//    }
//    public List<Integer> postorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<>();
//        helperPostOrder(root , result);
//        return result;
//    }
//
//    private void helperPostOrder(TreeNode root, List<Integer> result) {
//        if (root!=null){
//            helperPostOrder(root.left ,result);
//            helperPostOrder(root.right , result);
//            result.add(root.val);
//        }
//    }
//}
