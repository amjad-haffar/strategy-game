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
public class Healing implements Strategy{
    public int price=5;
    public String applyAbility(){
        return "Heal";
    }
    public int getPrice(){
        return this.price;
    }
    
}
