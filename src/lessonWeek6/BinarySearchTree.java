package lessonWeek6;

import java.util.Comparator;
import java.util.Iterator;

public class BinarySearchTree<T extends Comparable> implements ITree<T>{

    private Node<T> root;
    private int size;
    private Iterator<T> iterator;

    @Override
    public boolean add(T t) {

        if (root == null) {
            root = new Node<>(t);
            size++;
            return true;
        }

        Node<T> iter = root;
        while (true) {
            int a = t.compareTo(iter.value);
            if (a < 0) {
                if (iter.leftChild == null) {
                    iter.leftChild = new Node<>(t, iter);
                    size++;
                    return true;
                } else {
                    iter = iter.leftChild;
                }
            } else if (a > 0) {
                if (iter.rightChild == null) {
                    iter.rightChild = new Node<>(t, iter);
                    size++;
                    return true;
                } else {
                    iter = iter.rightChild;
                }
            } else {
                return false;
            }
        }
    }

    private Node<T> binarySearch(T obj) {

        Node<T> iter = root;
        while (iter != null) {
            int compare = obj.compareTo(iter.value);
            if (compare < 0) {
                iter = iter.leftChild;
            } else if (compare > 0) {
                iter = iter.rightChild;
            } else {
                break;
            }
        }
        return iter;
    }

    @Override
    public boolean remove(T t) {

        Node<T> delete = binarySearch(t);
        if (delete == null){
            return false;
        }

        Node<T> lc = delete.leftChild, rc = delete.rightChild;
        Node<T> childNode = (lc == null && rc == null) ? null
                                : (lc == null ? rc : (rc == null ? lc : findMinNode(rc)));
        removeNode(delete, childNode);
        return true;

    }

    public void removeNode(Node<T> deletingNode, Node<T> childNode){

        if(deletingNode == root){
            root = childNode;
        } else if(deletingNode == deletingNode.parent.leftChild){
            deletingNode.parent.leftChild = childNode;
        } else {
            deletingNode.parent.rightChild = childNode;
        }

        size--;

    }

    @Override
    public boolean contains(T t) {
        Node<T> search = binarySearch(t);
        return search != null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T findMin() {
        Node<T> iter = root;
        while (iter.leftChild != null) {
            iter = iter.leftChild;
        }
        return iter.value;
    }

    public Node<T> findMinNode() {

        Node<T> iter = root;
        while (iter.leftChild != null) {
            iter = iter.leftChild;
        }
        return iter;

    }

    public Node<T> findMinNode(Node<T> firstNode) {

        Node<T> iter = firstNode;
        while (iter.leftChild != null) {
            iter = iter.leftChild;
        }
        return iter;

    }

    @Override
    public T findMax() {
        Node<T> iter = root;
        while (iter.rightChild != null) {
            iter = iter.rightChild;
        }
        return iter.value;
    }

    @Override
    public void clear() {

    }

    @Override
    public Iterator<T> iterator() {
        //return root.iterator();
        return iterator;
    }

    public boolean hasNext() {
        return true;
    }

    public Node<T> next(Node<T> firstNode) {

        System.out.println(firstNode.value);
        return null;
    }

    public class Node<E>{

        E value;
        Node<E> parent = null;
        Node<E> leftChild = null;
        Node<E> rightChild = null;

        public Node(E value) {
            this.value = value;
        }

        public Node(E value, Node<E> parent) {
            this.value = value;
            this.parent = parent;
        }

    }

}

//        return addRec(root, t);
//    public boolean addRec(Node<T> node, T t) {
//
//        int a = t.compareTo(node.value);
//        if (a == 0) {
//            return false;
//        }
//        if (a < 0) {
//            if (node.leftChild == null) {
//                node.leftChild = new Node<>(t);
//                return true;
//            } else {
//                return addRec(node.leftChild, t);
//            }
//        } else
//        {
//            if (node.rightChild == null) {
//                node.rightChild = new Node<>(t);
//                return true;
//            } else {
//                return addRec(node.rightChild, t);
//            }
//
//        }
//
//    }

