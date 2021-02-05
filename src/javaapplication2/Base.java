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
public class Base implements Square{
    public Player conquaredBy= new Player("");
    public String type="";
    int health;
    int coin_prise;
    Base(){
        coin_prise=5;
        this.type="base";
        this.health=100;
    }
    public  int getHealth(){
        return this.health;
    }
    public void attacked(Player attacked_by){
        this.health-=25;
        if(this.health==0){
            setPlayer(attacked_by);
        }
    }
    public Player getPlayer(){
        return this.conquaredBy;
    }
    public void setPlayer(Player attacked_by){
        this.conquaredBy=attacked_by;
    }
    public void setSoldier(Soldier s){
        
    }
}
