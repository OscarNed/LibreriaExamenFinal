package LibraryFinalExam;

/**
 *
 * @author OscarNedzelsky   A00513376
 */
class Edge {
    int dest;
    double weight;
    
    Edge (int d, double w){
        this.dest=d;
        this.weight=w;
    }
    
    public String toString (){
        return this.dest +"("+this.weight+")";
    }
    
}