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
public class Normal extends Soldier{
   

public Normal() {
 this.power =20;
this.health = 20;
this.name="normal";
    this.Ability="";
   }
public void addAbility(Strategy s){
       this.Ability=new Ability(s).CreateAbility();
   }
}
