package RandomBinaryTree;

public class Node {

    int value;
    int height;
    Node left;
    Node right;

    public Node(int newvalue){
        left = null;
        right = null;
        value = newvalue;

        System.out.printf("%s has been inserted in the BST tree \n", newvalue);
    }

    public Node()
    {
        left = null;
        right = null;
        value = 0;
    }


}
