/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Gi
 */
public class GraphProblem extends Problem{
   
    public Map<String, Node> graph;

    /**
     *
     * @param initial
     * @param goal
     * @param graph
     */
    public GraphProblem(Node initial, Node goal, HashMap graph){
        super(initial, goal);
        this.graph = new HashMap<String, Node>();
    }

    @Override
    public ArrayList<Aresta> Actions(String state) {
        return graph.get(state).getActions();
    }


    @Override
    public Node result(String state, int action) {
        return this.graph.get(state).getActions().get(action).getDest();
    }

    @Override
    public int path_cost(int c, String state1, int action) {
        return c + this.graph.get(state1).getActions().get(c).getValor();
    }
}
