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
public class Ability {
   private Strategy strategy;

   public Ability(Strategy strategy){
      this.strategy = strategy;
   }

   public String CreateAbility(){
      return strategy.applyAbility();
   }
}