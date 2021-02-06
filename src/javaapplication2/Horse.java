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
public class Horse extends Soldier{

   public Horse() {
 this.power =30;
this.health = 30;
this.name="horse";
    this.Ability="";
   }
   public void addAbility(Strategy s){
       this.Ability=new Ability(s).CreateAbility();
   }
}


