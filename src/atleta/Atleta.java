/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atleta;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import swing.Home;

/**
 *
 * @author diego
 */
public class Atleta extends Thread {

    private JLabel jLabel;
    private Home home;
    private String nombre;

    public Atleta(JLabel jLabel, Home home) {
        this.jLabel = jLabel;
        this.home = home;
    }

    public Atleta(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {

        int potatoVaticane;

        Integer contador = 0;

        /*----------
        while (true) {
            try {

                Thread.sleep(50);

                potatoVaticane = home.getPotatoVaticane().getLocation().x;

                jLabel.setLocation(jLabel.getLocation().x + random(10), jLabel.getLocation().y);

                if (potatoVaticane <= home.getMeta().getLocation().x - 15) {

                    jLabel.setLocation(jLabel.getLocation().x + random(10), jLabel.getLocation().y);
                    contador++;
                    home.repaint();

                } else {

                    System.out.println(this.getName() + contador);
                    break;

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*///END WHILE */
        int macdonalsTrump;
        int norrisGod;
        int AlbertGodOfGod;

        while (true) {
            try {
                // try {

                Thread.sleep(50);
                potatoVaticane = home.getPotatoVaticane().getLocation().x;
                norrisGod = home.getNorrisGod().getLocation().x;
                AlbertGodOfGod = home.getGodRelativity().getLocation().x;
                macdonalsTrump = home.getMacdonals().getLocation().x;

                jLabel.setLocation(jLabel.getLocation().x + random(10), jLabel.getLocation().y);

                if (potatoVaticane < home.getMeta().getLocation().x
                        && norrisGod < home.getMeta().getLocation().x
                        && AlbertGodOfGod < home.getMeta().getLocation().x
                        && macdonalsTrump < home.getMeta().getLocation().x) {

                    jLabel.setLocation(jLabel.getLocation().x + random(10), jLabel.getLocation().y);

                    home.repaint();

                } else {

                    System.out.println("****: " + getName());
                    break;
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
            }
        }//END WHILE 
    }

    private int random(int random) {
        return (int) (Math.random() * random);
    }

}

/*
potatoVaticane < home.getMeta().getLocation().x - 50
                        && norrisGod < home.getMeta().getLocation().x - 50
                        && AlbertGodOfGod < home.getMeta().getLocation().x - 50
                        && macdonalsTrump < home.getMeta().getLocation().x - 50











   /*
                if (potatoVaticane < home.getMeta().getLocation().x - 100
                || norrisGod < home.getMeta().getLocation().x - 100
                || AlbertGodOfGod < home.getMeta().getLocation().x - 100
                || macdonalsTrump < home.getMeta().getLocation().x - 100) {
                
                jLabel.setLocation(jLabel.getLocation().x + random(10), jLabel.getLocation().y);
                
                home.repaint();
                
                } else {
                break;
                }
                
                } catch (Exception e) {
                
                System.out.println(e);
                }*/
