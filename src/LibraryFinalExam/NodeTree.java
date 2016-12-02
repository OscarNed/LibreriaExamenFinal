package LibraryFinalExam;

/**
 *
 * @author OscarNedzelsky   A00513376
 */

public class NodeTree <T>{
    int data;
    NodeTree left;
    NodeTree right;

    public NodeTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
