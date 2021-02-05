package javaapplication2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    public static Square[][] map = new Square[100][100];
    public static Player[] players = new Player[8];

    Game() {
        for (int i = 0; i < 8; i++) {
            this.players[i] = new Player("sh7adat+amjad" + i);
        }
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                this.map[i][j] = new Square();
            }
        }
        int position = 0;
        for (int i = 0; i < 8; i++) {
            for (int row = 1 + position; row < 4 + position; row++) {
                this.map[row][0].conquaredBy = this.players[i];
                this.map[row][1].conquaredBy = this.players[i];
                if (row == 2 * i) {
                    this.map[row][1].type = "base";
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
        Scanner inputs= new Scanner(System.in);
        System.out.println("do you want to buy? 1/yes 0/no");
        int answare=inputs.nextInt();
        if(answare==1){
            System.out.println("select to buy : farmer 1 ,normal 2...");
            Store s= new Store();
            Soldier soldier=new Soldier();
            s.buy(soldier, p);
        }
        System.out.println("insert your move");
        String move=inputs.next();
    }
}
