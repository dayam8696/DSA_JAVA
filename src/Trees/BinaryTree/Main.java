package Trees.BinaryTree;

import Trees.BST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner =new Scanner(System.in);
//        BinaryTree tree = new BinaryTree();
//        tree.populate(scanner);
//        tree.prettyDisplay();
        BST tree = new BST();
        int [] nums = {5,4,1,8,9,2,7,10,6,3};
        tree.populate(nums);
        tree.display();
      }
}
