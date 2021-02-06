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
public class Armed extends Soldier{
   public Armed() {
    this.power =50;
    this.health = 50;
    this.name="armed";
    this.Ability="";
   }
   public void addAbility(Strategy s){
       this.Ability=new Ability(s).CreateAbility();
   }
}
