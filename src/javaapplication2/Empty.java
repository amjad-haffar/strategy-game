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
public class Empty implements Square{
    public Player conquaredBy= new Player("");
    public String type="";
    int health;
    int coin_prise;
    Empty(){
        coin_prise=2;
        this.type="empty";
        this.health=0;
    }
    public int getHealth(){
        return this.health;
    }
    public Player getPlayer(){
        return this.conquaredBy;
    }
    public void attacked(Player attacked_by){
        setPlayer(attacked_by);
    }
    public void setPlayer(Player attacked_by){
        this.conquaredBy=attacked_by;
    }
    public void setSoldier(Soldier s){
        
    }
}
