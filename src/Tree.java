public interface Tree<E extends Comparable<? super E>> {


    enum TraverseMode {
        IN_ORDER,
        PRE_ORDER,
        POST_ORDER

    }
     static boolean isBalanced(Node node) {
        return (node == null) ||
                isBalanced(node.leftChild) &&
                        isBalanced(node.rightChild) &&
                        Math.abs(height(node.leftChild) - height(node.rightChild)) <= 1;
    }

    static int height(Node node) {
        return node == null ? 0 : 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

    boolean isBalanced();

    void add(E value);

    boolean remove(E value);

    boolean find(E value);

    void display();

    boolean isEmpty();


   void traverse(TraverseMode traverseMode);
}
