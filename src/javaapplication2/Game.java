
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
            this.players[i] = new Player("sh7adat+amjad+Ghaith" + i);
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
                this.players[i].addPlayer_square(SquareMaker.map[row][0]);
                SquareMaker.map[row][1].setPlayer(this.players[i]); 
                this.players[i].addPlayer_square(SquareMaker.map[row][1]);
                if (row == 2 * i) {
                    SquareMaker.map[row][1] = new Base();
                    SquareMaker.map[row][1].setPlayer(this.players[i]);
                    SquareMaker.map[row][0] = new WithSoldier(new Normal());
                    SquareMaker.map[row][0].setPlayer(this.players[i]);
                    this.players[i].addSoldier(new Normal());
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
            int answare=inputs.nextInt();
            if(answare==1){
                turn.buy();
            }
            
        System.out.println("select wich soldier you want to move");
        for(int i=0; i<p.player_soldires.size();i++){
            System.out.print(" i "+p.player_soldires.get(i).name);
        }
        int read_Soldier=Integer.parseInt(inputs.next());
        if(p.player_soldires.get(read_Soldier).Ability== "anywhere"){
            System.out.println("where you want to fly?");
        }else{
            System.out.println("choose 1 up ,2 right,3 down ,4 left ");
            String direction =inputs.next();
        }
        }
    }
}
