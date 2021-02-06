package javaapplication2;

import java.util.ArrayList;

public class Player {
    public int player_coins;
    public String player_name;
    public ArrayList<Soldier> player_soldires;
    public ArrayList<Square> player_squares;
    Player(String name){
        if(name!=""){
            this.player_soldires= new ArrayList<Soldier>();
            this.player_squares= new ArrayList<Square>();
            this.player_coins=15;
        }else{
            this.player_coins=0;
        }
        this.player_name=name;
    }
    void addPlayer_square(Square s){
        this.player_squares.add(s); 
    }
    void addSoldier(Soldier s){
        this.player_soldires.add(s);
    }
}
