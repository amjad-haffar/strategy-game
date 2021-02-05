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
   
public String Ability;
public  int Power;
public int Health;

   public Horse Create () {
     Ability = "no";
 Power =30;
Health = 30;
return this;
   }
}

