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
public class Armed implements Strategy{
   
public String Ability;
public int Power;
public int Health;
   public Armed Create () {
     Ability = "no";
    Power =50;
    Health = 50;
return this;
   }
}
