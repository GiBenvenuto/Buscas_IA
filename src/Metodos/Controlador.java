/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Gustavoo
 */
public class Controlador {
    private static Matriz matriz;
    private static Lista lista;

    public int getMatriz() {
        return matriz.getQtdVertices();
    }


    public int getLista() {
        return lista.getQrdvertices();
    }

    
    public boolean lerArquivo(String nome){
        int v[] = new int[3];
        int cont = 0 ,i ,j;
        String aux;
        aux = "";
        
        
        try{
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            
            String linha1 = lerArq.readLine();
            String linha2 = lerArq.readLine();
            matriz = new Matriz(Integer.valueOf(linha2), Short.valueOf(linha1));
            lista = new Lista(Integer.valueOf(linha2), Short.valueOf(linha1));
            
            linha1 = lerArq.readLine();
            while(linha1 != null){
                cont = 0;
                for(i = 0; i<linha1.length(); i++){
                    
                    for(j = i; j<linha1.length() && linha1.charAt(j) != ' '; j++){
                         aux += linha1.charAt(j);
                    }
                    if(aux != ""){
                        v[cont] = Integer.valueOf(aux);
                        cont = cont+1;
                        aux = "";
                        i = j;
                    }
                }
                matriz.addAdjacencia(v[0], v[1], v[2]);
                lista.addAdjacencia(v[0], v[1], v[2]);
                linha1 = lerArq.readLine();
            }
        }
        catch(IOException e){
            
            return false;
        }
        return true;
        
    }
    
    public short getEstrutura(){
        return matriz.getEstrutura();
    }
    
    public int[][] buscaProfundidadeMatriz(int noRaiz){
       
        return matriz.buscaProfundidade(noRaiz);
      
    }
    
    public int[][] buscaProfundidadeLista(int noRaiz){
        
        return lista.buscaProfundidade(noRaiz);
       
    }
    
    public ArrayList buscaLarguraMatriz (int vert){
        return matriz.buscaLargura(vert);
    }
    
    public ArrayList buscaLarguraLista (int vert){
        return lista.buscaLargura(vert);
    }
    
    public int[] recuperaDistanciaMatriz (){
        return matriz.recuperDistanciaLargura();
    }
    
    public int[] recuperaDistanciaLista (){
        return lista.recuperDistanciaLargura();
    }    
    
    public int[][] PrimMatriz(int vertice){
         ArrayList<Aresta> aux;
        int[][] m;
        
        aux = matriz.AGM_Prim(vertice);
        
        m = new int [aux.size()][3];
        for (int i = 0; i< aux.size(); i++){
            m[i][0] = aux.get(i).getV1();
            m[i][1] = aux.get(i).getV2();
            m[i][2] = aux.get(i).getValor();
        }
        
        return m;
    }
    
    public int[][] PrimLista (int vertice){
         ArrayList<Aresta> aux;
        int[][] m;
        
        aux = lista.AGM_Prim(vertice);
        
        m = new int [aux.size()][3];
        for (int i = 0; i< aux.size(); i++){
            m[i][0] = aux.get(i).getV1();
            m[i][1] = aux.get(i).getV2();
            m[i][2] = aux.get(i).getValor();
        }
        
        return m;
    }
    
    public int[][] KruskalMatriz (){
        ArrayList<Aresta> aux;
        int[][] m;
        
        aux = matriz.Kruskal();
        
        m = new int [aux.size()][3];
        for (int i = 0; i< aux.size(); i++){
            m[i][0] = aux.get(i).getV1();
            m[i][1] = aux.get(i).getV2();
            m[i][2] = aux.get(i).getValor();
        }
        
        return m;
        
    }
    
     public int[][] KruskalLista (){
        ArrayList<Aresta> aux;
        int[][] m;
        
        aux = lista.Kruskal();
        
        m = new int [aux.size()][3];
        for (int i = 0; i< aux.size(); i++){
            m[i][0] = aux.get(i).getV1();
            m[i][1] = aux.get(i).getV2();
            m[i][2] = aux.get(i).getValor();
        }
        
        return m;
        
    }
    
    public ArrayList DijkstraMatriz(int vertice){
        return matriz.caminhaMinimoDijkstra(vertice);
    }
    
    public ArrayList DijkstraLista (int vertice){
        return lista.caminhaMinimoDijkstra(vertice);
    }
    
    public boolean BellManFordMatriz(int vertice){
        return matriz.caminhoMinimoBellmanFord(vertice);
    }
    
    public boolean BellManFordLista (int vertice){
        return lista.caminhoMinimoBellmanFord(vertice);
    }
    
    public ArrayList recuperaBellManFordLista(int vertice){
        return lista.recuperaCaminhosBellmanFord(vertice);
    }
    
    public ArrayList recuperaBellManFordMatriz(int vertice){
        return matriz.recuperaCaminhosBellmanFord(vertice);
    }
    
    public String caminhoProfundidadeMatriz(int u, int v){
        return matriz.caminhoProfundidade(u, v);
    }
    
    public String caminhoLarguraMatriz(int u, int v){
        return matriz.caminhoLargura(u, v);
    }
    
     public String caminhoProfundidadeLista(int u, int v){
        return lista.caminhoProfundidade(u, v);
    }
    
    public String caminhoLarguraLista(int u, int v){
        return lista.caminhoLargura(u, v);
    }
    
    public int[][] conexoMatriz(){
        return matriz.verificaConexo();
    }
    
    public int[][] conexoLista(){
        return lista.verificaConexo();
    }
}
