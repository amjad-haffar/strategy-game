package javaapplication2;

public class Soldier {
   public int health;
   private Strategy strategy;

   public Soldier(Strategy strategy){
      this.strategy = strategy;
   }

   public Strategy CreateSoldier(){
      return strategy.Create();
   }
}
