package LibraryFinalExam;

/**
 *
 * @author OscarNedzelsky   A00513376
 */

public class BinaryTree{
    NodeTree root;
    int height;
    int elements;
    
    public BinaryTree(){
        this.root=null;
        this.height=-1;
        this.elements=0;
    }
    
    public boolean isEmpty(NodeTree root){
        return root.left == null && root.right == null;
    }
    
    public void insert (int data, NodeTree root){
        NodeTree node = new NodeTree(data);
        //Si está vacio
        if (isEmpty(root)){
            root = node;
            this.height++;
        }else{ //Si no está vacio 
            //Si el nodo es mayor que raiz
            if(root.data <= node.data){
                //Si no tiene elementos a la izq.
                if (root.left==null){ //Caso Base
                    root.left=node;
                }else{//Si tiene un elemento a la izq.
                    //Buscará por la izquierda hasta encontrar un espacio.
                    insert(data,root.left);
                }
            } else { //Si no es mayor que raiz
                if(root.right == null){ //Caso Base
                    root.right=node;
                }else{//Si tiene un elemento a la derecha.
                    //Buscará por la derecha hasta encontrar un espacio
                    insert(data,root.right);
                }
            }
        }
        this.elements++;
    }
    
}