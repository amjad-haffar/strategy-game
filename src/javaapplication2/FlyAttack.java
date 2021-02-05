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
public class FlyAttack implements Strategy{
    public int price=20;
    public Strategy applyAbility(){
        return this;
    }
}
