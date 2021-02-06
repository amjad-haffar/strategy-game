/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author denge
 */
public class PlayTurn {
    public Player p;
    public int x_target;
    public int y_target;
    public int x_destination;
    public int y_destination;
    PlayTurn(Player p){
        this.p=p;
    }
    
    public void setTarget(int x, int y){
        this.x_target=x;
        this.y_target=y;
    }
    public void setDestination(int x, int y){
        this.x_destination=x;
        this.y_destination=y;
    }
    public void buy(){
        
        Scanner inputs= new Scanner(System.in);
        
                System.out.println("select to buy : farmer 1 ,normal 2,armed 3,lead 4");
                String soldier_answare=inputs.next();
                Store s= new Store();
                if(soldier_answare == "1"){
                    Soldier soldier=new Farmer();
                    p.player_soldires.add(soldier);
                }
                if(soldier_answare == "2"){
                    Soldier soldier=new Normal();
                    p.player_soldires.add(soldier);
                }
                if(soldier_answare == "3"){
                    Soldier soldier=new Armed();
                    p.player_soldires.add(soldier);
                }
                if(soldier_answare == "4"){
                    Soldier soldier=new Lead();
                    p.player_soldires.add(soldier);
                }
                if(p.player_coins!=0){
                    System.out.println("do you want to buy ability? 1/yes 0/no");
                    int answare2=inputs.nextInt();
                    if(answare2==1){
                        System.out.println("select to buy : hammer 1 ,healing 2,fly 3");
                        String ability_answare=inputs.next();
                        Strategy ab = null;
                        if(ability_answare == "1"){
                            ab=new Hammer();
                        }
                        if(ability_answare == "2"){
                            ab=new Healing();
                        }
                        if(ability_answare == "3"){
                            ab=new FlyAttack();
                        }
                        System.out.println("apply on");
                        for(int i=0; i<p.player_soldires.size();i++){
                            if(p.player_soldires.get(i).Ability==""){
                                System.out.print(" i "+p.player_soldires.get(i).name);
                            }
                        }
                        int sss=Integer.parseInt(inputs.next());
                        p.player_soldires.get(sss).addAbility(ab);
                    }
            }
    }
    public void move(){
        
    }
    public void flyMove(){
        
    }
    public void attack(){
        
    }
    public void flyAttack(){
        
    }
    public void placeSoldier(){
        
    }
}
