package Trees.DFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class SD {




    class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public class Codec {

        // Serialize the tree to a single string
        public static String serialize(TreeNode root) {
            List<String> list = new ArrayList<>();
            helper(root, list);
            return String.join(",", list); // Convert list to a comma-separated string
        }

        private static void helper(TreeNode node, List<String> list) {
            if (node == null) {
                list.add("null");
                return;
            }
            list.add(String.valueOf(node.val));
            helper(node.left, list);
            helper(node.right, list);
        }

        // Deserialize the string back to a tree
        public TreeNode deserialize(String data) {
            List<String> list = new LinkedList<>(Arrays.asList(data.split(",")));
            return helper2(list);
        }

        private TreeNode helper2(List<String> list) {
            if (list.isEmpty()) return null;

            String val = list.remove(0); // Remove from front

            if (val.equals("null")) {
                return null;
            }

            TreeNode node = new TreeNode(Integer.parseInt(val));
            node.left = helper2(list);
            node.right = helper2(list);
            return node;
        }

        public static void main(String[] args) {
            // Creating a sample binary tree
//            TreeNode root = new TreeNode(1);
//            root.left = new TreeNode(2);
//            root.right = new TreeNode(3);
//            root.right.left = new TreeNode(4);
//            root.right.right = new TreeNode(5);
//
//            // Serialize the tree
//            String serialized = serialize(root);
//            System.out.println("Serialized: " + serialized);
//
//            // Deserialize the tree
//            TreeNode deserializedRoot = deserialize(serialized);
//            System.out.println("Deserialized Root: " + deserializedRoot.val);
//        }
        }
    }


}
