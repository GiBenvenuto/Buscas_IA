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
public abstract class Problem {
    public Node initial;
    public Node goal;

    public Problem(Node initial, Node goal) {
        this.initial = initial;
        this.goal = goal;
    }
    
    public abstract ArrayList<Aresta> Actions (String state);
    
 //   public abstract int value (String state);
    
    public abstract Node result (String state, int action);
        
    public boolean goal_test(String state){
        if(state.equals((this.goal.getState())))
            return true;
        return false;
    }
    
    public abstract int path_cost(int c, String state1, int Action);   
      
    
}
