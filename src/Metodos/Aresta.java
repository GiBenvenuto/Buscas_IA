/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author Gi Benvenuto
 */
public class Aresta implements Comparable<Aresta> {

    private Node dest;
    private int valor;

    public Aresta(Node dest, int valor) {
        this.dest = dest;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public Node getDest() {
        return dest;
    }

    public void setDest(Node dest) {
        this.dest = dest;
    }

    @Override
    public int compareTo(Aresta a) {
        if (this.valor > a.getValor()) {
            return 1;
        } else {
            return -1;
        }
    }
}
