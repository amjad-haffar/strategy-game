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
    void buySoldier(Soldier type,Player p){
        boolean afford =canAfford(p,type.price);
        if(afford ==true){
            this.soldier=type;
            p.player_coins-=type.price;
        }
    }
    void buyAbility(Player p,Strategy ab){
        boolean afford =canAfford(p,ab.getPrice());
        if(afford ==true){
            this.soldier.Ability= ab.applyAbility();
            p.player_coins-=ab.getPrice();
        }
    }
    boolean canAfford(Player p,int price){
        if(p.player_coins>=price){
            return true;
        }
        System.out.println("you dont have enough money");
        return false;
    }
}
