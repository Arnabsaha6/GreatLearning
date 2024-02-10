import com.sun.source.util.SourcePositions;

import java.util.HashSet;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    void insert(int data) {
        root = insertUtil(root, data);
    }

    Node insertUtil(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertUtil(root.left, data);
        } else if (data > root.data) {
            root.right = insertUtil(root.right, data);
        }

        return root;
    }

    void findPairWithGivenSum(int sum) {
        HashSet<Integer> set = new HashSet<>();
        findPairUtil(root, sum, set);
    }

    void findPairUtil(Node root, int sum, HashSet<Integer> set) {
        if (root == null) {
            return;
        }

        if (set.contains(sum - root.data)) {
            System.out.println("Pair found: (" + (sum - root.data) + ", " + root.data + ")");
        }
        set.add(root.data);
        findPairUtil(root.left, sum, set);
        findPairUtil(root.right, sum, set);


    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter the node values:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            tree.insert(value);
        }

        System.out.print("Enter the sum to find pairs: ");
        int sum = scanner.nextInt();

        tree.findPairWithGivenSum(sum);
    }
}
