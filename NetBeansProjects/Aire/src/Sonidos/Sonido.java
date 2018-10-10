/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sonidos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Stalin
 */
public class Sonido implements Runnable{
    
    private Player sonidoMP3;
    private Thread hilo;
    private JFrame framePadre;
    private String ruta;
    
    public Sonido(JFrame framePadre, int numero){
        this.ruta = "src/Sonidos/sonido"+numero+".mp3";
        this.framePadre = framePadre;
    }
    
    
    

     public void play(){
         
        try {
            File archivoSonido = new File(ruta);
            FileInputStream FIS;
            FIS = new FileInputStream(archivoSonido);
            
             try {
                 sonidoMP3 = new Player(FIS);
                 
                 hilo = new Thread(this);
                 hilo.start();
                 
             } catch (JavaLayerException ex) {
                 JOptionPane.showMessageDialog(framePadre, ex.getMessage());
             }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(framePadre, ex.getMessage());
        }
     }
     
     
     public void Stop(){
         hilo.stop();
     }
     
     
    @Override
    public void run() {
        try {

            sonidoMP3.play();
        } 
        catch (JavaLayerException ex) {

            JOptionPane.showMessageDialog(framePadre, ex.getMessage());
        }
   }
}
