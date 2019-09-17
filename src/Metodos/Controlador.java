/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Gustavoo
 */
public class Controlador {

    public void createGraph() {
        Map graph = new HashMap<String, Node>();
        graph.put("I", new Node("I", new Point(2, 17)));
        graph.put("A", new Node("A", new Point(0, 15)));
        graph.put("B", new Node("B", new Point(2, 13)));
        graph.put("C", new Node("C", new Point(2, 9)));
        graph.put("D", new Node("D", new Point(0, 7)));
        graph.put("E", new Node("E", new Point(2, 6)));
        graph.put("G", new Node("G", new Point(2, 3)));
        graph.put("H", new Node("H", new Point(0, 1)));
        graph.put("K", new Node("K", new Point(2, 0)));
        graph.put("F", new Node("F", new Point(10, 0)));
        graph.put("W", new Node("W", new Point(7, 3)));
        graph.put("T", new Node("T", new Point(7, 6)));
        graph.put("S", new Node("S", new Point(7, 10)));
        graph.put("R", new Node("R", new Point(9, 10)));
        graph.put("Q", new Node("Q", new Point(9, 8)));
        graph.put("P", new Node("P", new Point(11, 8)));
        graph.put("U", new Node("U", new Point(14, 8)));
        graph.put("V", new Node("V", new Point(14, 6)));
        graph.put("L", new Node("L", new Point(7, 17)));
        graph.put("M", new Node("M", new Point(18, 0)));

        List aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("A"), 3));
        aux.add(new Aresta((Node) graph.get("B"), 4));
        aux.add(new Aresta((Node) graph.get("N"), 12));
        aux.add(new Aresta((Node) graph.get("L"), 5));
        Node n = (Node) graph.get("I");
        n.setActions((ArrayList<Aresta>) aux);

        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("B"), 3));
        n = (Node) graph.get("A");
        n.setActions((ArrayList<Aresta>) aux);

        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("C"), 4));
        aux.add(new Aresta((Node) graph.get("T"), 11));
        n = (Node) graph.get("B");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("D"), 3));
        aux.add(new Aresta((Node) graph.get("E"), 3));
        n = (Node) graph.get("C");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("E"), 2));
        n = (Node) graph.get("D");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("G"), 3));
        n = (Node) graph.get("E");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("H"), 3));
        aux.add(new Aresta((Node) graph.get("K"), 3));
        n = (Node) graph.get("G");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("K"), 2));
        n = (Node) graph.get("H");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("F"), 8));
        n = (Node) graph.get("K");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("W"), 8));
        aux.add(new Aresta((Node) graph.get("M"), 8));
        n = (Node) graph.get("F");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("T"), 3));
        n = (Node) graph.get("W");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("S"), 4));
        aux.add(new Aresta((Node) graph.get("V"), 7));
        n = (Node) graph.get("T");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("R"), 2));
        n = (Node) graph.get("S");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("Q"), 2));
        n = (Node) graph.get("R");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("P"), 2));
        n = (Node) graph.get("Q");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("N"), 3));
        aux.add(new Aresta((Node) graph.get("U"), 3));
        n = (Node) graph.get("P");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("V"), 2));
        n = (Node) graph.get("U");
        n.setActions((ArrayList<Aresta>) aux);
        
        aux = new ArrayList<Aresta>();
        aux.add(new Aresta((Node) graph.get("M"), 27));
        n = (Node) graph.get("L");
        n.setActions((ArrayList<Aresta>) aux);
    }
}
