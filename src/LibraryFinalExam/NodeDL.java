package LibraryFinalExam;

/**
 *
 * @author OscarNedzelsky   A00513376
 * 
 */

public class NodeDL<T> {
        //Atributes
    private T data;
    private NodeDL next;
    private NodeDL prev;
    
    //Constructor
    public NodeDL (T data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    
    /**
     * 
     * @param data 
     */
    public void setData (T data){
        this.data = data;
    }
    
    /**
     * 
     * @return data
     */
    public T getData (){
        return this.data;
    }
    
    /**
     * 
     * @param node
     */
    public void setNext (NodeDL node){
        this.next=node;
    }
    
    /**
     * 
     * @return next node
     */
    public NodeDL getNext (){
        return this.next;
    }
    
    /**
     * 
     * @param node
     */
    public void setPrev (NodeDL node){
        this.prev = node;
    }
    
    /**
     * 
     * @return previous node
     */
    public NodeDL getPrev (){
        return this.prev;
    }
}
