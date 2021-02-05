/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author denge
 */
public class Store {
    Soldier soldier;
    String ability;
    void buy(Soldier type,Player p){
        boolean afford =canAfford(p,type);
        if(afford ==true){
            this.soldier=type;
            //p.player_coins-=type.;
        }
    }
    boolean canAfford(Player p,Soldier type){
//        if(p.player_coins>=type.price){
//            return true;
//        }
        System.out.println("you dont have enough money");
        return false;
    }
}
