/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author denge
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Game game= new Game();
        for(int i=0;i<100;i++){
            if(game.map[i][1].conquaredBy.player_name!="")
                System.out.println(1);
            else System.out.println(0);
        }
//        game.startGame();
    
    } 
}
