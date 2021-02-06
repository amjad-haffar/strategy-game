package javaapplication2;

import java.util.ArrayList;

public class Player {
    public int player_coins;
    public String player_name;
    public ArrayList<Soldier> player_soldires;
    //    private Square[] player_squares;
    Player(String name){
        this.player_soldires= new ArrayList<Soldier>();
        if(name!=""){
            this.player_coins=15;
        }else{
            this.player_coins=0;
        }
        this.player_name=name;
    }
}
