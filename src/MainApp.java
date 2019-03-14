import java.util.Random;


public class MainApp {


    public static void main(String[] args) {


        Random random = new Random();

        int treeCount = 20;
        int maxLevel = 4;
        int maxValue = 20;
        int nodeCount = (int) (Math.pow(2, maxLevel) - 1);

        boolean treeView = false;
        int balancedTreeCount = 0;

        for (int i = 0; i < treeCount; i++) {

            Tree<Integer> tree = new TreeImpl<>(maxLevel);
            initTree(random, nodeCount, maxValue, tree);
            if (tree.isBalanced()) {
                balancedTreeCount++;
                if (!treeView) {
                    treeView = true;
                    tree.display();
                }

            }
        }


 System.out.println("Balanced Tree Count = " + ((balancedTreeCount / (treeCount * 1.0)) * 100) + "%");
}
    private static void initTree(Random random, int nodeCount, int maxValue, Tree<Integer> tree) {
        for (int j = 0; j < nodeCount; j++) {
            tree.add(random.nextInt(maxValue * 2 + 1) - maxValue);
        }
    }


}