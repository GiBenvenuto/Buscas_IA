package Metodos;



import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Gi
 */
public class Node extends Object{
    private String state;
    private Node parent;
    private ArrayList<Aresta> action;
    private int path_cost;
    private int depth;
    private Point p;

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Node(String state, Point p) {
        this.state = state;
        this.p = p;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
        this.depth = this.parent.getDepth() + 1;
    }

    public ArrayList<Aresta> getActions() {
        return action;
    }

    public void setActions(ArrayList<Aresta> action) {
        this.action = action;
    }

    public int getPath_cost() {
        return path_cost;
    }

    public void setPath_cost(int path_cost) {
        this.path_cost = path_cost;
    }

    public int getDepth() {
        return depth;
    }

    
    
    
}
