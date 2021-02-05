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
public class SquareMaker {
    public static Square[][] map = new Empty[10][10];
    Square withsol;
    Square empty;
    Square base;
    SquareMaker(){
        this.withsol= new WithSoldier();
        this.empty= new Empty();
        this.base= new Base();
    }
    public void changeToWithSoldier(int x, int y,Soldier s){
        withsol.setSoldier(s);
        map[x][y]= withsol;
    }
    public void changeToempty(int x, int y){
        map[x][y]= empty;
    }
    
    
}
