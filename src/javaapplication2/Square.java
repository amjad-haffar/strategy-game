package javaapplication2;



public interface Square {
    public int getHealth();
    public void setPlayer(Player name);
    public void setSoldier(Soldier s);
    public Player getPlayer();
    public void attacked(Player attacked_by);
}
