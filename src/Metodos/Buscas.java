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
public class Buscas {

    public GraphProblem graph;

    public Buscas(GraphProblem graph) {
        this.graph = graph;
    }

    public Node depth_first_search() {
        Node frontier = this.graph.initial;
        ArrayList<Node> explored = new ArrayList();
        Node no;

        while (frontier != null) {
            no = frontier.getActions().remove(0).getDest();
            if (this.graph.goal_test(no.getState())) {
                return no;
            }
            explored.add(no);
            for (Aresta a : no.getActions()) {
                if (!explored.contains(a.getDest()) && a.getDest() != frontier) {
                    frontier = a.getDest();
                    break;
                }
            }
        }
        return null;
    }

    public Node breadth_first_search() {
        Node no = this.graph.initial;
        ArrayList<Node> explored = new ArrayList();

        if (this.graph.goal_test(no.getState())) {
            return no;
        }
        ArrayList<Node> frontier = new ArrayList();
        frontier.add(no);

        while (frontier != null) {
            no = frontier.remove(0);
            explored.add(no);
            for (Aresta a : no.getActions()) {
                if (!explored.contains(a.getDest()) && !frontier.contains(a.getDest())) {
                    if (this.graph.goal_test(a.getDest().getState())) {
                        return a.getDest();
                    }
                    frontier.add(a.getDest());
                }
            }
        }
        return null;

    }
    

}
