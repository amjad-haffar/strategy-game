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
public class Farmer implements Strategy{
   
public String Ability;
public int Power;
public int Health;
public Farmer Create () {
    Ability = "no";
    Power =10;
    Health = 10;
    return this;
   }
}
