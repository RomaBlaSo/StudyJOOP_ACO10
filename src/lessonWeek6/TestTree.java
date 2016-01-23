package lessonWeek6;

import java.util.TreeSet;

public class TestTree {
    public static void main(String[] args) {

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(8);
        tree.add(6);
        tree.add(13);
        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(7);
        tree.add(10);
        tree.add(9);
        tree.add(15);
        tree.add(14);
        tree.findMin();
        tree.next(tree.findMinNode());
//        System.out.println(tree.contains(15));
//        System.out.println(tree.contains(13));
        tree.remove(13);

        //TreeSet<Integer> ttt = new TreeSet<>();

    }
}
