package javaapplication2;

public class Player {
    public int player_coins;
    public String player_name;
    // private Soldier[] player_soldires;
    //    private Square[] player_squares;
    Player(String name){
        if(name!=""){
            this.player_coins=15;
        }else{
            this.player_coins=0;
        }
        this.player_name=name;
    }
}
