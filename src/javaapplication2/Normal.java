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
public class Normal implements Strategy{
   
public String Ability;
public int Power;
public int Health;

public Normal Create () {
     Ability ="no";
 Power =20;
Health = 20;
return this;

   }
}