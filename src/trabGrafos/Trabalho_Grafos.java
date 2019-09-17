/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabGrafos;

import IUGrafos.IUPrincipal;
import Metodos.Controlador;
import static java.awt.SystemColor.control;

/**
 *
 * @author Gi Benvenuto
 */
public class Trabalho_Grafos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        IUPrincipal princ = new IUPrincipal();
        princ.setVisible(true);
        
        Controlador control = new Controlador();
        //control.lerArquivo("teste.txt");
        //control.conexoMatriz();
    }
    
}
