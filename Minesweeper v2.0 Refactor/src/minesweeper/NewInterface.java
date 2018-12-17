/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minesweeper;

/**
 *
 * @author GytisLT
 */
public interface NewInterface {

    //dezuciu vietos, jei pelyte ant dezute, pagrazina i ir j, tai yra kurioj vietoj  dezute
    int inBoxX();

    int inBoxY();

    boolean inFlagger();

    boolean isN(int mX, int mY, int cX, int cY);

    //skaiciuoja atskleistas dezutes
    int totalBoxesRevealed();

    // tikrina visu minu skaiciu ir grazina rezultata
    int totalMines();
    
}
