package javaapplication2;

public class Square {
    public Player conquaredBy;
    public String type;
    Square(){
        this.conquaredBy= new Player("");
        this.type="empty";
    }
    // when another player conquare this square
    public void setName(Player name) {
        this.conquaredBy = name;
    }
    // example: when a soldier placed in an empty square 
    public void setType(String type) {
        this.type = type;
    }
}
