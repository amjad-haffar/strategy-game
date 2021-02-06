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
public class Lead extends Soldier{
public Lead() {
     this.power =110;
     this.health = 110;
     this.name="Lead";
    this.Ability="";
    
   }
public void addAbility(Strategy s){
       this.Ability=new Ability(s).CreateAbility();
   }
}

