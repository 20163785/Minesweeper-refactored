/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

import java.util.Random;
import javax.swing.JFrame;

/**
 *
 * @author GytisLT
 */
public class Superclass extends JFrame {
    
    //GUI bus atidaromas JFrame metodu
    public boolean resetter = true; //grazinama ar programos nestabdyt laimejus ar pralaimejus
    public boolean flagger = false; //grazina, jog jei true, veliavos uzdejimo funkcija veikia visada
    int spacing = 10; //tarpai tarp langeliu pixeliais matuojami
    int neighs = 0;
    public int mx = -100; //koordinates
    public int my = -100;
    public int flaggerX = 445; //veliavos vieta
    public int flaggerY = 5;
    public int flaggerCenterX = flaggerX + 35; //veliavos centras
    public int flaggerCenterY = flaggerY + 35;
    Random rand = new Random();
    int[][] mines = new int[16][9]; //sukuriamas masyvas, kiek bus kvadrateliu x ir y asyje
    int[][] neighbours = new int[16][9]; //kaimyna
    boolean[][] revealed = new boolean[16][9]; //masyvas, kuriame aprasyta, kuriuose langeliuose pasizymes pele nuvedus
    boolean[][] flagged = new boolean[16][9]; //masyvas, kuriame aprasyta, kuriuose langeliuose pasizymes veliava

    public Superclass() {
    }
    
}
