/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.ArrayList;

/**
 *
 * @author Gi
 */
public class GraphProblem extends Problem{
    public Node initial;
    public Node goal;

    /**
     *
     * @param initial
     * @param goal
     */
    public GraphProblem(Node initial, Node goal, ) {
        this.initial = initial;
        this.goal = goal;
    }
    
    /**
     *
     * @param state
     * @return
     */
    @Override
    public ArrayList<Node> Actions (Node state){
        return state.getActions();
    }

    @Override
    public int value(String state) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Node result(String state, Node action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int path_cost(int c, String state1, Node Action, String state2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
