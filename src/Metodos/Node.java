/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.buscas;

import java.util.ArrayList;

/**
 *
 * @author Gi
 */
public class Node {
    private String state;
    private Node parent;
    private ArrayList<Node> action;
    private int path_cost;
    private int depth;

    public Node(String state, Node parent, ArrayList<Node> action, int path_cost) {
        this.state = state;
        this.parent = parent;
        this.action = action;
        this.path_cost = path_cost;
        if (this.parent != null){
            this.depth = this.parent.getDepth() + 1;
        }
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
    }

    public ArrayList<Node> getActions() {
        return action;
    }

    public void setActions(ArrayList<Node> action) {
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

    public void setDepth(int depth) {
        this.depth = depth;
    }
    
    
}
