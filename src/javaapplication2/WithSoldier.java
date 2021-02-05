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
public class WithSoldier implements Square{
    public Player conquaredBy= new Player("");
    public String type="";
    public Soldier soldier;
    int health;
    WithSoldier(Soldier s){
        this.type="withsoldier";
        this.health=10;
     this.soldier= s;
    }
    public int getHealth(){
        return this.health;
    }
    public void setSoldier(Soldier s){
        this.soldier=s;
    }
    public void setPlayer(Player attacked_by){
        this.conquaredBy=attacked_by;
    }
    public Player getPlayer(){
        return this.conquaredBy;
    }
    public void attacked(Player attacked_by){
        setPlayer(attacked_by);
    }
}
