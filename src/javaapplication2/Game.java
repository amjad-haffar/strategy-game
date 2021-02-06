
package javaapplication2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javaapplication2.Base;
import javaapplication2.Empty;
import javaapplication2.SquareMaker;

public class Game {
    public static Player[] players = new Player[2];
    Game() {
        for (int i = 0; i < 2; i++) {
            this.players[i] = new Player("sh7adat+amjad" + i);
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                SquareMaker.map[i][j] = new Empty();
            }
        }
        int position = 0;
        for (int i = 0; i < 2; i++) {
            for (int row = 1 + position; row < 4 + position; row++) {
                SquareMaker.map[row][0].setPlayer(this.players[i]); 
                SquareMaker.map[row][1].setPlayer(this.players[i]); ;
                if (row == 2 * i) {
                    SquareMaker.map[row][1] = new Base();
                }
            }
            position += 4;
        }
    }

    public void startGame() {
        while (true) {
            for( int i=0; i<8;i++){
                playturn(this.players[i]);
            }
        }
    }
    void playturn(Player p){
        PlayTurn turn= new PlayTurn(p);
        Scanner inputs= new Scanner(System.in);
        if(p.player_coins!=0){
            System.out.println("do you want to buy soldier? 1/yes 0/no");
            turn.buy();
        }
        System.out.println("insert your move");
        String move=inputs.next();
    }
}
