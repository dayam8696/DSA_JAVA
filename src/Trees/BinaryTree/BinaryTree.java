package Trees.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    public BinaryTree(){

    }
    public static class Node{
        int value ;
        Node left;
        Node right;
        public Node(int value){
            this.value = value;
        }


    }
    public Node root;

    public void populate (Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want to Enter the left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of left of "+node.value);
            int value =scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to Enter the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of right of "+node.value);
            int value =scanner.nextInt();
            node.right = new Node(value);
            populate(scanner,node.right);
        }
    }
}
