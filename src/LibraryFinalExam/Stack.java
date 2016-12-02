package LibraryFinalExam;

/**
 *
 * @author OscarNedzelsky   A00513376
 * 
 */

public class Stack <T> {
    //Atributes
    private Node top;
    private int size;
    
    //Constructor
    public Stack (){
        this.top = null;
        this.size = 0;
    }
    
    //Getters
    /**
     * 
     * @return stack's top
     */
    public Node getTop (){
        return top;
    }
    /**
     * 
     * @return stack's size
     */
    public int getSize (){
        return size;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    /**
     * Introduce un nuevo elemento a la pila
     * @param data node's info 
     */
    public void push (T data){
        Node node = new Node(data);
        if (isEmpty()){ //si la pila está vacía
            top = node;
        }else{ //Si la pila no está vacía
            node.setNext(top);
            top = node;
        }
        ++size;
    }
    /**
     * Elimina un elemento de la pila
     */
    public void pop (){
        if (!isEmpty()){
            top = top.getNext();
            --size;
        }else{
            System.out.println("La pila está vacía");
        }
    }
    /**
     * Vacía los elmentos de la pila
     */
    public void empty (){
        top = null;
        size = 0;
    }
    
    public void showStack(){
        if  (!isEmpty()){
        Node aux = top;
        do {
            System.out.println(aux.getData());
            System.out.println("|");
            System.out.println("V");
            aux=aux.getNext();
        }while (aux!= null);    
      }
        System.out.println("null");
    }
    
}