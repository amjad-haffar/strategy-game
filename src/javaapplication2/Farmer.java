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
public class Farmer extends Soldier{
public Farmer() {
    this.power =10;
    this.health = 10;
    this.name="farmer";
    this.Ability="";
   }
public void addAbility(Strategy s){
       this.Ability=new Ability(s).CreateAbility();
   }
}

