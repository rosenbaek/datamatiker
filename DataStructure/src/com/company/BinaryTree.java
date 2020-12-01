package com.company;

public class BinaryTree {
    Node root;
    int counter;
    int sum;

    public void add(int value){
        root = addRecursive(root, value);
    }

    public int countFromRoot()
    {
        counter(root);
        return counter;
    }

    private Node counter(Node node) {
        if(node.left != null) {
            counter(node.left);
        }
        counter ++;
        if(node.right != null) {
            counter(node.right);
        }
        return node;
    }

    public int countSumFromRoot()
    {
        countSum(root);
        return sum;
    }

    private Node countSum(Node node) {
        if(node.left != null) {
            countSum(node.left);
        }
        System.out.println("Node value: " + node.value);
        sum += node.value;
        if(node.right != null) {
            countSum(node.right);
        }
        return node;
    }
    public void printInOrderFromRoot(){
        printInorder(root);
        //printPostOrder(root);
        //printPreOrder(root);
    }

    private void printInorder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.value + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

    private void printPreOrder(Node node)
    {
        if (node == null)
            return;

        /* then print the data of node */
        System.out.print(node.value + " ");

        /* first recur on left child */
        printInorder(node.left);

        /* now recur on right child */
        printInorder(node.right);
    }

    private void printPostOrder(Node node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* now recur on right child */
        printInorder(node.right);

        /* then print the data of node */
        System.out.print(node.value + " ");
    }



    private Node addRecursive(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }
        if(node.value < value) {
            node.left = addRecursive(node.left, value);
        }
        else if(node.value > value) {
            node.right = addRecursive(node.right, value);
        }
        return node;
    }
}
