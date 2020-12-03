import com.company.BinaryTree;
import com.company.DoubleLinkedList;
import com.company.Node;
import com.company.Sort;


public class Tree {
    public static void main(String[] args)
    {
        Node node = new Node(2);
        BinaryTree bt = createBinaryTree();
        //System.out.println(bt.countFromRoot());
        System.out.println("Total: " + bt.countSumFromRoot());
        bt.printInOrderFromRoot();

    }
    private static BinaryTree createBinaryTree(){
        BinaryTree bt = new BinaryTree();

        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);

        return bt;
    }
}
