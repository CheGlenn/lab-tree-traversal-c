import java.io.PrintWriter;

/**
 * A place to experiment with binary trees.
 */
public class BinaryTreeExperiment {
  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);

    String[] strings = {"aardvark", "billygoat", "chinchilla", "dingo", "emu",
        "frog", "gnu", "hippo", "iguana", "jackalope", "koala", "llama"};
    BinaryTree<String> tree = new BinaryTree<String>(strings);

    Integer[] ints = {1, 3, 9, 6, 4, 8, 10, 11, 2};

    BinaryTree<Integer> numTree = new BinaryTree<Integer>(ints);

    tree.elements01(pen);

    pen.close();

  } // main
} // class BinaryTreeExperiment
